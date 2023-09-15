package day21;

// thread 클래스 상속
class MyThread extends Thread{
	// Thread를 상속받으면 반드시 run() 메서드를 구현해야 함.
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println(i+"번째"+getName());
		}
	}
}


public class Thread01 {
	public static void main(String[] args) {
		/* Thread(쓰레드)
		 *  - 실행중인 프로그램이 OS로부터 메모리를 할당 받아 process 상태가 됨.
		 *  - 하나의 프로세스는 하나 이상의 Thread를 가지게 되고,
		 *    실제 작업을 수행하는 단위는 Thread 단위로 수행됨
		 *  - Thread가 실제 CPU가 처리하는 단위
		 *  - multi Thread는 여러개 Thread가 동시에 수행되는 프로그래밍
		 *  - CPU는 시간을 잘개 쪼개서 thread들을 수행하면서 
		 *    사용자들은 동시에 처리되는 듯한 효과로 보여지게 됨.(시분할처리)
		 *  - Thread는 각각 자신만의 작업 공간을 가짐(cintext)
		 *  - 각 Tread 사이에 공유하는 자원이 있을 수 있음(= static instance)
		 *  - 여러 Thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section(임계영역)
		 *  - critical section에 대한 동기화(=순차적 수행)를 구현하여 오류를 막음
		 *  
		 *  thread 구현 방식 1. 상속(Thread 클래스), 2. 구현(Runnable)하는 방식
		 *  상속은 단일 상속이기에 상속 구현시, 구현 방법으로 구현하면 됨
		 * */
		System.out.println(Thread.currentThread().getName());
		
		MyThread th = new MyThread();
		th.start();  // 실행하는 메서드
		
		
		MyThread th2 = new MyThread();
		th2.start();
		
		
	}

}
