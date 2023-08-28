package day09;

import java.util.Scanner;

public class BaseballGame {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* day08 과제 -> 메서드로 변경
		 * 랜덤번호 생성
		 * 배열에 추가(중복제거 메서드)
		 * 출력 메서드
		 * 스트라이크 메서드
		 * 볼 메서드
		 * */
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		
	}
	
	/* 랜덤번호 생성 : 매개변수로 범위를 설정 
	 * (int)(Math.random()*9)+1;
	 * 매개변수 => 개수, 시작값
	 * if처리 => 개수와 ㅣ작갓의 값이 바뀌어서 들어올 때 처리
	 * */
	public static int random(int n, int k) {
		if(n < k) {
			int temp = n;
			n = k;
			k = temp;
		}
		int ran = (int)(Math.random()*n)+k;
		return ran;
	}
	
	/* 2. 번호를 배열에 저장
	 * */
	public static void randomArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int r = random(9, 1);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != r) {
					arr[i] = r;
				} else {
					i--;
					break;
				}
			}
		}
	}
	
	/* 3. 유저 입력 메서드
	 * */
	
	public static void myNum(int arr[]) {
		System.out.println("숫자를 입력해주세요. (1~9, 3개 정수)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			for(;;) {
				if(1>arr[i] || arr[i]>9) {
					System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
					arr[i] = scan.nextInt();
				} else {
					break;
				}
			}
		}
	}
	
	/* 출력메서드
	 * */
	
	
}
