package day21;

public class SyncMain {

	public static Bank myNack = new Bank(); // 공유영역
	
	public static void main(String[] args) throws InterruptedException {
		// Thread를 상속받는 클래스 생성 - 
		// 홍길동이가 가지고 있는 계좌 - 홍길동 + 김순이(생활비 계좌)
		// 잔액 : 10000           5000
		// 홍길동 5000원 출금, 김순이가 10000원 출금
		// 동기화 키워드 : synchronized
		
		Hong h = new Hong();
		h.start();
//		h.join();
//		System.out.println("-------------------------");
		
		Kim k = new Kim();
		k.start();
		
	}

}

class Hong extends Thread{
	public void run() { // 입금
//		System.out.println("잔액"+SyncMain.myNack.getMoney());
		System.out.println("입금 시작");
		SyncMain.myNack.saveMoney(3000);
		System.out.println("입금후 잔액"+SyncMain.myNack.getMoney());
	}
}

class Kim extends Thread{
	public void run() { // 출금
//		System.out.println("잔액"+SyncMain.myNack.getMoney());
		System.out.println("출금 시작");
		SyncMain.myNack.minusMoney(5000);
		System.out.println("출금후 잔액"+SyncMain.myNack.getMoney());
	}
}

class Bank{
	private int money = 10000;
	
	// 입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(3000);  //  1000 = 1 sec
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}

	// 출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	} 
}