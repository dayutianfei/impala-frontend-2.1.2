package cn.ac.iie.impala.catalog.hibernate;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

import cn.ac.iie.impala.catalog.hibernate.impl.IFileParams;
import cn.ac.iie.impala.catalog.hibernate.impl.IFiles;
import cn.ac.iie.impala.catalog.hibernate.impl.IFilesDAO;

public class Main {
public static void main(String[] args) {
	IFileParams params = new IFileParams();
	Set<IFileParams> par = new HashSet<IFileParams>();
	params.setFileKey("xx");
	params.setFileValues("test测试");
	par.add(params);
	IFiles file = new IFiles();
	file.setFileName("xxx");
	file.setFileType("xx");
	file.setFileLocation("xxx");
	file.setFileRecordNumber(20l);
	file.setFileBytes(20l);
	file.setFileStatus((short)1);
	file.setIfileParamses(par);
	IFilesDAO dao = new IFilesDAO();
	dao.getSession().getTransaction().begin();
	dao.save(file);
	dao.getSession().getTransaction().commit();
	for(Object temp : dao.findAll()){
	    String content = ((IFiles)temp).getIfileParamses().iterator().next().getFileValues();
//	    System.out.println(content);
	    String xx = null;
        try {
            xx = new String(content.getBytes(), "utf-8");
        }
        catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		System.out.println(xx);
	}
}
}
