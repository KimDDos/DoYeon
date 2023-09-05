package day14;

public class Customer {
	/* 고객 클래스
	 * 일반고객 / Gold고객 / Vip고객
	 * 
	 * main 에서 모두 처리, 출력만
	 * 
	 * 멤버변수
	 * 고객 ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - customer 객체 생성시
	 *   기본 customerGrade = Silver 
	 *   기본 bonusRatio = 0.01
	 *   
	 * - 메서드
	 *   1. 보너스 적립 계산메서드(메서드명 : calcPrice(int price))
	 *      => 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴
	 *      구매금액을 주고, 적립보너스계산, bonusPoint 누적, 실 구매금액 리턴
	 *      
	 *   2. 출력메서드 (메서드명 : customerInfo())
	 *      홍길동님의 등급은 VIP이며, 보너스 포인트는 1000점입니다. (출력예제임)
	 *      전담 상담사 번호는 1111입니다. - VIP만 출력
	 *       
	 *   3. Silver 등급
	 *      제품을 살때 할인 없음. / 보너스포인트 1% 적립
	 *      
	 *   4. Gold 등급
	 *      제품을 구매할때 10% 할인 / 보너스포인트 2% 적립
	 *      
	 *   5. VIP 등급
	 *      제품을 구매할때 20% 할인 / 보너스포인트 5% 적립
	 *      전담상담사를 갖는다. (int agentID)
	 *      
	 * */
	
	// 멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	// method
	// 보너스 적립 계산
	public int clacPrice(int price, String customerGrade) {
		double discount = discountRatio(customerGrade);
		int cacuPrice = price; // 등급에 따른 할인비율을 반영되는 메서드 필요
		// 보너스 포인트 반환 메서드 필요(등급에 따라 반환되는 비율이 다른것으로)
		return cacuPrice;
	}
	
	// 출력 메서드
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"점입니다.");
//		if(customerGrade.equals("VIP")) { 고객등급 판별식 반영
//				System.out.println("전담 상담사 번호는"+[VIP 클래스에 별도로 만들어줘야함!]+"입니다.");
//		}
	}
	
	// 등급에 따른 할인율
	public double discountRatio(String customerGrade) {
		if(customerGrade.equals("VIP")) {
			return 0.8;
		} else if(customerGrade.equals("Gold")) {
			return 0.9;
		} else {return 1;}
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}
	
	
	
}
