package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map03 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 과목 : 점수, 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복 (종료키워드 = 0)
		 * 과목 > 국어 점수 > 89
		 * 다시 입력? 종료(0) > 
		 * 종류 후 저장한 과목:점수 및 합계, 평균 출력 
		 * */
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> std = new HashMap<String, Integer>();
		String subject = null;
		int score=0;
		int sum=0;
		int menu=-1;
		
		do {
			System.out.println("점수를 입력할 과목을 입력해주세요.");
			subject = sc.next();
			System.out.println("입력한 과목의 점수를 입력해주세요.");
			score = sc.nextInt();
			std.put(subject, score);
			System.out.println("계속:1 ,종료: 0");
			menu = sc.nextInt();
		} while (menu != 0);

		for (String tmp : std.keySet()) {
			System.out.println(tmp + ":" + std.get(tmp));
			sum += std.get(tmp);
		}
		System.out.println("==입력결과==");
		System.out.println("점수합계:"+sum);
		System.out.println("점수평균:"+(int)sum/std.size());
	}

}
