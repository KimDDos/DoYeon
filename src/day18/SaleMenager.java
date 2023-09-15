<<<<<<< HEAD
package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SaleMenager {
	/* Menu 클래스를 리스트로 구현
	 * 
	 * 메뉴 리스트, 주문리스트 구현
	 * 
	 * 메뉴 생성, 메뉴 추가 기능, 주문 처리
	 * */
	
	private int size = 10;
	private Menu[] mn = new Menu[size];
	private ArrayList<Menu> list = new ArrayList<>();
	private HashMap<Menu, Integer> order = new HashMap<>();
	private int cnt;
	
	public SaleMenager() {
		add();
	}
	
	public void add() {
		list.add(new Menu("햄버거",7000));
		list.add(new Menu("피자",15000));
		list.add(new Menu("음료수",2000));
		list.add(new Menu("과자",1000));
		list.add(new Menu("사탕",500));
	}
	
	public void menuListPrint() {
		System.out.println("== Menu ==");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1+". "+list.get(i));
		}
		System.out.println(list.size()+1+". 종료하기");
	}
	
	public void insertOrder(int menuNumber, int num) {
		order.put(list.get(menuNumber-1),num);
	}
	
	public void insertMenu(String newMenuName, int newMenuPrice) {
		list.add(new Menu(newMenuName, newMenuPrice));
	}
	
	public void orderList() {
		System.out.println("== 주문 현황 ==");
		int sum=0;
		for(Menu tmp : order.keySet()) {
			System.out.println(tmp+", "+order.get(tmp)+"개 주문");
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Menu[] getMn() {
		return mn;
	}

	public void setMn(Menu[] mn) {
		this.mn = mn;
	}

	public ArrayList<Menu> getList() {
		return list;
	}

	public void setList(ArrayList<Menu> list) {
		this.list = list;
	}

	public HashMap<Menu, Integer> getOrder() {
		return order;
	}

	public void setOrder(HashMap<Menu, Integer> order) {
		this.order = order;
	}
	
	
}
=======
package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SaleMenager {
	/* Menu 클래스를 리스트로 구현
	 * 
	 * 메뉴 리스트, 주문리스트 구현
	 * 
	 * 메뉴 생성, 메뉴 추가 기능, 주문 처리
	 * */
	
	private int size = 10;
	private Menu[] mn = new Menu[size];
	private ArrayList<Menu> list = new ArrayList<>();
	private HashMap<Menu, Integer> order = new HashMap<>();
	private int cnt;
	
	public SaleMenager() {
		add();
	}
	
	public void add() {
		list.add(new Menu("햄버거",7000));
		list.add(new Menu("피자",15000));
		list.add(new Menu("음료수",2000));
		list.add(new Menu("과자",1000));
		list.add(new Menu("사탕",500));
	}
	
	public void menuListPrint() {
		System.out.println("== Menu ==");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1+". "+list.get(i));
		}
		System.out.println(list.size()+1+". 종료하기");
	}
	
	public void insertOrder(int menuNumber, int num) {
		order.put(list.get(menuNumber-1),num);
	}
	
	public void insertMenu(String newMenuName, int newMenuPrice) {
		list.add(new Menu(newMenuName, newMenuPrice));
	}
	
	public void orderList() {
		System.out.println("== 주문 현황 ==");
		int sum=0;
		for(Menu tmp : order.keySet()) {
			System.out.println(tmp+", "+order.get(tmp)+"개 주문");
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Menu[] getMn() {
		return mn;
	}

	public void setMn(Menu[] mn) {
		this.mn = mn;
	}

	public ArrayList<Menu> getList() {
		return list;
	}

	public void setList(ArrayList<Menu> list) {
		this.list = list;
	}

	public HashMap<Menu, Integer> getOrder() {
		return order;
	}

	public void setOrder(HashMap<Menu, Integer> order) {
		this.order = order;
	}
	
	
}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
