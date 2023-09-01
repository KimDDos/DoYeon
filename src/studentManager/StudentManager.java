package studentManager;

import java.util.Scanner;

public class StudentManager implements Program{
	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - Program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로
	 * - 학생 추가시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가  
	 * */
	private int size = 5;
	private int cnt;
	private int count;
	private Student[] std = new Student[size];

	@Override
	public void printStudent() {
		if(cnt==0) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for(int i=0; i<cnt; i++) {
			std[i].printInfo();
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		String str = sc.next();
//		if(cnt==std.length) {
//			int num = 2 * size;
//			Student[] std2 = new Student[num];
//			size = num;
//			System.arraycopy(std, 0, std2, 0, std.length);
//			for(int i=0; i<std.length; i++) {
//				std2[i]=std[i];
//			}
//		}
		std[cnt] = new Student(str);
		cnt++;
	}
	

	@Override
	public void searchStudent(Scanner sc) {
		String str = sc.next();
		for(int i=0; i<cnt; i++) {
			if(str.equals(std[i].getName())) {
				std[i].printInfo();
				count++;
			}
		}
		if(count==0) {
			System.out.println("일치하는 학생이 없습니다.");
		}
	}

	@Override
	public void registerSubject(Scanner sc) {
		// 학생이 수강신청을 할 때
		System.out.println("수강을 신청할 학생을 조회해주세요.");
		String str = sc.next();
		for(int i=0; i<cnt; i++) {
			if(str.equals(std[i].getName())) {
				System.out.println("신청할 과목을 입력해주세요.");
				String subjectName = sc.next();
				std[i].insertSub(subjectName);
				System.out.println("입력완료");
			}
		}
		
	}

	@Override
	public void deleteSuject(Scanner sc) {
		System.out.println("수강을 철회할 학생을 조회해주세요.");
		String str = sc.next();
		for(int i=0; i<cnt; i++) {
			if(str.equals(std[i].getName())) {
				System.out.println("철회할 과목을 입력해주세요.");
				String subjectName = sc.next();
				std[i].delete(subjectName);
				System.out.println("수강철회 성공!");
			}
		}

	}
}