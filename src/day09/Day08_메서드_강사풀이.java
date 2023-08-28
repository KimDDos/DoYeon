package day09;

import java.util.Scanner;

public class Day08_메서드_강사풀이 {

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
		
		// 랜덤수 범위
		int count = 9;
		int start = 1;
		int s=0, b=0;
		int cnt =0; // 게임 횟수
		
		Scanner scan = new Scanner(System.in);
		randomArray(comNum, count, start);
		System.out.println("> 야구게임 시작~!!");
		System.out.println("컴퓨터가 수를 결정하였습니다.");
		
		while(s!=3) {
			// 사용자 번호 받기
			System.out.println("1~9까지 세개의 숫자를 입력해주세요");
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = scan.nextInt();
			}
			cnt++;
			
			// 결과출력
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			
			if(s!=0) {
				System.out.print(s+"s ");
			}
			if(b!=0) {
				System.out.print(b+"b ");
			}
			System.out.println(); //줄바꿈용
			System.out.println("게임횟수 : "+cnt);
			if(s==0 && b==0) {
				System.out.println("out~!!");
			}
			if(s==3) {
				System.out.println("정답~!!");
				break;
			}
		}
		
		scan.close();
		

	}

	/* 랜덤번호 생성 : 매개변수로 범위를 설정 
	 * (int)(Math.random()*9)+1;
	 * 매개변수 => 개수, 시작값
	 * if처리 => 개수와 ㅣ작갓의 값이 바뀌어서 들어올 때 처리
	 * */
	
	public static int random(int count, int start) {
		if(count < start) {
			int tmp = count;
			count = start;
			start = tmp;
		}
		return (int)(Math.random()*count)+start;
	}
	
	
	// 중복확인 메서드
	// boolean 값으로
	public static boolean isContain(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	// 배열 생성 메서드
	// 리턴 boolean : 배열이 잘 생성되면 true, 아니면 false 리턴
	// 매개변수 : 배열, count, start
	public static boolean randomArray(int arr[], int count, int start) {
		if(arr==null) {
			return false;
		}
		if(count < arr.length) {
			return false;
		}
		// error가 생길수 있는 상황으 메서드에서 미실행하도록 설정
		int i=0;
		while(i < arr.length) {
			int r = random(count, start);
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	
	// 배열 출력 메서드
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	// 스트라이크 메서드
	// 기능 : com[], my[] 위치와 값이 일치하면 count 리턴
	public static int strike(int com[], int my[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(com[i] == my[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 볼 메서드
	// 기능 : com[], my[] 위치 상관없이 일치하면 카운트 증가 리턴
	public static int ball(int com[], int my[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(isContain(my, com[i])) { // 위치상관없이 일치이기에 스트라이크 포함
				cnt++;
			}
		}
		// 스트라이크를 포함하고 있는 개수
		return cnt - strike(com, my);
	}
	
	
	
	
	
}
