package day06;

import java.util.Scanner;

public class Method03_강사풀이 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 +, -, *, /, %
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산
		 * 0 + 0 = 0  <= 같은 형태로 작성
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==계산기를 만들어보자==");
		System.out.println("연산자를 입력해주세요.");
		String op = scan.next();
		
		System.out.println("두 정수를 입력해주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		// 메서드 완성
		
		switch(op) {
		case "+": 
			add(op, num1, num2);
			break;
		case "-": 
			int r = sub(num1, num2);
			System.out.println(r);
			break;
		case "*": 
			mul(op, num1, num2);
			break;
		case "/": 
			double r1 = div(num1, num2);
			System.out.println(r1);
			break;
		case "%":
			// rem2를 호출하여 몫과 나머지를 출력
//			int r2 = rem(num1, num2);
			// 도저히 이해가 안 되넹?
			double r3[] = rem2(num1, num2);
			System.out.println("몫 : " + r3[0] + ", 나머지 : "+ r3[1]);
			break;
			default:
				System.out.println("잘못된 연산자입니다.");
				break;
		}
		
		System.out.println("계산기 종료!");
		
		
		scan.close();
		
	}

	//값을 연산자까지 매개변수로 받아 리턴없이 출력한 메서드
	public static void add(String op, int num1, int num2) {
		System.out.println(num1 +op+ num2 +"="+(num1+num2));
	}
	
	// 두정수를 매개변수로 받아 결과를 리턴 받는 형태의 메서드
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void mul(String op,int num1, int num2) {
		System.out.println(num1+op+num2 +"="+(num1*num2));
	}
	// 호출해서 사용할때 변수 값의 위치는 자료형에 맞춰서
	
	public static double div(int num1, int num2) {
		return (double) num1 / num2;
	}
	
	public static int rem(int num1, int num2) {
		return num1 % num2;
	}
	
	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴 타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 * 몫과 나머지
	 * */
	public static double[] rem2(int num1, int num2) {
		double[] arr = new double[2];
		// 배열은 매개변수로 받아도 되고, 메서드에서 만들어서 받아도 됨.
		arr[0] = num1 / num2;
		arr[1] = num1 % num2;
		return arr;
		// arr 배열에 맞춰서 값을 알아서 보내줄것임.
		// 배열로 리턴하는 이유는 리턴값은 하나이기에 2개의 값을 리턴할수 없음
		// 따라서 배열을 성언해 두개의 값을 가지도록 선언해서 쓸수있음
	}
	
	
}
