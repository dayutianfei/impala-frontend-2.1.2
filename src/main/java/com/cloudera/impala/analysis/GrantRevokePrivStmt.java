// Copyright 2014 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.impala.analysis;

import com.cloudera.impala.catalog.Role;
import com.cloudera.impala.common.AnalysisException;
import com.cloudera.impala.thrift.TGrantRevokePrivParams;
import com.cloudera.impala.thrift.TPrivilege;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

/**
 * Represents a "GRANT/REVOKE PRIVILEGE" statement.
 * All privilege checks on catalog objects are skipped when executing
 * GRANT/REVOKE statements. This is because we need to be able to create
 * privileges on an object before any privileges actually exist.
 * The GRANT/REVOKE statement itself will be authorized (currently by
 * the Sentry Service).
 */
public class GrantRevokePrivStmt extends AuthorizationStmt {
  private final PrivilegeSpec privilegeSpec_;
  private final String roleName_;
  private final boolean isGrantPrivStmt_;
  private final boolean hasGrantOpt_;

  // Set/modified during analysis
  private Role role_;

  public GrantRevokePrivStmt(String roleName, PrivilegeSpec privilegeSpec,
      boolean isGrantPrivStmt, boolean hasGrantOpt) {
    Preconditions.checkNotNull(privilegeSpec);
    Preconditions.checkNotNull(roleName);
    privilegeSpec_ = privilegeSpec;
    roleName_ = roleName;
    isGrantPrivStmt_ = isGrantPrivStmt;
    hasGrantOpt_ = hasGrantOpt;
  }

  public TGrantRevokePrivParams toThrift() {
    TGrantRevokePrivParams params = new TGrantRevokePrivParams();
    params.setRole_name(roleName_);
    params.setIs_grant(isGrantPrivStmt_);
    TPrivilege privilege = privilegeSpec_.toThrift();
    privilege.setRole_id(role_.getId());
    privilege.setHas_grant_opt(hasGrantOpt_);
    params.setPrivileges(Lists.newArrayList(privilege));
    return params;
  }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder(isGrantPrivStmt_ ? "GRANT " : "REVOKE ");
    if (!isGrantPrivStmt_ && hasGrantOpt_) sb.append("GRANT OPTION FOR ");
    sb.append(privilegeSpec_.toSql());
    sb.append(isGrantPrivStmt_ ? " TO " : " FROM ");
    sb.append(roleName_);
    if (isGrantPrivStmt_ && hasGrantOpt_) sb.append(" WITH GRANT OPTION");
    return sb.toString();
  }

  @Override
  public void analyze(Analyzer analyzer) throws AnalysisException {
    super.analyze(analyzer);
    if (Strings.isNullOrEmpty(roleName_)) {
      throw new AnalysisException("Role name in GRANT/REVOKE privilege cannot be " +
          "empty.");
    }
    role_ = analyzer.getCatalog().getAuthPolicy().getRole(roleName_);
    if (role_ == null) {
      throw new AnalysisException(String.format("Role '%s' does not exist.", roleName_));
    }
    privilegeSpec_.analyze(analyzer);
  }
}