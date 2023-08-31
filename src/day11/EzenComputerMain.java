package day11;

public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer의 객체 생성 후 출력
		EzenComputer s1 = new EzenComputer("홍길동", "010-8457-9556", 28 ,"1996-08-02");
//		s1.addClass();
		s1.setBreanch("서울");
		s1.insertCourse("java", "6개월");
		s1.insertCourse("DB", "1개월");
		
		EzenComputer s2 = new EzenComputer("고양이", "990101",24,"1111","인천");
		s2.insertCourse("DB", "1개월");
		s2.insertCourse("HTML", "2개월");
		// 수강정보 추가
//		s1.input();
		
		/* 학생클래스를 담을수 있는 배열을 생성 후
		 * 5명의 학생을 등록
		 * */ 
		
		EzenComputer[] student = new EzenComputer[7];
		student[0] = new EzenComputer("영이","980101",25,"1111","인천");
		student[1] = new EzenComputer("순이","980101",25,"2222","서울");
		student[2] = new EzenComputer("철이","980101",25,"3333","인천");
		student[3] = new EzenComputer("철수","980101",25,"4444","서울");
		student[4] = new EzenComputer("영철","980101",25,"5555","인천");
		student[5] = s1;
		student[6] = s2;
		student[0].insertCourse("DB", "1개월");
		student[1].insertCourse("HTML", "2개월");
		student[1].insertCourse("java", "6개월");
		student[2].insertCourse("DB", "1개월");
		student[2].insertCourse("HTML", "2개월");
		student[3].insertCourse("java", "6개월");
		student[3].insertCourse("DB", "1개월");
		student[3].insertCourse("HTML", "2개월");
		student[4].insertCourse("java", "6개월");
		
		/* 과제임
		 * 학생 이름으로 검색 => 모든 정보 출력
		 * 지정정보로 검색 => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색 => 학생정보만 출력 (할 사람만 해볼것)
		 * */
		
		int num=0;
		String searchName = "영이"; 
		for(int i=0; i<student.length; i++) {
			if(student[i].getName().equals(searchName)) {
				student[i].totalPrint();
				num++;
			} else if(i==student.length-1 && num==0){
				System.out.println(searchName+"은 "+EzenComputer.company+"학원 수강자가 아닙니다.");
			}
		}
		
		// 강사님 문제풀이
		int cnt =0;
		System.out.println(searchName+"님의 정보 ------");
		for(int i=0; i<student.length; i++) {
			if(student[i].getName().equals(searchName)) {
				student[i].totalPrint();
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("검색 결과가 없습니다.");
		}
		
		
		System.out.println("-------------구분--------------");
		
		String searchBreanch = "인천"; 
		for(int i=0; i<student.length; i++) {
			if(student[i].getBreanch().equals(searchBreanch)) {
				student[i].stdPrint();
			} 
		}
		
		// 강사님 문제풀이
		// 향상된 for문은 배열을 쭉 나열해놓고 임시배열의 임시변수값을 조회후 출력
		// 향상된 for문은 완성된 배열에서만 사용가능(완성된 것에 조회, 출력, 사용만 가능)
		// set은 불가능함(구문상 set을 할 수 있어도 실제 배열에 저장되지 않음)
		System.out.println(searchBreanch+"지점의 학생정보만 출력");
		for(EzenComputer ez : student) {
			if(ez.getBreanch().equals(searchBreanch)) {
				ez.stdPrint();
			}
		}
		System.out.println("-------------구분--------------");
		
		String searchCourseString = "java";
		System.out.println(searchCourseString+"과목의 학생정보 출력------");
		// 강사님 문제풀이
		for(EzenComputer ez : student) {
			for(int i=0; i<ez.getCnt(); i++) {
				if(ez.getCourse()[i].equals(searchCourseString)) {
		// searchCourseString.equals(ez.getCourse()[i]) 도 상관없이 실행됨
		// 이중 for문을 활용할때 향상된 for문을 섞어주면 가독성이 올라가서 좋은편임.
					ez.stdPrint();
					ez.classPrint();
					System.out.println("-------------------");
				}
			}
		}
		
		
		
		
		
		
		// equals는 객체의 주소로 들어가 값을 확인후 대조하는 것임
		for(int i=0; i<student.length; i++) {
			for(int j=0; j<5; j++) {
				if(student[i].getCourse()[j] == null) {
					student[i].getCourse()[j] = "null";
				}
				if(student[i].getCourse()[j].equals(searchCourseString)) {
					student[i].totalPrint();
				}
			}
		}
	}
}
