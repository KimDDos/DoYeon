package day10;

import java.util.Scanner;

public class Day09_과제풀이 {

	public static void main(String[] args) {
		// 클래스 객체 생성(2명)
		// 값을 입력후 정보출력
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(27);
		s1.setPhone("010-1231-3211");
		s1.setAddress("인천시");
		s1.stdPrint();
		
		Student s2 = new Student();
		s2.setName("감나빗");
		s2.setAge(26);
		s2.setPhone("010-8521-2124");
		s2.setAddress("서울시");
		s2.stdPrint();
		
		// input 메서드를 이용한 입력
		Student s3 = new Student();
		s3.input("박철수", 25, "010-5555-6666", "서울시");
		s3.stdPrint();
		
		// 기본 생성자를 통한 입력값 초기화
		Student s4 = new Student("이영희", 29, "010-7412-8563", "시흥시");
		s4.stdPrint();
		
		Student s5 = new Student("홍아이", 5);
		s5.stdPrint();
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름:");
//		s3.setName(sc.next());
//		System.out.println("나이:");
//		s3.setAge(sc.nextInt());
//		System.out.println("전화번호:");
//		s3.setPhone(sc.next());
//		System.out.println("주소:");
//		s3.setAddress(sc.next());
//		s3.stdPrint();
//		
//		sc.close();
	}

}

/* 클래스 생성
 * 학생 클래스 생성
 * 이름, 나이, 전화번호, 주소, 학번 등등
 * 출력
 * >> 이름(나이) 전화번호
 * */
class Student{
	// 멤버변수
	private String name;
	private int age;
	private String phone;
	private String address; 
	
	public void stdPrint() {
		System.out.println(name+"("+age+")"+phone);
	}

	public void input(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.phone = tel;
		this.address = addr;
		
	}
	
	// 생성자 위치
	// 생성자를 생성해버리면 기본 생성자가 날아가버림 그러니까 두개를 만드는게 나음
	// 생성자도 오버로딩이 가능함(매개변수가 다르니까!)
	// 생성자 오버로딩 조건
	//  - 매개변수 개수가 다르거나, 매개변수 유형이 다르거나
	public Student() {}
	// ㄴ 컴파일러가 자동으로 생성해주는 default constructor(기본 생성자)임.
	// 다른 생성자를 만들면 없어지기땨문에 따로 만들어줘야함.
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String phone, String address) {
		// 생성자 호출 (☆☆☆☆☆)
		// 생성자는 이름이 없기때문에 this로 호출한다.
		this(name, age);  // 생성자 호출의 위치는 첫줄에서만 가능함, 밑으로 내려가면 error 발생
//		this.name = name;
//		this.age = age;
		this.phone = phone;
		this.address = address;	
		// this(name, age);  // << 밑으로 내려가면 error 발생
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}