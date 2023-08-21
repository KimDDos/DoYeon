package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13, 17, ...
		 * 
		 * */
		
		/* num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13  => 소수입니다.
		 * 	   num = 12  => 소수가 아닙니다.
		 * */
		// 입력받은 수의 약수가 몇개인지 확인
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수를 판단할 숫자를 입력해주세요.");
//		
//		int num = scan.nextInt();
//		int count = 0;
//		for(int i=1; i <= num; i++) {
//			if(num % i == 0) {
//				// System.out.print(i + " ");
//				count += 1;  // count++;
//				// 약수의 개수를 카운팅할때 사용하는 방법임.
				// 약수의 개수로서 소수를 구할때 소수의 특징인 1과 자기자신의 수 2개만 가지는 성질을 이용한것임
				// 
//				} 
//			}
//		System.out.println(count);
//		
//		if(count == 2) {
//			System.out.println("소수입니다.");
//		} else {
//			System.out.println("소수가 아닙니다.");
//		}
//		
//		scan.close();
		/* 2~100까지 중 소수를 출력
		 * */
		int count1 = 0;
		for (int i = 2; i <= 100; i++) {  // num 1~100까지
			count1 = 0;  // 각 num마다 약수의 개수를 = 0 부터 시작
			for (int k = 1; k <= i; k++) {  // 약수를 구하기 위해 돌리는 값
				if (i % k == 0) {   // 약수
					count1 += 1;
				}
			}
			// 약수가 2개인지 체크, 선행 for문이 끝나는 지점에서 약수 갯수가 2개인 수만 확인
			if (count1 == 2) {
				System.out.print(i + " ");
			}
		}
		// 이중 for문은 안쪽 for문을 돌리고나서, 밖에 있는 for문을 다시 돌리는 구조임

	}

}

