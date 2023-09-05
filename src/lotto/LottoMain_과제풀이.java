package lotto;

import java.util.Scanner;

public class LottoMain_과제풀이 {

	public static void main(String[] args) {
		
		LottoManager_과제풀이 lm = new LottoManager_과제풀이();
		Scanner sc = new Scanner(System.in);
		
//		Lotto_과제풀이 l = new Lotto_과제풀이();
//		l.randomLotto();
//		System.out.println(l);
//		LottoE_과제풀이 le = new LottoE_과제풀이();
//		le.randomLotto();
//		System.out.println(le);
//		
//		int arr[] = {1,2,3,4,5,6};
//		l.insertNumbers(arr);
//		System.out.println(l);
//		
//		int arr2[] = {7,8,9,10,11,12,13};
//		le.insertNumbers(arr2);
//		System.out.println(le);
		int menu=0;
		
		do {
			lm.printMenu();  // 메뉴출력 메서드화 (호출)
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: lm.createLotto(sc);
				break;
			case 2: lm.createLottoAuto();
				break;
			case 3: lm.insertLotto(sc);
				break;
			case 4: lm.checkLotto();
				break;
			case 5: lm.printLotto();
				break;
			case 6: break;
			default: System.out.println("잘못된 메뉴");
			}
			
		}while(menu!=6);
		System.out.println("[ 프로그램 종료 ]");
		
		sc.close();
	}

}
