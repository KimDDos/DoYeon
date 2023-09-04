package day14;

public class LottoE extends Lotto{


	// 멤버변수 : 당첨번호 7개 저장할 배열, index용 count, int bonus?
	private int[] lottoArray = new int[7];
	private Lotto[] lotto = new Lotto[5];
	private int[] autoNums = new int[6];
	private int count;
	
	public LottoE() {}
	public LottoE(int[] nums) {
		super(nums);
	}
	
	
	// 메서드
	// 로또번호 생성(자동)
	public int[] autoNums() {
		int i=0;
		while(i<6) {
			for(int j=0; j<i; j++) {
				int r = random();
				if(!isContain(autoNums, r)) {
					autoNums[i] = r;
					i++;
				}
			}
		}
		return autoNums;
	}
	
	// 당첨번호 출력메서드
	public void printUser() {
		for(int tmp : lottoArray) {
			System.out.print(tmp+" ");
		}
	}
	
	// 당첨번호 생성
	public int[] randomArray(int lottoArray[]) {
		int i=0;
		while(i<7) {
			for(int j=0; j<i; j++) {
				int r = random();
				if(!isContain(lottoArray, r)) {
					lottoArray[i] = r;
					i++;
				}
			}
		}
		return lottoArray;
	}
	
	// 중복체크 
	public boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp==random) {
				return true;
			}
		}
		
		return false;
	}

	public int[] getLottoArray() {
		return lottoArray;
	}

	public void setLottoArray(int[] lottoArray) {
		this.lottoArray = lottoArray;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	// 당첨번호 저장
	
	// 
	
}
