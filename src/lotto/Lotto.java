package lotto;

public class Lotto {
	
	// 멤버변수 : num, cnt, nums[] 
	private int num;
	private int[] nums = new int[6];
	private int cnt;
	
	public Lotto() {}
	public Lotto(int[] nums) {
		this.nums = nums;
	}
	
	//메서드
	// User가 입력하는 메서드
	public void insertNums(int num) {
		if(0>num||num>45) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		for(int i=0; i<cnt; i++) {
			if (nums[i] == num) {
				System.out.println("중복된 번호입니다.");
				return;
			}
		}
		nums[cnt] = num;
		cnt++;
	}
	
	
	// 출력메서드
	public void printUser() {
		for(int tmp : nums) {
			System.out.print(tmp+" ");
		}
	}
	
	// 랜덤수 생성
	public int random() {
		return (int)(Math.random()*45)+1;
	}
	
	// getter / setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
	
}
