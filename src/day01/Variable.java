package day01;

import java.io.IOException;

public class Variable {
	
	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수선언 + 초기화
		 * 자료형(타입) 변수명 = 값;
		 */
		
		int num = 123;  // 선언 + 초기화
//		자료형 변수명 대입연산자 리터럴
//			 매개변수
		System.out.println(num);  // 줄바꿈
		
//		int num = 456;  // 중복선언 불가능
		
		num = 456;  //  = 대입 연산자로 오른쪽 항의 연산이 다 끝난이후 왼쪽항으로 값을 입력함
//						  앞의 변수에 뒤에 있는 값을 저장(덮어쓰기)
		System.out.println(num);
		
		int num1 = 78, num2 = 45, num3 = 89; // 같은 자료형에서는 가능!
		
		num1 = 789;
		System.out.println(num1);
		
		// 8개의 기본 자료형은 지역변수 범위(scope) {   } 안에서만 허용이 된다.
		
		// 명령어 {} 
		int a = 0;
		if(true) {
			a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
//		한글자마나 저장 가능 char = '';
		char ch = 'a'; // "" -> 문자열(String) / '' -> 한글자(char)
		double dou = 3.0;
		byte b = 1;
		boolean boo = true;  // true, false로만 저장가능
		
//		float / long 자료형은 접미사를 반드시 붙여야 인식됨.
//		float(f F)     long(l L)
		float f = 1.2f;
		
		num2 = 010;  // 8진수로 인식 (0~7까지 8 -> 10)
		num3 = 0x10; // 16진수 인식 (0~15(ABCDEF)까지 16 -> 10)
		
		// +, -, *, /, %(나머지)
		
		// 국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고,
		// 값을 입력하여, 세 정수의 합을 콘솔에 출력

		int kor = 85, eng = 75, math = 80;
		int sum = kor + eng + math;
		System.out.println("국어, 영어, 수학점수 합계 : " + sum + "점");
		// + 연결연산자
		System.out.println("국어, 영어, 수학점수 합계 : " + (kor + eng + math) + "점");
		// 문자열로 시작을 하면 뒤에 숫자로 인식하지 못함, 따라서 ()를 통해서 숫자연산을 따로 반영하는 것이 좋음
		// 문자열로 시작하면 뒤에 변수들도 문자열로 인식함!!
	}

}
