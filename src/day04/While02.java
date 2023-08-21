package day04;

import day02.IF02;

public class While02 {

	public static void main(String[] args) {
		/*
		 * 2 4 6 8 10 
		 * 12 14 16 18 20 
		 * 22 24 26 28 30
		 * 
		 * 1~50까지 짝수만 출력 5개씩 한줄로
		 */

		
		
		// 순서가 정해져있으면 대부분 for문을 씀
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if (i % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("---------------");
		
		
		// 조건만 해당되면 쓸수있는 while을 많이 씀
		int u=1;
		while(u<=50) {
			if(u%2==0) {
				System.out.print(u + " ");
			}
			if(u%10==0) {
				System.out.println();
			}
			u++;
		}
		
		System.out.println("---------------");
		
		// printf를 활용한 출력
		u=1;
		while(u<=50) {
			if(u%2==0) {
				System.out.printf("%3d", u);
			}
			if(u%10==0) {
				System.out.println();
			}
			u++;
		}
		
		System.out.println();
		
		System.out.println();
		System.out.println("출력구문");
		/* System.out.printhln : 줄바꿈이 포함하는 출력 // 값이 없어도 출력됨(공백을 가지고 있음)
		/* System.out.printh : 줄바꿈이 없는 출력 // 값이 없으면 error
		 * SYstem.out.printf : 지시자를 이용한 출력
		 * 
		 * 서식 지정자를 통해 출력할 데이ㅓ의 서식을 지정할 수 있음.
		 * %n(\n 줄바꿈), %d(정수형), %f(실수형), %c(문자), %s(문자열)
		 * 소수점 설정, 공백(띄어쓰기) 
		 */
		
		System.out.printf("%.3f%n", 1.23456); // 기본적으로 반올림을 함
		
		int num1 = 5;
		int num2 = 3;
		// 5 + 3 = 8 
		
		System.out.printf("%d + %d = %d%n",num1,num2,(num1+num2));
//		System.out.printf("%n%d+%d=%d",num1,num2,(num1+num2));
//							ㄴ 줄바꿈으로 쓰긴하나 제일 처음에 잘 쓰진 않음
		
		double num3 = 1.23;
		double num4 = 5;
		// 1.23 / 5 = 
		System.out.printf("%.2f / %.2f = %.1f%n",num3,num4,(num3/num4));
		
	}
}
