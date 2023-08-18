package day02;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 수를 입력받아서 2의 배수가 맞으면 2의 배수입니다.
		 * 3의 배수가 맞으면 3의 배수입니다.
		 * import 단축키 : ctrl + shift + o
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int num1 = scan.nextInt();
		
		if(num1 % 3 == 0 && num1 % 2 == 0) {
			System.out.println(num1 + "는 2와 3의 배수입니다.");
		} else if(num1 % 3 == 0) {
			System.out.println(num1 + "는 3의 배수입니다.");
		} else if(num1 % 2 == 0) {
			System.out.println(num1 + "는 2의 배수입니다.");
		} else {
			System.out.println(num1 + "는 2와 3의 배수가 아닙니다.");
		}
		
		scan.close();
		
	}

}
