package cn.test;

import java.util.HashSet;
import java.util.Set;

import cn.dayutianfei.dao2.IfileParams;
import cn.dayutianfei.dao2.Ifiles;
import cn.dayutianfei.dao2.IfilesDAO;

public class Main {
public static void main(String[] args) {
	IfileParams params = new IfileParams();
	Set<IfileParams> par = new HashSet<IfileParams>();
	params.setFileKey("xx");
	params.setFileValues("test测试");
	par.add(params);
	Ifiles file = new Ifiles();
	file.setFileName("xxx");
	file.setFileType("xx");
	file.setFileLocation("xxx");
	file.setFileRecordNumber(20l);
	file.setFileBytes(20l);
	file.setFileStatus((short)1);
	file.setIfileParamses(par);
	IfilesDAO dao = new IfilesDAO();
	dao.getSession().getTransaction().begin();
	dao.save(file);
	dao.getSession().getTransaction().commit();
	for(Object temp : dao.findAll()){
		System.out.println(((Ifiles)temp).getFileId());
	}
}
}
