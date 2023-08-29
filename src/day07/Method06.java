package day07;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 단 1개를 주고, 구구단 출력
		 * */
		gugu(3);
		// 2~9까지 반복하여 모든 단을 출력
		System.out.println("--2~9단까지 구구단 출력");
		for(int i=2; i<=9; i++) {
			gugu(i);
			System.out.println();
		}
		
		
	}
	
	public static void gugu(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
