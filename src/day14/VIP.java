package day14;

import java.util.Random;

public class VIP extends Customer{

	private int agentID;
	
	public VIP(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public int clacPrice(int price, String customerGrade) {
		return super.clacPrice(price, "VIP");
	}

	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("전담 상담사는"+agentID+"입니다.");
	}

}
