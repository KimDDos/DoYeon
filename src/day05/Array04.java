package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * 입력은 한번에 받을것
		 * 각 자리의 합계 출력
		 * ex ) 11456 => 65411 => +6+5+4+1+1
		 * ex) 19547 => 74591 => 1+9+5+4+7
		 * */
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int num[] = new int[5];
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
		
		for(int i=0; i < num.length; i++) {
			num1 = (int)(input % Math.pow(10, (num.length-i)));
			num2 = (double)Math.pow(10, -((num.length-1)-i));
			num[i] = (int)(num1*num2);
		}

		for (int i = 0; i < num.length; i++) {
			arr[i] = num[i];
			sum = sum + arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + "+");
			} else {
				System.out.print(arr[arr.length - 1] + "=" + sum);
			}
		}

		sc.close();

//		int num5 = input % 10;
//		int num4 = (int) (input % 100 * 0.1);
//		int num3 = (int) (input % 1000 * 0.01);
//		int num2 = (int) (input % 10000 * 0.001);
//		int num1 = (int) (input % 100000 * 0.0001);
//		int num[] = new int[] { num1, num2, num3, num4, num5 };
		
		
	}

}
