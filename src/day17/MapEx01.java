<<<<<<< HEAD
package day17;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용한 성적관리 프로그램을 생성
		 * --menu--
		 * 1. 성적추가
		 * 2. 성적조회(전체출력) : 합계/평균 같이 출력
		 * 3. 성적조회(과목조회) : 국어 => 98점 서치후 일치하는 과목 출력
		 * 4. 성적수정 : 서치후 수정
		 * 5. 성적삭제
		 * 6. 종료
		 * 
		 * CRUD 만 할줄알면 다 하는거임
		 * C(create) : 생성
		 * R(read) : 읽기(조회)
		 * U(update) : 수정
		 * D(delete) : 삭제
		 * */
		
		HashMap<String, Integer> sub = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		
		do {
			String str=null;
			int score=0;
			int count=0;
			int sum=0;
			System.out.println("==== Menu ====");
			System.out.println("1. 성적추가");
			System.out.println("2. 성적조회(전체출력)");
			System.out.println("3. 성적조회(과목조회)");
			System.out.println("4. 성적수정");
			System.out.println("5. 성적삭제");
			System.out.println("6. 종료하기");
			System.out.print("입력 > ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:	
				System.out.println("추가할 과목과 점수를 입력해주세요.");
				System.out.println("Ex) 국어 86");
				str=sc.next();
				score=sc.nextInt();
				sub.put(str, score);
				break;
			case 2:	
				for(String tmp : sub.keySet()) {
					System.out.println(tmp+":"+sub.get(tmp)+"점");
					sum+=sub.get(tmp);
				}
				System.out.println("합계:"+sum+", 평균:"+(double)sum/sub.size());
				break;
			case 3:	
				System.out.println("조회할 과목을 입력해주세요.");
				str=sc.next();
				for(String tmp : sub.keySet()) {
					if(tmp.equals(str)) {
						System.out.println(tmp+":"+sub.get(tmp)+"점");
						count++;
					} 
				}
				if(count==0) {
					System.out.println("일치하는 과목이 없습니다.");
				}
				break;
			case 4:	
				System.out.println("수정할 과목과 점수를 입력해주세요.");
				str=sc.next();
				score=sc.nextInt();
				sub.put(str, score);
				break;
			case 5:	
				System.out.println("삭제할 과목을 입력해주세요.");
				str=sc.next();
				sub.remove(str);
				break;
			case 6:	break;
			default:break;
			}
			System.out.println("-------------------------------------");
		} while(menu!=6);
		System.out.println("프로그램 종료");
		
	}
	
=======
package day17;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용한 성적관리 프로그램을 생성
		 * --menu--
		 * 1. 성적추가
		 * 2. 성적조회(전체출력) : 합계/평균 같이 출력
		 * 3. 성적조회(과목조회) : 국어 => 98점 서치후 일치하는 과목 출력
		 * 4. 성적수정 : 서치후 수정
		 * 5. 성적삭제
		 * 6. 종료
		 * 
		 * CRUD 만 할줄알면 다 하는거임
		 * C(create) : 생성
		 * R(read) : 읽기(조회)
		 * U(update) : 수정
		 * D(delete) : 삭제
		 * */
		
		HashMap<String, Integer> sub = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		
		do {
			String str=null;
			int score=0;
			int count=0;
			int sum=0;
			System.out.println("==== Menu ====");
			System.out.println("1. 성적추가");
			System.out.println("2. 성적조회(전체출력)");
			System.out.println("3. 성적조회(과목조회)");
			System.out.println("4. 성적수정");
			System.out.println("5. 성적삭제");
			System.out.println("6. 종료하기");
			System.out.print("입력 > ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:	
				System.out.println("추가할 과목과 점수를 입력해주세요.");
				System.out.println("Ex) 국어 86");
				str=sc.next();
				score=sc.nextInt();
				sub.put(str, score);
				break;
			case 2:	
				for(String tmp : sub.keySet()) {
					System.out.println(tmp+":"+sub.get(tmp)+"점");
					sum+=sub.get(tmp);
				}
				System.out.println("합계:"+sum+", 평균:"+(double)sum/sub.size());
				break;
			case 3:	
				System.out.println("조회할 과목을 입력해주세요.");
				str=sc.next();
				for(String tmp : sub.keySet()) {
					if(tmp.equals(str)) {
						System.out.println(tmp+":"+sub.get(tmp)+"점");
						count++;
					} 
				}
				if(count==0) {
					System.out.println("일치하는 과목이 없습니다.");
				}
				break;
			case 4:	
				System.out.println("수정할 과목과 점수를 입력해주세요.");
				str=sc.next();
				score=sc.nextInt();
				sub.put(str, score);
				break;
			case 5:	
				System.out.println("삭제할 과목을 입력해주세요.");
				str=sc.next();
				sub.remove(str);
				break;
			case 6:	break;
			default:break;
			}
			System.out.println("-------------------------------------");
		} while(menu!=6);
		System.out.println("프로그램 종료");
		
	}
	
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
}