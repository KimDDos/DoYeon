package day02;

public class If01 {

	public static void main(String[] args) {
		/* 조건문 : 조건식이 참일경우 실행문을 실행하는 문
		 * if문, switch문
		 * if(조건식) {실행문;}
		 * 실행문 한줄일 경우 {   } 생략가능 하지만 쓸때는 생략하지 않는게 낫다.
		 * 조건식은 참일때 실행문을 실행
		 * */
		
		int num = 10;
		// num가 0보다 크면 양수라고 출력, 음수이면 출력 X
		if(num > 0) {
			System.out.println("양수");
		} 
		
		// num가 0보다 크면 양수 / 아니면 음수
		num = -10;
		if(num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		
		// num가 0보다 크면 양수 / 아니면 음수 / 0이면 0입니다.
		num = 0;
		if(num > 0) {
			System.out.println("양수");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		
		// num가 0보다 크면 양수(10보다 크면 10보다 큽니다.) / 아니면 음수 / 0이면 0입니다.
		num = 15;
		if(num > 0) {
			System.out.print("양수");
			if(num > 10) {
				System.out.println("이고, 10보다 큽니다.");
			}
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		
		// num2 값을 저장하고, num2가 짝수인지 홀수인지 콘솔에 찍기
		int num2 = 11;
		if(num2 % 2 == 0) {
			System.out.println(num2 + " : 짝수");
		} else {
			System.out.println(num2 + " : 홀수");
		}
		num2 = 10;
		if(num2 % 2 != 0) {
			System.out.println(num2 + " : 홀수");
		} else {
			System.out.println(num2 + " : 짝수");
		}
		
	}

}
