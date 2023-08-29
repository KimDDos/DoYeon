package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex) 
		 * 3, * => ***
		 * 5, o => ooooo
		 * 7, ☆ => ☆☆☆☆☆☆☆
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드호출 => 출력
		 * */
		symbol(3, '*');
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자와 기호를 입력 > ");
		int num = scan.nextInt();
		char ch = scan.next().charAt(0);
		symbol(num, ch);
		
		scan.close();
		
		
	}

	public static void symbol(int num, char ch) {
		for(int i=1; i<=num; i++) {
			System.out.print(ch);
		}
	}
	
	
	
}
