package day18;

import java.util.Scanner;

public class Generics_풀이 {

	public static void main(String[] args) {
		/* Web에서는 잘 안쓰고, App 혹은 Android에서는 많이 사용함
		 * 제네릭(Generic) 클래스
		 * 클래스 선언시 구체적인 타입을 기재하지 않고, 사용할 수 있도록 해주는 방식
		 * <클래스> : Stirng, Integer, Student, Subject  
		 * */
		
		// 메인 메뉴 출력과 처리
		// 1. 메뉴추가 | 2. 매뉴출력 | 3. 주문 | 4. 주문리스트 | 5. 종료
		
		Scanner sc = new Scanner(System.in);
		SaleManager_풀이 sm = new SaleManager_풀이();
		
		int menu=-1;
		
		do {
			System.out.println("1. 메뉴추가 | 2. 매뉴출력 | 3. 주문 | 4. 주문리스트 | 5. 종료");
			System.out.println(">> 메뉴입력 >");
			menu = sc.nextInt();
			switch (menu) {
			case 1:	sm.add(sc); break;
			case 2:	sm.printProduct(); break;
			case 3:	sm.orderPick(sc); break;
			case 4:	sm.printOrder(); break;
			case 5:	break;
			default:System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=5);
		System.out.println("프로그램 종료");
	

	}

}
