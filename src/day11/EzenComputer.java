package day11;

import java.util.Scanner;

/*
 * 수강관리 프로그램
 * 
 * - EzenComputer Class 생성 
 * - 학생의 기본정보 : 이름, 생년월일, 나이, 전화번호 
 * - 학원 정보 : 학원이름("EZEN"), 지점 
 * - 수강정보 : 수강과목, 기간 (2023-08-16 ~ 2024-03-14)
 * 
 * 밑에꺼가 출력하면 나와야 하는 내용임 
 * ex) 홍길동, 990101, 24, 010-1111-1111 => 학생정보 출력 
 *     EZEN, 인천지점                     => 학원정보 출력 
 * 자바(6개월), DB(1개월), html(2개월)       => 수강정보 출력
 * 
 * 기능 
 * - 학생정보출력, 학원정보출력, 수강정보출력 
 * - 학생의 수강정보를 추가하는 기능
 */
public class EzenComputer {
	Scanner sc = new Scanner(System.in);
	// final => 변경불가능한
	
	// 멤버변수
	private String name;
	private String birth;
	private int age;
	private String phone;
	public final static String company = "EZEN";
	private String breanch;
	// 수강정보 => 한 사람이 여러과목을 수강
	private String[] course = new String[5];
	private String[] period = new String[5];
	
	private int cnt = 0; // 배열의 index 처리를 위한 변수
	
	// 생성자
	public EzenComputer() {}
	
	
	public EzenComputer(String name, String birth, int age, String phone, String breanch) {
		// super(); // 상속 받을 경우 부모의 생성자    [내꺼는 this // 부모꺼는 super]
		// java.lang.object를 상속받음
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.breanch = breanch;
	}


	public EzenComputer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public EzenComputer(String name, String phone, int age, String birth) {
		this(name, phone);
		this.age = age;
		this.birth = birth;
	}
//	public EzenComputer(String name, String phone, int age, String birth, String breanch) {
//		this(name, phone, age, birth);
//		this.breanch = breanch;
//	}
	
	// 메서드
	public void stdPrint() {
		System.out.println("학생정보 > "+name+", "+birth+", "+age+", "+phone);
	}
	public void companyPrint() {
		System.out.println("학원정보 > "+company+"("+breanch+")");
	}
	public void classPrint() { // 배열 for문으로 반복하여 출력
		if(course.length == 0 || cnt == 0) {
			System.out.println("수강이력이 없습니다.");
			return;  // 출력을 멈추고 메서드 끝내기
		}
		// 추가된 과목이 있다면... 
		for(int i=0; i<cnt; i++) {
			System.out.print(course[i] + "(" + period[i] + "), ");
		}
//		System.out.print("수강정보 > ");
//		for (int i = 0; i < course.length-(course.length-cnt); i++) {
//			System.out.print(course[i] + "(" + period[i] + "), ");
//		}
//		if(course[0] == null) {
//			System.out.print("입력값 없음");
//		}
		System.out.println(); // 줄바꿈
	}
	
	public void totalPrint() {
		stdPrint();
		companyPrint();
		classPrint();
		System.out.println("--------------------------");
	}
	
	public void insertCourse(String course, String period) {
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;  // index 증가
	}
	
	public void addClass() {
		System.out.println("수강과목을 입력해주세요.");
		String str = sc.next();
		course[cnt] = str;
		System.out.println("수강기간을 입력해주세요.");
		str = sc.next();
		period[cnt] = str;
		cnt++;
	} 
	
	public void add(String str1, String str2) {
		course[cnt] = str1;
		period[cnt] = str2;
		cnt++;
	}
	
	public void input() {
		a: for (;;) {
			System.out.println("입력할 정보를 골라주세요.");
			System.out.println("1:이름 / 2:생년월일 / 3:나이 / 4:핸드폰번호 / 5:지점 / 6:수강과목/수강기간 / 7:입력종료");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("이름을 입력해주세요.");
				setName(sc.next()); break;
			case 2:
				System.out.println("생년월일을 입력해주세요.");
				setBirth(sc.next()); break;
			case 3:
				System.out.println("나이를 입력해주세요.");
				setAge(sc.nextInt()); break;
			case 4:
				System.out.println("핸드폰번호를 입력해주세요.");
				setPhone(sc.next()); break;
			case 5:
				System.out.println("지점을 입력해주세요.");
				setBreanch(sc.next()); break;
			case 6:
				System.out.println("수강과목을 입력해주세요.");
				String str1 = sc.next();
				course[cnt] = str1;
				System.out.println("수강기간을 입력해주세요.");
				str1 = sc.next();
				period[cnt] = str1;
				cnt++;
				break;
			case 7:
				System.out.println("입력을 종료합니다.");
				break a;
			default:
				System.out.println("잘못입력하셨습니다.");
				 break;
			}
		}
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
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
	
	public String getBreanch() {
		return breanch;
	}
	
	public void setBreanch(String breanch) {
		this.breanch = breanch;
	}
	
	public String[] getCourse() {
		return course;
	}
	
	public void setCourse(String[] course) {
		if(0>cnt || cnt>course.length) {
			System.out.println("자료를 추가할 수 없습니다.");
		} else {
			this.course = course;
		}
	}
	
	public int getCnt() {
		return cnt;
	}

	public String[] getPeriod() {
		return period;
	}
	
	public void setPeriod(String[] period) {
		if(0>cnt || cnt>period.length) {
			System.out.println("자료를 추가할 수 없습니다.");
		} else {
			this.period = period;
		}
	}
	
}
