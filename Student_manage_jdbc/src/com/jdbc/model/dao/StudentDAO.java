package com.jdbc.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class StudentDAO {
	
	private static StudentDAO dao;
	private Properties sql;
	
	private StudentDAO() {}
	public static StudentDAO getDAO() {
		if(dao == null)dao = new StudentDAO();
		return dao;
	}
	{
		String path = StudentDAO.class.getResource("/sql/student.properties").getPath();
		try(FileReader fReader = new FileReader(path)){
			sql.load(fReader);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
