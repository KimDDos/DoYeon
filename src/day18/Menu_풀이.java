package day18;

public class Menu_풀이 {
		
		private String menu;
		private int Price;
		
		public Menu_풀이(String menu, int Price) {
			this.menu = menu;
			this.Price = Price;
		}

		public String getMenu() {
			return menu;
		}
		public void setMenu(String menu) {
			this.menu = menu;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		@Override
		public String toString() {
			return menu + " : " + Price;
		}
		
		
		

}
