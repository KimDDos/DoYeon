package day05;

import java.util.Scanner;

public class Array04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력해주세요");
		int num = scan.nextInt();
		int arr[] = new int[5];
		
		// 나누기(/), 나머지(%)
		// 12345 -> % 10 -> 5 -> 배열에 저장
		// 값을 나눈 몫만 다시 나눌값으로 지정
		// 12345 / 10 => 정수만 저장
		// 1234 -> % 10 -> 4 -> 배열에 저장
		// 123 -> % 10 -> 3 -> 배열에 저장 
		// 12 -> % 10 -> 2 -> 배열에 저장 
		// 1 -> % 10 -> 1 -> 배열에 저장 
		
		int sum = 0;
		int i = 0;
		
		while(num > 0) { //입력받은 num가 0보다 작아지면 false로 끝
			int b = num % 10;  // 마지막 자리를 나머지로 받기
			arr[i] = b;
			sum += b;
			num = num / 10; // 몫 저장  -> 정수 / 정수 = 정수
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("sum : " + sum);

		
//		s1 = s1.split(""); // 특정 문자를 기준으로 나누기
//		sum += Integer.parseInt(s1[i]); args //문자를 숫자로 바꾸기 
	}

}
