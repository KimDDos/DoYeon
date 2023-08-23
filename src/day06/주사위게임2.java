package day06;

import java.util.Scanner;

import day02.IF02;

public class 주사위게임2 {

	public static void main(String[] args) {
		/* while 문으로 만들어보기 
		 * 
		 * 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex) 
		 * 주사위 : 3
		 * 칸 이동  ->  27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동  -> ??칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 0번 완주이라고 출력
		 * */
		Scanner sc = new Scanner(System.in);
		
		String str = "주사위 던짐";
		String input = null;
		int ran = 0;
		int move = 30;
		int i = 0;
		
		while(move > 0) {
			System.out.println("주사위 던짐을 입력해주세요!");
			input = sc.nextLine();
			// next(); 는 공백을 포함하지 않는다.... 이걸 깜빡
			// nextLine(); 공백을 포함하는 문자열을 입력
			for(;;) { // 예외처리
				if(str.equals(input)) {
					break;
				}
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println("주사위 던짐을 입력해주세요!");
				input = sc.nextLine();
			}
			ran = (int)(Math.random()*6)+1;
			i++;
			move -= ran; 
			System.out.println("주사위 합 > " +ran+ ", 총 " +move+ "칸이 남았습니다.");
			if(move<=0) {
				System.out.println("완주~! 총 " +i+ "번의 주사위를 던지셨습니다." );
			}
		}
		
		sc.close();
		
	}

}
