package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 카페에 제출해주세용~
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 +, -, *, /, %
		 * Ex1) 입력값을 3과 2의 정수와 +의 산술자를 더했을때 -> 3 + 2 = 5 가 출력되도록
		 * Ex2) 입력값을 6과 3의 정수와 /의 산술자를 더했을때 -> 6 / 3 = 2 가 출력되도록
		 * 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력~!! 이라고 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수를 아래에 입력해주세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 아래에 입력해주세요");
		int num2 = scan.nextInt();
		int sum;
		System.out.println("연산자[ +, -, *, /, % ] 중 하나를 입력해주세요");
		char ch = scan.next().charAt(0);
		
		
		switch (ch) {
		case '+':
			ch = '+'; 
			sum = num1 + num2;
			System.out.println("입력된 값은 아래와 같습니다.");
			System.out.println("" + num1 + ch + num2 + " = " + sum);
			break;
		case '-':
			ch = '-'; 
			sum = num1 - num2;
			System.out.println("입력된 값은 아래와 같습니다.");
			System.out.println("" + num1 + ch + num2 + " = " + sum);
			break;
		case '*':
			ch = '*'; 
			sum = num1 * num2;
			System.out.println("입력된 값은 아래와 같습니다.");
			System.out.println("" + num1 + ch + num2 + " = " + sum);
			break;
		case '/':
			ch = '/'; 
			sum = num1 / num2;
			System.out.println("입력된 값은 아래와 같습니다.");
			System.out.println("" + num1 + ch + num2 + " = " + sum);
			break;
		case '%':
			ch = '%'; 
			sum = num1 % num2;
			System.out.println("입력된 값은 아래와 같습니다.");
			System.out.println("" + num1 + ch + num2 + " = " + sum);
			break;
			default: System.out.println("연산자가 잘못 입력 되었습니다.");
					 System.out.println("프로그램을 재시행 바랍니다.");
		}
		
		scan.close();
	}

}
