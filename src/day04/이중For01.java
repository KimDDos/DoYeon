package day04;

import day02.IF02;

public class 이중For01 {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5 * 5로 별찍기
		 * */
		
		
		for (int i = 1; i <= 5; i++) { // outer for문 // 1 2 ...
			for (int j = 1; j <= 5; j++) { // 1~5 1~5 ...
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 별찍기
		 * 
		 * *        i=1, j=1
		 * **       i=2, j=2
		 * ***      i=3, j=3
		 * ****     i=4, j=4
		 * *****    i=5, j=5 
		 * 별이 하나씩 늘어나는 구조
		 */
		System.out.println("--------------");
		
		for (int i = 1; i <= 5; i++) { // outer for문
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		// 위 아래 똑같은 구문임
		
		for (int i = 1; i <= 5; i++) { // outer for문
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}

		System.out.println("-------------");
		
		/*
		 * 별찍기
		 * 
		 *      *   i=1, o=4, *=1
		 *     **   i=2, o=3, *=2
		 *    ***   i=3, o=2, *=3
		 *   ****   i=4, o=1, *=4
		 *  *****   i=5, o=0, *=5 
		 */
		
		for(int i=5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		// 강사 문제풀이
		// if문 이용하는 방법
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(j <= 5-i) {                    // 기준이 되는 J기준으로 생각하기
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		// 
		for(int i=1;i<=5;i++) {                  //   1    2    3
			// 공백
			for(int j=1; j<=5-i; j++) {          //  1~4  1~3  1~2
				System.out.print(" ");
			}
			// 별
			for(int k=1; k<=i; k++) {            //   1   1~2  1~3
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		
	}

}

