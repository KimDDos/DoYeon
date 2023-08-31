package day12;

public class Product {

	private String menu;
	private String price;
	private int cnt = 0;
	
	// 생성자
	public Product() {}
	public Product(String menu, String price) {
		this.menu = menu;
		this.price = price;
	}
	
	// 메서드
	// 1. 메뉴추가
	public void insertMenu(String menu, String price) {
		setMenu(menu);
		setPrice(price);
	}
	
	
	// 2. 출력
	public void printMenu() {
		System.out.println(menu+" : "+price+"원");
	}
	
	
	// getter / setter
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
