package studentManager2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program{

	// 멤버변수 Student List
	private List<Student> student = new ArrayList<Student>();
	
	public StudentManager() {
		add();
	}
	
	// 기본 학생 추가
	public void add() {
		student.add(new Student("홍길동",16,"010-8456-8795"));
		student.add(new Student("김삼순",16,"010-5488-4682"));
		student.add(new Student("샘오취리"));
		student.add(new Student("강감찬",16,"010-7578-4444"));
		student.add(new Student("감나빗",17,"010-1354-4566"));
	}
	
	@Override
	public void addStd(Scanner scan) {
		System.out.println("학생명>");
		String name = scan.next();
		student.add(new Student(name));
		System.out.println("학생 등록 완료~!");
	}

	@Override
	public void printStd() {
		System.out.println("---학생명단---------------");
		for(int i=0; i<student.size(); i++) {
			// 학생 기본정보 출력
			System.out.println((i+1)+". "+student.get(i));
		}
		System.out.println("------------------------");
	}

	@Override
	public void searchStd(Scanner scan) {
		// 학생명을 입력받아 학생 정보 출력
		System.out.println("학생명 > ");
		String name = scan.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("검색한 학생이 없습니다.");
	}

	@Override
	public void modStd(Scanner scan) {
		// 수정할 정보(이름, 나이, 전화번호)
		System.out.println("학생명 >");
		String name = scan.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보>");
				String op = scan.next();
				switch (op) {
				case "이름":
					System.out.println("수정할 값 > ");
					String modName = scan.next();
					student.get(i).setName(modName);
					break;
				case "나이":
					System.out.println("수정할 값 > ");
					int modAge = scan.nextInt();
					student.get(i).setAge(modAge);
					break;
				case "전화번호":
					System.out.println("수정할 값 > ");
					String modPhone = scan.next();
					student.get(i).setPhone(modPhone);
					break;
				default: System.out.println("존재하지 않습니다.");
				}
			}
			return;
		}
		System.out.println("학생이 존재하지 않습니다.");
	}

	@Override
	public void delStd(Scanner scan) {
		// 학생명을 입력받아 일치하는 학생을 삭제
		// remove는 index 삭제, remove 삭제가 가능
		System.out.println("학생명 >");
		String name = scan.next();
//		for(int i=0; i<student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.remove(i);
//				System.out.println("삭제 완료~!");
//				return;
//			}
//		}
//		System.out.println("존재하지 않는 학생입니다.");
		
		// remove(Object) 삭제 => object 자체로 이름이 일치하면 
		// 같은 객체라고 인지할수 있어야 함
		if(!student.remove(new Student(name))) {
			System.out.println("학생이 존재하지 않습니다.");
			return;
		}
		student.remove(new Student(name));
	}

	@Override
	public void addSub(Scanner scan) {
		// 학생명/과목/점수 입력받아 과목등록 메서드 호출
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String subject = scan.next();
		System.out.println("점수 >");
		int score = scan.nextInt();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(subject, score);
				System.out.println("입력 완료");
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
		
		
	}

	@Override
	public void modSub(Scanner scan) {
		// 학생명/과목/점수 입력받아 과목수정 메서드 호출
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String sub = scan.next();
		System.out.println("점수 >");
		int score = scan.nextInt();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(sub);
				student.get(i).addSubject(sub, score);
				System.out.println("입력 완료");
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
		
	}

	@Override
	public void delSub(Scanner scan) {
		// 학생명과 과목을 입력받아 삭제 메서드 호출
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String sub = scan.next();
		// index 메서드 활용
		int i = index(name);
		if(i==-1) {
			System.out.println("학생이 없습니다.");
		} else {
			student.get(i).delSubject(sub);
		}
//		for(int i=0; i<student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.get(i).delSubject(sub);
//				return;
//			}
//		}
	}

	// 학생명을 주고, 그 학생명의 위치를 리턴하는 메서드
	// 중복이 많이 되는 부분은 메서드화해서 사용하는것도 나쁘지 않은듯?
	
	public int index(String name) {
		for(int i=0; i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;  // 0번지 포함이기 때문에 -1로 리턴
	}
	
	
}
