package day14;

public class Silver extends Customer{

	/*   3. Silver 등급
	 *      제품을 살때 할인 없음. / 보너스포인트 1% 적립
	 * */
	
	
	// 메서드
	//
	@Override
	public int clacPrice(int price, String customerGrade) {
		// TODO Auto-generated method stub
		return super.clacPrice(price, "Silver");
	}

	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
	}
	

	
}
