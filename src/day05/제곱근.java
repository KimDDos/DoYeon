package day05;

import java.util.Scanner;

import javax.management.loading.MLet;

public class 제곱근 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int arr[] = new int[5];
		int input = 0;
		int num1 = 0;
		double num2 = 0;
		int sum = 0;

		System.out.println("5자리의 정수를 입력해주세요 (ex : 12345)");
		input = sc.nextInt();
		for (;;) { // 예외처리
			if (0 > input || input > 99999) {
				System.out.println("다시 입력해주세요");
				input = sc.nextInt();
			} else {
				break;
			}
		}
		
//		int num5 = input % 10; 
//		int num4 = (int)(input % 100 * 0.1);
//		int num3 = (int)(input % 1000 * 0.01);
//		int num2 = (int)(input % 10000 * 0.001);
//		int num1 = (int)(input % 100000 * 0.0001);
//		                          ㄴ10의 5승    ㄴ 10의 마이너스 5승
//		int num[] = new int[] {num1, num2, num3, num4, num5};
		
		
		for(int i=0; i < num.length; i++) {
			num1 = (int)(input % Math.pow(10, (num.length-i)));
			num2 = (double)Math.pow(10, -((num.length-1)-i));
			num[i] = (int)(num1*num2);

		}
		
		for(int tmp : num) {
			System.out.print(tmp + " ");
		}
	}

}
