package lotto;

import java.util.Scanner;

import javax.management.remote.rmi.RMIServer;

public class LottoManager_과제풀이 implements LottoProgram{

	// 멤버변수
	LottoE_과제풀이 lotto[] = new LottoE_과제풀이[5]; // 당첨번호 배열 List
	Lotto_과제풀이 user = new Lotto_과제풀이();
	int cnt = 0; // 당첨배열의 index 역할
	
	public void printMenu() {
		System.out.println("--로또 프로그램--");
		System.out.println("1.로또 번호생성(수동)");
		System.out.println("2.로또 번호생성(자동)");
		System.out.println("3.당첨 번호생성(자동)");
		System.out.println("4.당첨확인(마지막회차번호)");
		System.out.println("5.당첨번호목록확인(전체)");
		System.out.println("6.종 료");
		System.out.println(">> menu >");
		
	}
	
	@Override
	public void createLotto(Scanner sc) {
		// 로또 번호 수동입력 메뉴
		System.out.println("로또번호를 입력(중복 x, 1~45범위 숫자 6개)");
		int[] tmp = new int[6]; // 입력받을 임시배열변수
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = sc.nextInt();
		}
		// 중복 체크 후
		if(isDuplicated(tmp)) {
			System.out.println("오류발생~! 취소");
		} else {
			user.insertNumbers(tmp);
			printLotto("사용자번호:"+user); // 메서드와 같은 효과
		}
	}
	
	public void printLotto(String str) {
		System.out.println("-------------------");
		System.out.println(str);
	}
	
	// 수동으로 입력한 배열안의 같은 수가 포함되어 있는지 체크
	public boolean isDuplicated(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		//범위 체크
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0 || arr[i] < 45) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void createLottoAuto() {
		user.randomLotto();
		printLotto(""+user);
	}
	
	public void insertLotto(Scanner sc) {
		System.out.println("로또 당첨번호 입력.(중복ㄴ몰아머놀)");
		int tmp[] = new int[7];
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = sc.nextInt();
		}
		// 중복, 범위 이탈 케이스 발생
		if(isDuplicated(tmp)) {
			System.out.println("Erorr 발생 ~! 취소");
		} else {
			if(lotto.length == cnt) {
				LottoE_과제풀이[] arr = new LottoE_과제풀이[lotto.length];
				System.arraycopy(lotto, 0, arr, 0, lotto.length);
				lotto = arr;
			}
			LottoE_과제풀이 tmpLotto = new LottoE_과제풀이();
			tmpLotto.insertNumbers(tmp);
			
			lotto[cnt] = tmpLotto;
			cnt++;
			printLotto();
		}
	}

	@Override
	public void insertLottoAuto() {
		// 당첨번호 자동 입력
		if(lotto.length == cnt) {
			LottoE_과제풀이[] arr = new LottoE_과제풀이[lotto.length];
			System.arraycopy(lotto, 0, arr, 0, lotto.length);
			lotto = arr;
		}
		LottoE_과제풀이 tmp = new LottoE_과제풀이();
		tmp.randomLotto();
		lotto[cnt] = tmp;
		cnt++;
		printLotto("당첨번호:"+tmp);
	}

	@Override
	public void checkLotto() {
		// 당첨확인 메서드
		if(user.isContain(0)) {  // 로또번호를 생성하지 않은 경우
			System.out.println("사용자번호를 입력해줘요");
			return;
		}
		// 로또 당첨번호가 없을 경우
		if(cnt==0) {
			System.out.println("당첨번호를 생성해주세요.");
			return;
		}
		
		// 1. 일치하는 개수 count 변수 선언
		int count = 0;
		// 2. 마지막에 저장된 당첨번호 객체 가져오기
		LottoE_과제풀이 tmp = lotto[cnt-1];
		for(int i=0; i<user.getNumbers().length; i++) {
			// 최신 당첨번호의 i번지 1개의 값을 num로 저장
			int num = tmp.getNumbers()[i];  // 당첨번호 첫번째 값
			// user 배열에 num가 있는지 확인
			if(user.isContain(num)) {
				count++;
			}
		}
		// 3. for문으로 일치 갯수 확인
		int rank=-1;
		switch(count) {
		case 6: rank=1; break;
		case 5: 
			if(user.isContain(tmp.getBonus())) {
				rank=2;
			} else {
				rank=3;
			}
			break;
		case 4: rank=4; break;
		case 3: rank=5; break;
		default: break;
		}
		if(rank != -1) {
			System.out.print(count+"개 일치 |");
			System.out.println(rank+"등");
		} else {
			System.out.print(count+"개 일치 |");
			System.out.println("꽝");
		}
		// 4. rank 확인 -> 출력
	}

	@Override
	public void printLotto() {
		// 전체 당첨리스트
		// for문 이용하여 lotto 배열 출력
		System.out.println("▷▷▷▷▷▷▷▷▷▷▷▷▷");
		System.out.println("--역대당첨번호 리스트--");
//		for(int i=cnt; i>=0; i--) // 역순찍기
		for(int i=0; i<cnt; i++) {
			System.out.println(i+1+"회차 당천번호:"+lotto[i]);
		}
		
	}

	
	
}
