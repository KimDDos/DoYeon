package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/* 반복적으로 메뉴를 등록하는 프로그램
		 * */
		Scanner sc = new Scanner(System.in);
		Product it = new Product();
		Product[] item = new Product[10];
		String str = null;
		String str1 = null;
		String str2 = null;
		int cnt = 0;

		while (cnt < 10) {
			System.out.println("상품을 등록하시겠습니까? (Y/N)");
			str = sc.next();
			switch (str) {
			case "Y": case "y":
				System.out.println("추가할 메뉴를 입력해주세요.");
				str1 = sc.nextLine();
				System.out.println("추가한 메뉴의 가격을 입력해주세요.");
				str2 = sc.next();
				item[cnt] = new Product(str1, str2);
				cnt++;
				System.out.println("상품 등록을 완료했습니다.");
				System.out.println("-------------------------------");
				break;
			case "N": case "n":
				System.out.println("상품 등록을 취소합니다.");
				if (cnt == 0) {
					System.out.println("저장된 메뉴가 없습니다.");
					break;
				}
				if (cnt != 0) {
					System.out.println("현재까지 등록된 상품 List");
					for (int i = 0; i < cnt; i++) {
						item[i].printMenu();
					}
					System.out.println("-------------------------------");
				}
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			if (cnt == 10) {
				System.out.println("메뉴입력이 완료 됐습니다.");
				break;
			}
			System.out.println("-------------------------------");
			System.out.println("입력을 종료하려면 [end]를 입력해주세요.");
			str = sc.nextLine();
			if (str.equals("end")) {
				System.out.println("입력이 종료됩니다.");
				break;
			}

		}
		sc.close();
	}
}

