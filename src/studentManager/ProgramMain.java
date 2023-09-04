package studentManager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
		 * */
		
		StudentManager sm = new StudentManager();
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("==수강관리프로그램==");
			System.out.println("1.학생등록|2.학생검색|3.학생리스트");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.println("메뉴선택 > ");
			
			menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.println("학생등록메뉴~!");
				sm.insertStudent(sc);
				break;
			case 2:
				System.out.println("학생검색메뉴~!");
				sm.searchStudent(sc);
				break;
			case 3:
				System.out.println("학생조회메뉴~!");
				sm.printStudent();
				break;
			case 4:
				System.out.println("수강신청메뉴~!");
				sm.registerSubject(sc);
				break;
			case 5: 
				System.out.println("수강철회메뉴~!");
				sm.deleteSuject(sc);
				break;
			case 6:	break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu != 6);
		
		System.out.println("프로그램 종료");
		
		
		sc.close();
	}

}
