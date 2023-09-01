package day12;

import java.util.Scanner;

public class ProductMain_풀이 {

	public static void main(String[] args) {
		Product[] p = new Product[10];
		Scanner sc = new Scanner(System.in);

		char menu = 0;
		int cnt = 0;

		while (menu != 'n') {
			System.out.println("상품등록(y/n) >> ");
			menu = sc.next().charAt(0);

			if (menu == 'y') {
				// 반복 입력
				System.out.println("상품명 > ");
				String name = sc.next();

				System.out.println("가격 > ");
				int price = sc.nextInt();

				// 객체를 생성해서, 메누와 가격을 등록 => 배열 cnt번지에 추가
				// 생성자 이용
//			Product tmp = new Product();
//			p[cnt] = tmp;

				// 메서드 이용
				p[cnt] = new Product();
//			p[cnt].insertMenu(name, price); 
				// 자료형이 달라서 입력이 안 됨, price를 인트로
				cnt++;
			} else {
				// menu == 'n'
				if (menu == 'n') {
					System.out.println("상품등록 종료");
				} else {
					System.out.println("Y/N만 입력해주세요.");
				}
			}
		}
		
		System.out.println("--등록된 상품 리스트--");
		for(int i=0; i<cnt; i++) {
			// toString
			System.out.println((i+1)+"번째 상품"+p[i]);
			
			// 출력 메서드를 사용한 경우
			// System.out.print((i+1));
			// p[i].printMenu();
			
		}
	}

}
