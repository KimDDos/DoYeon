<<<<<<< HEAD
package studentManager2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 학생관리프로그램 */
		Scanner scan = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		
		int menu=0;
		// sm.add();  
		
		do { 
			System.out.println("---학생관리프로그램----");
			System.out.println("1. 학생추가 | 2. 학생리스트 | 3.학생검색");
			System.out.println("4. 학생수정 | 5. 학생삭제 | 6. 과목추가");
			System.out.println("7. 점수수정 | 8. 과목삭제 | 9. 종료");
			System.out.println(">> 선택");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: sm.addStd(scan); break;
			case 2: sm.printStd(); break;
			case 3: sm.searchStd(scan); break;
			case 4: sm.modStd(scan); break;
			case 5: sm.delStd(scan); break;
			case 6: sm.addSub(scan); break;
			case 7: sm.modSub(scan); break;
			case 8: sm.delSub(scan); break;
			case 9: break;
			default: System.out.println("잘못된 메뉴 선택입니다.");
			}
		} while(menu!=9);
		System.out.println("프로그램 종료~!!");
		
		scan.close();
	}

}
=======
package studentManager2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 학생관리프로그램 */
		Scanner scan = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		
		int menu=0;
		// sm.add();  
		
		do { 
			System.out.println("---학생관리프로그램----");
			System.out.println("1. 학생추가 | 2. 학생리스트 | 3.학생검색");
			System.out.println("4. 학생수정 | 5. 학생삭제 | 6. 과목추가");
			System.out.println("7. 점수수정 | 8. 과목삭제 | 9. 종료");
			System.out.println(">> 선택");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: sm.addStd(scan); break;
			case 2: sm.printStd(); break;
			case 3: sm.searchStd(scan); break;
			case 4: sm.modStd(scan); break;
			case 5: sm.delStd(scan); break;
			case 6: sm.addSub(scan); break;
			case 7: sm.modSub(scan); break;
			case 8: sm.delSub(scan); break;
			case 9: break;
			default: System.out.println("잘못된 메뉴 선택입니다.");
			}
		} while(menu!=9);
		System.out.println("프로그램 종료~!!");
		
		scan.close();
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
