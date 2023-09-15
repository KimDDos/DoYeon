package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Word.Word;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* Word Package에서 생성한 Word 클래스를 사용하여
		 * 단어장 프로그램 작성
		 * 1. 단어등록 | 2.단어검색 | 3. 단어수정 
		 * 4.단어출력 | 5. 단어삭제 | 6.단어파일로 출력 | 7.종료
		 * */
		Scanner sc = new Scanner(System.in);
		List<Word> list = new ArrayList<>();
		final String Path_out = "Word.txt";
		PrintWriter pw = new PrintWriter(new FileWriter(Path_out));
		BufferedReader br = new BufferedReader(new FileReader("Word.txt"));
		int menu=0;
		
		list.add(new Word("Apple", "사과"));
		list.add(new Word("Car", "자동차"));
		list.add(new Word("double", "두배"));
		list.add(new Word("easy", "숩다수워"));
		
		do {
			System.out.println("=== 단어장 프로그램===");
			System.out.println("1.단어등록 | 2.단어검색 | 3.단어수정");
			System.out.println("4.단어출력 | 5. 단어삭제 | 6.단어파일로 출력");
			System.out.println("7. 종료");
			System.out.println(">> 메뉴 >");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.println("단어와 의미를 입력해주세요. (예) Apple 사과");
				String word = sc.next();
				String mean = sc.next();
				list.add(new Word(word, mean));
				System.out.println("입력완료~!");
				break;
			case 2:
				int count=0;
				System.out.println("검색할 단어를 입력해주세요.");
				word = sc.next();
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getWord().equals(word)) {
						System.out.println(list.get(i));
						count++;
					}
				}
				if(count==0) {
					System.out.println("일치하는 단어가 없습니다.");
				}
				break;
			case 3: 
				count=0;
				System.out.println("수정할 단어를 입력해주세요.");
				word = sc.next();
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getWord().equals(word)) {
						list.remove(i);
						System.out.println("수정할 단어와 의미를 입력해주세요. (예) Apple 사과");
						word = sc.next();
						mean = sc.next();
						list.add(new Word(word, mean));
						System.out.println("수정완료~!");
						count++;
					}
				}
				if(count==0) {
					System.out.println("일치하는 단어가 없습니다.");
				}
				break;
			case 4: 
				System.out.println("---단어장------------");
				for(int i=0; i<list.size(); i++) {
					System.out.println((i+1)+". "+list.get(i).getWord()+" : "+list.get(i).getMean());
				}
				break;
			case 5: 
				count=0;
				System.out.println("삭제할 단어를 입력해주세요.");
				word = sc.next();
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getWord().equals(word)) {
						list.remove(i);
						System.out.println("삭제완료~!");
						count++;
					}
				}
				if(count==0) {
					System.out.println("일치하는 단어가 없습니다.");
				}
				break;
			case 6: 
				for(int i=0; i<list.size(); i++) {
					pw.println((i+1)+". "+list.get(i).getWord()+" : "+list.get(i).getMean());
				}
				pw.close();
				for(int i=0; i<list.size(); i++) {
					String line = br.readLine();
					System.out.println(line);
				}
				br.close();
				break;
			case 7:  break;
			default: System.out.println("메뉴를 다시 입력해주세요.");
			}
			
		} while(menu!=7);
		System.out.println("프로그램 종료~!!");
	}

}
