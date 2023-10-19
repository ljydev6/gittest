package com.jdbc.service;

import com.jdbc.model.dao.StudentDAO;

public class StudentService {
	private static StudentService service;
	private StudentService() {}
	public static StudentService getService() {
		if(service == null) service = new StudentService();
		return service;
	}
	
	private StudentDAO dao = StudentDAO.getDAO();
}
