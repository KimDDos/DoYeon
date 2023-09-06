package day14;

public class GoldCustomer extends Customer_과제풀이{

	// 할인울
	private double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	// 메서드 중 할인금액을 리턴할 수 있도록 calcPrice 메서드를 오버라이딩, 재정의
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price*bonusRatio);
		price = price - (int)(price*saleRatio);
		return price;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}
