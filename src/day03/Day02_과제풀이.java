package day03;

import java.util.Scanner;

public class Day02_과제풀이 {

	public static void main(String[] args) {
		/*
		 * 카페에 제출해주세용~ 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력 연산자는 +, -, *, /, % Ex1) 입력값을 3과
		 * 2의 정수와 +의 산술자를 더했을때 -> 3 + 2 = 5 가 출력되도록 Ex2) 입력값을 6과 3의 정수와 /의 산술자를 더했을때 ->
		 * 6 / 3 = 2 가 출력되도록 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력~!! 이라고 출력 강사 문제풀이
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요");
		int num1 = scan.nextInt();
		System.out.println("다음 숫자를 입력해주세요");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요");
		char ch = scan.next().charAt(0); // 한글자 입력받기

		int a = num1 + num2;
		int b = num1 - num2;
		int c = num1 * num2;
		double d = (double) num1 / num2;
		int e = num1 % num2;

		switch (ch) {
		case '+':
			System.out.println("" + num1 + ch + num2 + "=" + a);
			// char은 문자이지만 정수 자료형이기 때문에 ch의 값은 아스키 코드표의 값을 가지고와서
			// num1, num2과 연산이 이루어지기 때문에 앞에 의미없는 "" 를 추가해 문자열로 인식되도록 변환
			// '+'의 아스키 코드값은 43임
			break;
		case '-':
			System.out.println("" + num1 + ch + num2 + "=" + b);
			break;
		case '*':
			System.out.println("" + num1 + ch + num2 + "=" + c);
			break;
		case '/':
			System.out.println("" + num1 + ch + num2 + "=" + d);
			break;
		case '%':
			System.out.println("" + num1 + ch + num2 + "=" + e);
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
		}

		scan.close();

	}

}
