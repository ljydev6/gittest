package com.jdbc.controller;

import com.jdbc.service.StudentService;
import com.jdbc.view.MainView;

public class StudentController {
	private static StudentController controller;
	private StudentController() {}
	public static StudentController getController() {
		if(controller == null) controller = new StudentController();
		return controller;
	}
	
	private MainView view = MainView.getView();
	private StudentService service = StudentService.getService();
	
	public void mainMenu() {
		view.mainMenu();
	}
	
	public void insertStudent() {
		
	}
	public void updateStudent() {
		
	}
	public void deleteStudent() {
		
	}
	public void selectStudentAll() {
		
	}
	public void selectStudentByName() {
		
	}
	public void selectStudentByAge() {
		
	}
	
}
