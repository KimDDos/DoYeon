package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아서 
		 * 합계와 평균, 평가를 출력
		 * 평가는 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 평균이 나머지는 D
		 * 
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값이라고 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("국어 점수를 입력해주세요.");
//		int kor = scan.nextInt();
//		if(kor < 0) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//			System.out.println("국어 점수를 다시 입력해주세요.");
//			kor = scan.nextInt();
//		} else if(kor > 100) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//			System.out.println("국어 점수를 다시 입력해주세요.");
//			kor = scan.nextInt();
//		} else {}
//		System.out.println("--------------------");
//		
//		System.out.println("영어 점수를 입력해주세요.");
//		int eng = scan.nextInt();
//		if(eng < 0) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//			System.out.println("영어 점수를 다시 입력해주세요.");
//			eng = scan.nextInt();
//		} else if(eng > 100) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//			System.out.println("영어 점수를 다시 입력해주세요.");
//			eng = scan.nextInt();
//		} else {}
//		System.out.println("--------------------");
//		
//		System.out.println("수학 점수를 입력해주세요.");
//		int math = scan.nextInt();
//		if(math <= 0) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//			System.out.println("수학 점수를 다시 입력해주세요.");
//			math = scan.nextInt();
//		} else if(math > 100) {
//			System.out.println("잘못된 값을 입력하셨습니다.");
//			System.out.println("수학 점수를 다시 입력해주세요.");
//			math = scan.nextInt();
//		} else {}
//		System.out.println("--------------------");
//		
//		int sum = kor + eng + math;
//		double avg = (int)sum / 3;
//		char ch;
//		
//		if(avg >= 80) {
//			if(avg >= 90) {
//				ch = 'A';
//			} else {
//				ch = 'B';				
//			}
//		} else if (avg >= 70) {
//			ch = 'C';
//		} else {
//			ch = 'D';
//		}
//		System.out.println("국어 : " + kor + "점, 영어 : " + eng + "점, 영어 : " + math);
//		System.out.println("총점 : " + sum + ", 평균 : " + avg + "로 등급은 " + ch + "입니다.");		
//		
//	
//		scan.close();
		
		// 강사 문제풀이
		
		// 입력 안내문자
		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력");
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if(kor <0 || kor >100) {
			System.out.println("국어점수가 입력 범위를 벗어났습니다.");
		}
		if(eng <0 || eng >100) {
			System.out.println("영어점수가 입력 범위를 벗어났습니다.");
		}
		if(math <0 || math >100) {
			System.out.println("수학점수가 입력 범위를 벗어났습니다.");
		}
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계: " + sum + ", 평균: " + avg);

		char ch = 'D';  // char 형태는 ''
		if(avg > 100 || avg < 0) {
			System.out.println("잘못된 성적");
		} else if(avg >= 90) {
			ch = 'A';
		} else if(avg >= 80) {
			ch = 'B';
		} else if(avg >= 70) {
			ch = 'C';
		} else {
			ch = 'D';
		}
		
		System.out.println("평가 : " + ch);
		
		scan.close();
	}

}
