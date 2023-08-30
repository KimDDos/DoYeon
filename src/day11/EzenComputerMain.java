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
		
		EzenComputer[] std = new EzenComputer[7];
		std[0] = new EzenComputer("영이","980101",25,"1111","인천");
		std[1] = new EzenComputer("순이","980101",25,"2222","서울");
		std[2] = new EzenComputer("철이","980101",25,"3333","인천");
		std[3] = new EzenComputer("철수","980101",25,"4444","서울");
		std[4] = new EzenComputer("영철","980101",25,"5555","인천");
		std[5] = s1;
		std[6] = s2;
		std[0].insertCourse("DB", "1개월");
		std[1].insertCourse("HTML", "2개월");
		std[1].insertCourse("java", "6개월");
		std[2].insertCourse("DB", "1개월");
		std[2].insertCourse("HTML", "2개월");
		std[3].insertCourse("java", "6개월");
		std[3].insertCourse("DB", "1개월");
		std[3].insertCourse("HTML", "2개월");
		std[4].insertCourse("java", "6개월");
		
		/* 과제임
		 * 학생 이름으로 검색 => 모든 정보 출력
		 * 지정정보로 검색 => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색 => 학생정보만 출력 (할 사람만 해볼것)
		 * */
		
		int num=0;
		String searchNameString = "영이"; 
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchNameString)) {
				std[i].totalPrint();
				num++;
			} else if(i==std.length-1 && num==0){
				System.out.println(searchNameString+"은 "+EzenComputer.company+"학원 수강자가 아닙니다.");
			}
		}
		
		System.out.println("-------------구분--------------");
		
		String searchBreanch = "인천"; 
		for(int i=0; i<std.length; i++) {
			if(std[i].getBreanch().equals(searchBreanch)) {
				std[i].stdPrint();
			} 
		}
		
		System.out.println("-------------구분--------------");
		
		String searchCourseString = "java";
		for(int i=0; i<std.length; i++) {
			for(int j=0; j<5; j++) {
				if(std[i].getCourse()[j] == null) {
					std[i].getCourse()[j] = "null";
				}
				if(std[i].getCourse()[j].equals(searchCourseString)) {
					std[i].totalPrint();
				}
			}
		}
	}
}
