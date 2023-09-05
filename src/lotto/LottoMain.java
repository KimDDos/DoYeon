package lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LottoManager lm = new LottoManager();
		int menu=0;
		
		do {
			System.out.println("==Lotto 복권 추첨==");
			System.out.println("[1.로또 수동|2.로또 자동|3.당첨번호 생성]");
			System.out.println("[4.현재회차 당첨번호|5.역대당첨번호 조회|6.종료]");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1: lm.createLotto(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
			}
			
		} while(menu!=6);
		System.out.println("프로그램 종료");
		
	}

}
