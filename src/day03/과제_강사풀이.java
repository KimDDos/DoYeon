package day03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class 과제_강사풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*50)+1;
		
		System.out.println("1~50 사이의 정수를 입력해주세요.");
		System.out.println("기회는 5번~!!");
		
		int num=0;
		for(int i=1; i<=5; i++) {
			System.out.println("입력>");
			num = scan.nextInt();
			if(num == random) {
				System.out.println("정답입니다~!");
				break;
			} else if(num < random ) {
				System.out.println("Up~!! " + i + "번 실행");
				
			} else {
				System.out.println("Down~!! " + i + "번 실행");
			}
		}
		System.out.println("기회가 모두 끝났습니다.");
		scan.close();
	}

}
