package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 +, -, *, /, %
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산
		 * 0 + 0 = 0  <= 같은 형태로 작성
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char ch = scan.next().charAt(0);
		for (;;) {
			if (ch != '+') {
				System.out.println("연산자를 다시 입력해주세요");
				ch = scan.next().charAt(0);
			} else if(ch != '-') {
				System.out.println("연산자를 다시 입력해주세요");
				ch = scan.next().charAt(0);
			} else if(ch != '*') {
				System.out.println("연산자를 다시 입력해주세요");
				ch = scan.next().charAt(0);
			} else if(ch != '/') {
				System.out.println("연산자를 다시 입력해주세요");
				ch = scan.next().charAt(0);
			} else if(ch != '%') {
				System.out.println("연산자를 다시 입력해주세요");
				ch = scan.next().charAt(0);
			} else {
				break;
			}
		}
		System.out.println("숫자를 입력해주세요.");
		int num2 = scan.nextInt();
		
			switch (ch) {
			case '+':
				add(num1, num2);
				break;
			case '-':
				sub(num1, num2);
				break;
			case '*':
				mul(num1, num2);
				break;
			case '/':
				div(num1, num2);
				break;
			case '%':
				rem(num1, num2);
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				break;
			}
		scan.close();
		
	}

	
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void div(int num1, int num2) {
		System.out.println((double)(num1 / num2));
	}
	public static void rem(int num1, int num2) {
		System.out.println(num1 % num2);
	}
	
	
}
