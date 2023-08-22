package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 파일명 5개가 주어졌을때, 원하는 단어를 입력하면 입력한 단어가
		 * 있는 파일들을 출력하도록 코드를 작성하시오.
		 * 
		 * 제출
		 * 파일에 대한 검색결과를 받아야 하는거임
		 * */
		
		/* split 으로 확장자명 확인하는 코드
		 * compareTo로 검색한 문자열 일치 여부 확인
		 * */
		
		String[] fileName = { "java의 정석.txt", "이것이 java다.jpg", "String메서드.txt", "String함수.jpg", "java의 함수.png" };
		String result = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("찾고싶은 단어를 입력하세요.");
		String str = sc.next().toString();

		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].contains(str)) {
				System.out.println(fileName[i]);
			} 
			
		}

		sc.close();

	}

}
