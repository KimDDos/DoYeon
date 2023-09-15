package day18;

public class Menu {
	/* 메뉴와 가격을 나타내는 클래스 생성
	 * */
	// 멤버변수, 생성자, getter/setter, toString
	
	private String menuName;
	private int menuPrice;
	
	public Menu() {}
	public Menu(String menuName, int menuPrice) {
		setMenuName(menuName);
		setMenuPrice(menuPrice);
	}
	
	@Override
	public String toString() {
		return menuName + " : " + menuPrice;
	}
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	
	
	
}
