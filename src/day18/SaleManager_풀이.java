package day18;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager_풀이 {
	// menu 클래스를 리스트로 구현
	private ArrayList<Menu_풀이> product = new ArrayList<>(); // String, int
	private ArrayList<Menu_풀이> order = new ArrayList<>();
	
	private int totSum;
	
	public SaleManager_풀이() {
		addMenu();
	}
	
	public void addMenu() {
		product.add(new Menu_풀이("햄버거", 7000));
		product.add(new Menu_풀이("피자", 15000));
		product.add(new Menu_풀이("음료수", 2000));
		product.add(new Menu_풀이("과자", 1000));
		product.add(new Menu_풀이("사탕", 500));
	}
	
	// 메뉴 추가
	public void add(Scanner sc) {
		System.out.println("메뉴명: ");
		String menu = sc.next();
		System.out.println("가격: ");
		int price = sc.nextInt();
		
		Menu_풀이 m = new Menu_풀이(menu, price);
		product.add(m);
		System.out.println("메뉴 추가 완료~!");
	}
	
	// 메뉴리스트 출력
	public void printProduct() {
		System.out.println("---Menu---");
		for(int i=0; i<product.size(); i++) {
			System.out.println(i+1+"."+product.get(i));
		}
		System.out.println("-----------------------");
	}
	
	// 주문 처리 기능
	public void orderPick(Scanner sc) {
		System.out.println("주문메뉴:");
		// 1. 메뉴를 직접 한글로 받는 케이스
//		String menu = sc.next();
		
		// 2. 메뉴를 숫자로 받는 케이스
		int pick = sc.nextInt(); // 번호 : index-1
		String tmpMenu = product.get(pick-1).getMenu();
		if(tmpMenu==null) {
			System.out.println("찾는 메뉴가 없습니다.");
		} else {
			System.out.println("주문수량:");
			int count = sc.nextInt();
			int tmpPrice = product.get(pick-1).getPrice();
			totSum += (tmpPrice*count);
			Menu_풀이 m = new Menu_풀이(tmpMenu, count);
			order.add(m);
		}
	}
	
	// 주문리스트 구현
	public void printOrder() {
		int sum=0;
		int index=1;
		for(Menu_풀이 m : order) {
			String menu = m.getMenu();
			int price = findMenu(menu);
			System.out.print(index+". "+m+"    "+(m.getPrice()*price));
			index++;
		}
		System.out.println();
		System.out.println("----------------");
		System.out.println("주문총액 :" +totSum);
	}
	
	public int findMenu(String menu) {
		for(Menu_풀이 m : product) {
			if(m.getMenu().equals(menu)) {
				return m.getPrice();
			} 
		}
		return -1;
	}
}
