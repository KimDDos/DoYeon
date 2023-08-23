package day06;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0:가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력(숫자, 문자 상관없음)
		 * 결과 => 
		 * 컴퓨터 > 가위, 나 > 가위  =>  결과 무승부입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("== 가위바위보 게임 ==");
		
		int comNum = (int)(Math.random()*3);
		int user1 = 0;
		String user2 = null;
		String result = null;
		String[] result1 = {"가위", "바위", "보"}; 
		
		System.out.println("0~2까지의 숫자 혹은 가위, 바위, 보 중 하나를 입력해주세요.");
		System.out.println("0:가위, 1:바위, 2:보");
		user2 = sc.next();
		
		for (;;) { // 예외처리 및 입력값 비교
			if (user2.equals("0") || user2.equals("가위")) {
				user1 = 0;
				break;
			} else if (user2.equals("1") || user2.equals("바위")) {
				user1 = 1;
				break;
			} else if (user2.equals("2") || user2.equals("보")) {
				user1 = 2;
				break;
			} else {
				System.out.println("입력한 값이 올바르지 않습니다. 다시 입력해주세요.");
				user2 = sc.next();
			}
		}

		switch (user1) {
		case 0:
			if(comNum==0) {
				System.out.println("컴퓨터 > "+ result1[comNum] + ", 유저 > " + result1[user1]);
				System.out.println();
				}
			if(comNum==1) {	}
			if(comNum==2) {	}
			break;
		case 1:
			if(comNum==0) {	}
			if(comNum==1) {	}
			if(comNum==2) {	}
			break;
		case 2:
			if(comNum==0) {	}
			if(comNum==1) {	}
			if(comNum==2) {	}
			break;

		default:
			System.out.println("잘못된 값이 출력되었습니다. 다시 실행해주세요.");
			break;
		}
		
//		if (comNum == 0 && user1 == 1) {
//			result = "내가 승리~!";
//		} else if (comNum == 0 && user1 == 2) {
//			result = "컴퓨터가 승리~!";
//		} else if (comNum == user1) {
//			result = "무승부";
//		} else if (comNum == 1 && user1 == 0) {
//			result = "컴퓨터가 승리~!";
//		} else if (comNum == 1 && user1 == 2) {
//			result = "내가 승리~!";
//		} else if (comNum == 2 && user1 == 0) {
//			result = "내가 승리~!";
//		} else { // comNum(2) user1(1)
//			result = "컴퓨터가 승리~!";
//		}
		
		System.out.println("컴퓨터 > "+ result1[comNum] + ", 유저 > " + result1[user1]);
		System.out.println("결과 : " + result);
		
		sc.close();
		
		
	}

}
