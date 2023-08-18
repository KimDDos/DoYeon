package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		/* num = 6의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * */
		
		// 1부터 num 까지 1씩 증가 
		int num = 6;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println(); // 줄바꿈용
		
		// num 입력을 받아서 그 수의 약수를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("약수를 구할 정수를 입력해주세요.");
		int num1 = scan.nextInt();
		
		System.out.print(num1+ "의 약수 : ");
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
		}
		
		scan.close();
		
		System.out.println();
		
		
	}

}
