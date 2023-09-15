package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	private ArrayList<Menu<String, Integer>> product = new ArrayList<>();
	private ArrayList<Menu<String, Integer>> order = new ArrayList<>();
	
private int totSum;
	
	public SaleManager() {
		addMenu();
	}
	
	public void addMenu() {
		product.add(new Menu("햄버거", 7000));
		product.add(new Menu("피자", 15000));
		product.add(new Menu("음료수", 2000));
		product.add(new Menu("과자", 1000));
		product.add(new Menu("사탕", 500));
	}
	
	// 메뉴 추가
	public void add(Scanner sc) {
		System.out.println("메뉴명: ");
		String menu = sc.next();
		System.out.println("가격: ");
		int price = sc.nextInt();
		
		Menu m = new Menu(menu, price);
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
			Menu<String, Integer> m = new Menu(tmpMenu, count); // 메뉴의 개수
			order.add(m);
		}
	}
	
	// 주문리스트 구현
	public void printOrder() {
		int index=1;
		for(Menu m : order) {
			String menu = (String)m.getMenu();
			int price = findMenu(menu);
			System.out.print(index+". "+m+"    "+((int)m.getPrice()*price));
			index++;
		}
		System.out.println();
		System.out.println("----------------");
		System.out.println("주문총액 :" +totSum);
	}
	
	public int findMenu(String menu) {
		for(Menu<String, Integer> m : product) {
			if(m.getMenu().equals(menu)) {
				return (int)m.getPrice();
			} 
		}
		return -1;
	}
	
}
