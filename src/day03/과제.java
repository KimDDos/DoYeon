package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * up/down 게임 1~50사이의 랜덤수를 생성하여 맞추는 게임 
		 * ex) 컴퓨터가 랜덤 수 생성 : 
		 * 35 입력> 10 up~!! 입력> 20
		 * up~!! 입력> 40 down~!! 입력> 35 정답~!!
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Up & Down Game~!");
		System.out.println("1부터 50사이의 정수를 입력해주세요!");
		int comNumber = (int) (Math.random() * 50) + 1;
		int num = scan.nextInt();

		for (;;) { // 예외처리
			if (0 >= num || num > 50) {
				System.out.println("잘못된 정수를 입력하셨습니다. 다시 입력해주세요");
				num = scan.nextInt();
			} else {
				break;
			}
		}

		for (;;) {
			System.out.println("1부터 50사이의 정수를 입력해주세요!");
			num = scan.nextInt();
			if (num > comNumber) {
				System.out.println("Down~! 낮은 숫자를 새로 입력해!");
			} else if (num < comNumber) {
				System.out.println("Up~! 높은 숫자를 새로 입력해!");
			} else {
				System.out.println("정답!");
				break;
			}
		}

		scan.close();
	}
}
		
		
		
		
		
//			if(0 >= num || num > 50){
//			System.out.println("1~50까지의 랜덤한 숫자를 맞춰주세요!");
//			}
		
		
		
		
		
//		for(; ; ) {
//			if(0 >= num || num > 50){
//				num = scan.nextInt();
//				System.out.println("1~50까지의 랜덤한 숫자를 맞춰주세요!");
//			} for(;;) {
//				if(0 < num && num < comNumber) {
//					System.out.println("Up!");
//					break a;
//				} else if(50 >= num && num > comNumber) {
//					System.out.println("Down~!");
//					break a;
//				} else if(num == comNumber) {
//					System.out.println("정답!");
//					break a;
//				} else if(0 >= num || num > 50) {
//					num = scan.nextInt();
//					System.out.println("1~50까지의 랜덤한 숫자를 맞춰주세요!");
//					break a;
//				} else {
//					System.out.println("잘못된 입력입니다.");
//					break a;
//				}
//			}
//		scan.close();

