package day19;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 수강관리 프로그램 List 작성
		 * 1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
		 * suject가 List
		 * 
		 * 기존 배열의 수강관리프로그램을 List로 변경해서 구현
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		StudentManager_과제 sm = new StudentManager_과제();
		
		sm.printStudent();
		
		
	}

}