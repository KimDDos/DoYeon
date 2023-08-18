package day03;

import javax.security.auth.spi.LoginModule;

public class For05 {

	public static void main(String[] args) {
		/* 최소 공배수
		 * 공배수 : 공통된 배수
		 * 10 : 10 20 30 40 50 ...
		 * 15 : 15 30 45 60 ...
		 * 공배수 : 30 60 ...
		 * 최소 공배수 : 30
		 * */
		
		//for ( 10 20 30 40 ...)
		
		int num1 = 10;
		int num2 = 15;
		for(int i=num1; ; i+=num1) {
			if(i%num1 == 0 && i%num2 == 0) {
				System.out.println("두 수의 최소 공배수 : " + i);
				break;
			}
		}

		
//		int num1 = 10;
//		int num2 = 15;
//		int lcm = 0;
//		int gcd = 0;
//		
//		for(int i=1; ; i++) {
//			if(num1%i==0 && num2%i==0) {
//				gcd = i;
//			}
//			lcm = (num1*num2)/gcd;
//		} 
//		
//		
//		if(num1 % i == 0 && num2 % i == 0) {
//			gcd = i;
//			} 
//	 		lcm = (num1*num2)/gcd;
//		
//  		System.out.println(lcm);
			
	}

}
