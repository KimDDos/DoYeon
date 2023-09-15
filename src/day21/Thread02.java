package day21;

class MyThread2 implements Runnable{

	// 반드시 run을 구현해야 함.
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(i+"번째"+Thread.currentThread().getName());
		}
	}
	
}


public class Thread02 {

	public static void main(String[] args) {
		/* Runnable를 구현하는 방법
		 * 직접 객체 생성만으로 실행 불가능
		 * Thread 클래스의 생성자로 runnabel 구현 객체를 추가
		 * 실행의 주체는 스레드 클래스임.
		 * 운영체제와 관련되어 스케쥴링과 관련되어있음
		 * */
		MyThread2 mth = new MyThread2();
		Thread th = new Thread(mth);
		th.start();
		
		try {
			th.join(); // th가 수행이 완료될때까지 기다리게 하는 메서드
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("main End~!!!!!!");
		/* 출력
		 * main End~!!!!!!
		   0번째Thread-1
		   1번째Thread-1
		   0번째Thread-0
		   ...
		*/
	}

}

