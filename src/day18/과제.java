package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 과제 {

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
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> memoList = new ArrayList<Word>();
		int menu=0;
		
		memoList.add(new Word("Apple","사과"));
		memoList.add(new Word("Car","차"));
		memoList.add(new Word("Banana","바나나"));
		
		do {
			System.out.println("=== 단어장 Menu ===");
			System.out.println("1. 입력 | 2. 전체출력 | 3. 조회(단어검색) | 4. 수정 | 5. 삭제");
			menu=sc.nextInt();
			
			switch (menu) {
			case 1:	
				System.out.println("단어와 의미를 입력해주세요.");
				String word = sc.next(); 
				String means = sc.next(); 
				if(word==null || means==null) {
					System.out.println("공백으로 넣을수 없습니다.");
				}
				memoList.add(new Word(word, means));
				System.out.println("입력 완료");
				break;
			case 2:	
				System.out.println(memoList);
//				memoList.sort(new Comparator<Word>() {
//
//					@Override
//					public int compare(Word o1, Word o2) {
//						// TODO Auto-generated method stub
//						return o1-o2;
//					}
//				});
				
				
				break;
			case 3:	
				
				break;
			case 4:	break;
			case 5:	break;
			default: System.out.println("잘못된 입력입니다.");
			}
			
		} while(menu!=5);
		
		
	}
	
	
}
