package day09;

import java.util.Scanner;

public class Day08_과제풀이 {

	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) => 중복 X
		 * user가 3자리 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 없으면 out
		 * => 3 5 7
		 * 	  3 6 7 => 2s
		 * 	  3 5 7
		 * 	  3 7 6 => 1s 1b
		 * 	  3 5 7
		 * 	  7 3 5 => 3b
		 * 	  3 5 7
		 * 	  1 2 6 => out
		 * 
		 * 	  --야구게임 시작
		 * 	  컴퓨터가 숫자를 정했습니다.
		 * 	  숫자 입력(1~9, 3자리) : 
		 * 	  3 4 5
		 *    결과
		 *    3s 다맞으면 종료 (게임 횟수 출력)
		 * */
		
		int count=0;
		
		
		// lotto 메서드의 randomArray 배열과 printArray 배열을 호출
		// static 메서드는 객체 생성없이 클래스명.메서드명()으로 호출이 가능.
//		System.out.println();
//		Lotto.randomArray(comNum);
//		Lotto.printArray(comNum);
		
		// static이 아닌 경우 객체를 생성하여 객체명.메서드명() 호출가능.
//		Lotto l = new Lotto();
//		l.randomArray(comNum);
//		l.printArray(comNum);
		
		System.out.println("야구게임 시작 >");
		System.out.println("컴퓨터가 숫자를 결정하였습니다.");
		
		//4. 사용자 숫자 입력받기
		// 사용자가 답을 맞출때까지 시행해야하기 때문에 while문의 true로 설정
//		while(true) {
//			int s=0;
//			int b=0;
//			System.out.println("숫자 입력(1~9, 숫자 3개) > ");
//			
//			for(int i=0; i<muNum.length; i++) {
//				myNum[i] = Scan.nextInt();
//			}
//			count++;  // 게임 횟수 카운트 증가
//			
//			for(int i=0; i<ComNum.length; i++) {
//				for(int j=0; j<myNum.length; j++) {
//					// 스트라이크 기준 자리와 숫자가 일치
//					if(comNum[i] == myNum[j] && i == j) {
//						s++;
//					} else if(comNum[i] == myNum[j] && i != j) {
//						b++;
//					}
//				}
//			}
//			
//			// 출력
//			if(s==0 && b==0) {
//				System.out.println("OUT!!");
//			} else {
//				System.out.println(s + "s "+b+"b");
//				System.out.println("게임횟수 "+count);
//			}
//			
//			if(s==3) {
//				System.out.println("정답~!!");
//				System.out.println("게임횟수 "+count);
//				break;  // while 구문 벗어남.
//			}
//		}
		
		scan.close();
	}

}
