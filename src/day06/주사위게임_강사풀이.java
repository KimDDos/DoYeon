package day06;

import java.util.Scanner;

public class 주사위게임_강사풀이 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		int random = 0;
		int sum = 0;
		int count = 0;
		int last = 30;
		
		while(sum < last) {   // true 값이 되어야 반복
			System.out.println("주사위를 던지려면 Enter를 누르세요.");
			scan.nextLine();
			// 값을 받는것에 의미가 없기때문에 값을 저장할 필요가 없음
			random=(int)(Math.random()*6)+1;
			sum += random;  // 거리합산
			count++;
			System.out.println("주사위:"+random+"칸 이동 => "+(last - sum)+"칸 남았습니다.");
			// 조건에서 다 처리하기 때문에 if문을 사용하지 않을 수도 있음
		}
		System.out.println("완주~!!, 총 이동횟수 :" +count);
		
		scan.close();
		
		// 프로그래머스, 백준 문제풀이 자주 할 것
		// 다른 사람은 어떻게 푸는지 자주 봐주면 좋음
	}

}
