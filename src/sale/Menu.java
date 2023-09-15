<<<<<<< HEAD
package sale;

public class Menu<K,V> {
	/* Generic(제네릭) : 결정되지 않은 파라미터를 처리
	 * 실제 객체를 생성할 때 파라미터 타입을 결정 대체
	 * <T> <K,V>
	 *   
	 * */
	
	private K menu;
	private V price;
	
	public Menu() {}
	public Menu(K menu, V price){
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return menu + " : " + price;
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	
	
}
=======
package sale;

public class Menu<K,V> {
	/* Generic(제네릭) : 결정되지 않은 파라미터를 처리
	 * 실제 객체를 생성할 때 파라미터 타입을 결정 대체
	 * <T> <K,V>
	 *   
	 * */
	
	private K menu;
	private V price;
	
	public Menu() {}
	public Menu(K menu, V price){
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return menu + " : " + price;
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	
	
}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
