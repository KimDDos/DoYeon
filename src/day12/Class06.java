package day12;

import javax.swing.GroupLayout.Group;

public class Class06 {

	public static void main(String[] args) {
		
		EzenStudent s1 = new EzenStudent("인천", "홍길동", "자바 풀스텍", "5555");
		s1.printInfo();
		
		// 객체를 출력하면 자동으로 toString메서드를 호출
		System.out.println(s1.toString());
		
		EzenStudent s2 = new EzenStudent();
		System.out.println(s2.toString());
	}

}
/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 메서드 : 출력(print 메서드)  => toString 메서드
 * 생성자
 * getter / setter
 * */

/* 객체를 초기화 하는 방법 : 기본값(null, 0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기값 : 멤버변수의 선언과 동시에 초기값을 명시하는 것
 * 2. 초기화 블럭 : {  } 멤버변수를 초기화
 * 3. 생성자 : 객체를 초기화 하는 방법
 * 초기화 우선순위
 *   - 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자
 * */

class EzenStudent{
	private String branch="인천";
	private String name="미상";
	private String group;
	private String tel;
	public static final String COMPANY = "EZEN";
	
	{
		// 초기화 블럭
		branch = "incheon";
		group = "미정";
	}
	
	public EzenStudent() {}
	public EzenStudent(String branch, String name, String classNum, String tel) {
		this.branch = branch;
		this.name = name;
		this.group = classNum;
		this.tel = tel;
	}
	
	@Override // 부모의 것을 상속받아서 쓴다는 의미임.
	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", classNum=" + group + ", phone=" + tel + "]";
	}
	
	public void printInfo() {
		System.out.println(COMPANY+"아카데미, "+branch+"지점, "+name+", "+group+", "+tel);
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassNum() {
		return group;
	}
	public void setClassNum(String classNum) {
		this.group = classNum;
	}
	public String getPhone() {
		return tel;
	}
	public void setPhone(String phone) {
		this.tel = phone;
	}
	
}