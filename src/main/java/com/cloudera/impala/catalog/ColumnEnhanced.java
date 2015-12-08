package com.cloudera.impala.catalog;

/**
 * 本类的作用是在不改变Column作用的前提下，记录那些增加、删除、修改的列信息
 * Column中记录的是当前有效的列，保持与原生态的兼容性
 * 
 * @author dayutianfei
 *
 */
public class ColumnEnhanced extends Column {

    public boolean enabled_; // 是否启用
    
    //TODO 范围设定为多少？
    public byte id_; // 唯一标识，按照历史顺序递增，从0开始
    public byte version; // 每次修改+1，从0开始
    
    public ColumnEnhanced(String name, Type type, int position) {
        super(name, type, position);
    }

}
