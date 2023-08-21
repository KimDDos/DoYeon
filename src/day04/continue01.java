package day04;

import java.net.SocketTimeoutException;

public class continue01 {

	public static void main(String[] args) {
		/* Continue : pass, skip 키워드
		 * 1~10까지 출력, 5마 빼고
		 * 
		 * 
		 * */
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue;  // 조건에 맞다면 건너뚜기
				// 이것만 빼고라는 느낌이 강함
			}
			System.out.print(i+ " ");
		}
		
		System.out.println();
		/* 1부터 10까지중 홀수만 출력
		 * 짝수일때 continue를 써서 출력
		 * */
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				continue;
				}
			System.out.print(i+" ");
		}
		
	}

}
