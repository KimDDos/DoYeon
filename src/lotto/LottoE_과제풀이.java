package lotto;

public class LottoE_과제풀이 extends Lotto_과제풀이{

	// 당첨번호 생성 클래스 Lotto를 상속받아서 보너스 번호만을 처리
	// 멤버변수
	private int bonus; // 보너스 번호

	
	// 메서드
	// 오버라이딩 메서드 : randomLotto(), init, toString, insertNumbers
	
	@Override
	protected void randomLotto() {
		super.randomLotto(); // 기존 메서드 numbers의 배열은 이미 채워진 상황
		while(true) { // 중복값이 있었을 경우 반복적으로 생성
			int r = random();
			if(!isContain(r)) {
				bonus = r;
				break;
			}
		}
	}

	@Override
	protected void init() {
		// numbers 배열 재생성, 얘는 없어도 됨
		super.init();
		bonus = 0; // 보너스 번호 초기화
	}

	@Override
	public String toString() {
		// 보너스 번호 추가
		return super.toString() +"["+bonus+"]";
	}

	@Override
	protected void insertNumbers(int[] arr) {  //7자리
		// 만약에 수동으로 7자리의 배열이 들어온다면 
		super.insertNumbers(arr); // 6자리 배열생성은 이미 완료
		// 마지막 한자리가 남아있는 상황
		// 보너스 번호에 추가
		bonus = arr[arr.length-1];
	}
	
	public void insertNumbers(int[] arr, int bonus) {
		super.insertNumbers(arr);
		// 보너스 번호만 추가
		this.bonus = bonus;
	}
	
	// getter
	public int getBonus() {
		return bonus;
	}

	
	
}
