package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager_과제 implements Program_과제{

	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - Program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로
	 * - 학생 추가시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가  
	 * */
	
	ArrayList<Student_과제> stdList = new ArrayList<Student_과제>();
	
	@Override
	public void printStudent() {
		testAdd();
		System.out.println(stdList);
		
	}

	@Override
	public void insertStudent(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudent(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerSubject(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSuject(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	public void testAdd() {
		stdList.add(new Student_과제("홍길동","1212","교양",2222));
		stdList.add(new Student_과제("감나빗","1234","전공",1111));
		stdList.add(new Student_과제("나얼","3131","전공",1111));
		stdList.add(new Student_과제("경서","2121","교양",2222));
	}
	
}
