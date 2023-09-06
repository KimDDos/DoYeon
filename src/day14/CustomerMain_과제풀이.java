package day14;

public class CustomerMain_과제풀이 {

	public static void main(String[] args) {
		Customer_과제풀이[] customerList = new Customer_과제풀이[10];
		int cnt =0;
		
		Customer_과제풀이 cLee = new Customer_과제풀이(1001, "리정혁");
		Customer_과제풀이 cHong = new GoldCustomer(1002, "홍길동");
		Customer_과제풀이 cKim = new VIPCustomer(1003, "김철수", 1111);
		
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = cHong;
		cnt++;
		customerList[cnt] = cKim;
		cnt++;
		customerList[cnt] = new Customer_과제풀이(1004, "박정일");
		cnt++;
		customerList[cnt] = new GoldCustomer(1005, "강태이");
		cnt++;
		customerList[cnt] = new VIPCustomer(1006, "고광석", 2222);
		cnt++;
		
		// 다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		//            자식의 고유 멤버변수나 메서드를 호출하고자 할때 필요
		// 다운캐스팅은 반드시 명시적으로 형변환 해야함.
		// instanceof 연산자를 통해서 원래 그 형태가 맞는지 체크하는 명령어 true / false
		
		// 메서드로 DownCasting 하는 방법
		CustomerMain_과제풀이 ccc = new CustomerMain_과제풀이();
		ccc.downCasting(customerList, cnt, 1111, 3333);
		
		// 메인 메소드 안에서 명시적 형변환을 쓰는 방법
		System.out.println(cKim instanceof VIPCustomer);
		for(int i=0; i<cnt; i++) {
			if(customerList[i] instanceof VIPCustomer) {
				// 형변환이 가능한 경우에만 실행되도록 if문을 활용해야함.
				VIPCustomer vip = (VIPCustomer)customerList[i];
				if(vip.getAgentID() == 3333) {
					vip.setAgentID(4444);
				}
			}
		}
		
		// 강사님 문제풀이
		for (int i = 0; i < cnt; i++) {
			Customer_과제풀이 c = customerList[i];  // 주소만 복사
			if (c instanceof VIPCustomer) {
				// 형변환이 가능한 경우에만 실행되도록 if문을 활용해야함.
				VIPCustomer vip = (VIPCustomer) customerList[i];
				if (vip.getAgentID() == 3333) {
					vip.setAgentID(4444);
				}
			}
		}
		
		System.out.println("--고객 정보 출력--");
		// for문을 활용한 고객정보 출력
		for(int i=0; i<cnt; i++) {
			customerList[i].coustomerInfo();
		}
		
		System.out.println("--할인율과 포인트 계산--");
		int price = 100000;
		// 홍길동님이 지불하실 금액은 0000원, 현재 보너스포인트는 00원입니다
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은 "+customerList[i].calcPrice(price)+"원 / 현재 보너스 포인트는 "+customerList[i].getBonusPoint()+"입니다.");
		}
	}
	
	public void downCasting(Customer_과제풀이[] arr, int cnt, int num1, int num2) {
		for(int i=0; i<cnt; i++) {
			Customer_과제풀이 cus = arr[i]; 
			if(cus instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)cus;
				if(vip.getAgentID() == num1) {
					vip.setAgentID(num2);
				}
			}
		}
	}
}
