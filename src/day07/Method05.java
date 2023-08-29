package day07;

public class Method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 2~100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 * */
		
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				System.out.println(i+" "); // 소수만 출력
			}
		}
		System.out.println();
		// 2~100까지의 소수의 합계
		
		
	}
	/* 기능 : 
	 * 소수 : 
	 * 리턴타입 : boolean
	 * 매개변수 : 정수 => int num
	 * 메서드명 : isPrime
	 * */
	public static boolean isPrime(int num) {
		int cnt = 0;
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			return true;
		}
		
		return false;
	}

}
