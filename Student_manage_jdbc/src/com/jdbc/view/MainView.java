package com.jdbc.view;

import java.util.List;
import java.util.Scanner;

import com.jdbc.controller.StudentController;
import com.jdbc.model.dto.StudentDTO;

public class MainView {
	
	private static MainView view;
	private MainView() {}
	public static MainView getView() {
		if(view == null) view = new MainView();
		return view;
	}
	
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		StudentController controller = StudentController.getController();
		while(true) {
			System.out.println("==== 학생관리프로그램 v1.5withJDBC ====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생수정");
			System.out.println("3. 학생삭제");
			System.out.println("4. 학생조회");
			System.out.println("5. 이름으로 조회");
			System.out.println("6. 나이로 조회");
			System.out.println("0. 프로그램종료");
			System.out.print("입력 : ");
			int cho = sc.nextInt();
			sc.nextLine();
			switch(cho) {
				case 1: controller.insertStudent(); break;
				case 2: controller.updateStudent(); break;
				case 3: controller.deleteStudent(); break;
				case 4: controller.selectStudentAll(); break;
				case 5: controller.selectStudentByName(); break;
				case 6: controller.selectStudentByAge(); break;
				case 0: return;
				default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public StudentDTO insertStudent() {
		return StudentDTO.builder().build();
	}
	
	public StudentDTO updateStudent() {
		return StudentDTO.builder().build();
	}
	
	public StudentDTO deleteStudent() {
		return StudentDTO.builder().build();
	}
	
	public String searchStudent() {
		return "";
	}
	
	public void printStudent(StudentDTO student) {
		if(student != null)System.out.println(student);
		else System.out.println("검색된 학생이 없습니다.");
	}
	
	public void printStudent(List<StudentDTO> students) {
		if(students.size()>0) students.forEach(t -> System.out.println(t));
		else System.out.println("검색된 학생이 없습니다.");
	}
	
}
