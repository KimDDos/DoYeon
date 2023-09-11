package day18;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		/* Web에서는 잘 안쓰고, App 혹은 Android에서는 많이 사용함
		 * 제네릭(Generic) 클래스
		 * 클래스 선언시 구체적인 타입을 기재하지 않고, 사용할 수 있도록 해주는 방식
		 * <클래스> : Stirng, Integer, Student, Subject  
		 * */
		
		// 메인 메뉴 출력과 처리
		// 1. 메뉴추가 | 2. 매뉴출력 | 3. 주문 | 4. 주문리스트 | 5. 종료
		
		Scanner sc = new Scanner(System.in);
		SaleMenager sm = new SaleMenager();
		int menu=0;
		
		do {
			System.out.println("1. 메뉴추가 | 2. 매뉴출력 | 3. 주문 | "
					+ "4. 주문리스트 | 5. 종료");
			System.out.println(">> 메뉴입력 >");
			menu=sc.nextInt();
			String str = null;
			int num=0;
			switch (menu) {
			case 1:
				System.out.println("추가할 메뉴이름과 가격을 입력해주세요.");
				str=sc.next();
				num=sc.nextInt();
				sm.insertMenu(str, num); break;
			case 2:	sm.menuListPrint(); break;
			case 3:	
				do {
					System.out.println("주문할 메뉴번호와 수량을 입력해주세요.");
					for(int i=0; i<sm.getList().size(); i++) {
						System.out.println(i+1+". "+sm.getList().get(i));
					}
					int choice = sc.nextInt();
					if(0>choice||choice>sm.getList().size()) {
						menu = sm.getList().size()+1;
						break;
					}
					num = sc.nextInt();
					if(num<=0) {
						menu = sm.getList().size()+1;
						break;
					}
					if((0<choice||choice<sm.getList().size())||num>0) {
						sm.insertOrder(choice, num);
					}
				} while(menu !=0);
				break;
			case 4:	break;
			case 5:	menu = 0; break;
			default: System.out.println("잘못된 입력입니다.");
			}
			
		} while(menu != 5);
		
	}

}
