<<<<<<< HEAD
package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 과제_풀이 {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * bananan : 바나나
		 * 
		 * 단어를 추가, 출력(ABC순서대로 정렬) 
		 * 조회(검색할때 F만 들어간다던지 하는 조건), 수정, 삭제
		 * 
		 * 
		 * */
		// 자료구조는 객체를 담는 변수
		// 객체는 반드시 생성(New)해서 list에 add (배열이든, 리스트든, 셋이든)
		ArrayList<Word_풀이> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int menu=-1;
		
		list.add(new Word_풀이("Apple", "사과"));
		list.add(new Word_풀이("Car", "자동차"));
		list.add(new Word_풀이("Double", "두배"));
		list.add(new Word_풀이("banana", "바나나"));
		
		do {
			// 메뉴의 값이 0이면 그만 입력, 그전까지는 계속 입력
			System.out.println("단어를 입력하시겠습니까? (계속:1, 종료:0)");
			menu = scan.nextInt();
			if(menu==0) {
				System.out.println("입력종료");
				break;
			} else {
				System.out.println("단어입력:");
				String word = scan.next();
				
				System.out.println("의미입력:");
				String mean = scan.next();
				
				Word_풀이 w = new Word_풀이(word, mean);
				list.add(w);
			}
			
		} while(menu !=0);
		
		// 정렬
		Collections.sort(list);
		for(Word_풀이 tmp:list) {
			System.out.println(tmp);
		}
		
		
		scan.close();
	}

}
=======
package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 과제_풀이 {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * bananan : 바나나
		 * 
		 * 단어를 추가, 출력(ABC순서대로 정렬) 
		 * 조회(검색할때 F만 들어간다던지 하는 조건), 수정, 삭제
		 * 
		 * 
		 * */
		// 자료구조는 객체를 담는 변수
		// 객체는 반드시 생성(New)해서 list에 add (배열이든, 리스트든, 셋이든)
		ArrayList<Word_풀이> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int menu=-1;
		
		list.add(new Word_풀이("Apple", "사과"));
		list.add(new Word_풀이("Car", "자동차"));
		list.add(new Word_풀이("Double", "두배"));
		list.add(new Word_풀이("banana", "바나나"));
		
		do {
			// 메뉴의 값이 0이면 그만 입력, 그전까지는 계속 입력
			System.out.println("단어를 입력하시겠습니까? (계속:1, 종료:0)");
			menu = scan.nextInt();
			if(menu==0) {
				System.out.println("입력종료");
				break;
			} else {
				System.out.println("단어입력:");
				String word = scan.next();
				
				System.out.println("의미입력:");
				String mean = scan.next();
				
				Word_풀이 w = new Word_풀이(word, mean);
				list.add(w);
			}
			
		} while(menu !=0);
		
		// 정렬
		Collections.sort(list);
		for(Word_풀이 tmp:list) {
			System.out.println(tmp);
		}
		
		
		scan.close();
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
