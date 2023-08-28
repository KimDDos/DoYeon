package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 클래스 객체 생성(2명)
		// 값을 입력후 정보출력
		Scanner sc = new Scanner(System.in);
		String[] info = new String[5];
		int age = 0;
		int id = 0;
		String name;
		String adr;
		String phon;
		
		
		System.out.println("> 학생 정보를 입력해주세요. <");
		System.out.println("학생 이름을 입력해주세요");
		name = sc.nextLine();
		System.out.println("학생 나이을 숫자로 입력해주세요");
		age = sc.nextInt();
		System.out.println("학생 학번을 숫자로 입력해주세요");
		id = sc.nextInt();
		System.out.println("학생 핸드폰번호를 입력해주세요");
		phon = sc.nextLine();
		System.out.println("학생 주소을 입력해주세요");
		adr = sc.nextLine();
		
		Student st1 = new Student();
		st1.input(name, age, phon, adr, id);
		st1.print();
		
		Student st2 = new Student();
		st2.input(name, age, phon, adr, id);
		st2.print();
		
	}

}

class Student{
	private String name;
	private int age;
	private String phonNumber;
	private String adress;
	private int studentId;
	
	public void print() {
		System.out.println(name+"("+age+"세) / 학번: "+studentId+", 핸드폰번호: "+phonNumber);
		System.out.println("주소: "+adress);
	}
	
	public void inputVar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("> 학생 정보를 입력해주세요. <");
		
		System.out.println("학생 이름을 입력해주세요");
		name = sc.nextLine();
		System.out.println("학생 나이을 숫자로 입력해주세요");
		age = sc.nextInt();
		System.out.println("학생 학번을 숫자로 입력해주세요");
		studentId = sc.nextInt();
		System.out.println("학생 핸드폰번호를 입력해주세요");
		phonNumber = sc.nextLine();
		System.out.println("학생 주소을 입력해주세요");
		adress = sc.nextLine();
	}
	
	public void input(String name, int age, String phonNumber, String adress, int studentId) {
		setName(name);
		setAge(age);
		setPhonNumber(phonNumber);
		setAdress(adress);
		setStudentId(studentId);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}
/* 클래스 생성
 * 학생 클래스 생성
 * 이름, 나이, 전화번호, 주소, 학번 등등
 * 출력
 * >> 이름(나이) 전화번호
 * */

