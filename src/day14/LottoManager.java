package day14;

import java.util.Scanner;

public class LottoManager implements Program{

	LottoE user = new LottoE();
	private int[] arr = new int[7];
	
	
	@Override
	public void createLotto(Scanner sc) {
		while(user.getCnt()<6) {
		System.out.println((user.getCnt()+1)+"번째 번호를 입력해주세요.");
			int num = sc.nextInt();
			user.insertNums(num);
		}
		user.printUser();
		System.out.println();
	}


	@Override
	public void createLottoAuto() {
		System.out.println("로또번호를 자동으로 생성합니다.");
		arr = user.autoNums();
		
		
	}

	@Override
	public void insertLottoAuto() {
//		user.randomArray();
	}

	@Override
	public void checkLotto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printLotto() {
		// TODO Auto-generated method stub
		
	}

}
