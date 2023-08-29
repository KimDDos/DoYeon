package day10;

public class CardPack {
	
	/* CardPack
	 * - 카드팩 : 52장의 카드들
	 *  
	 * 멤버변수 : 카드를 52장 담을수 있는 배열
	 * 생성자 : 카드52장의 카드를 모두 생성
	 * 메서드 : 
	 *   - 카드를 섞는 기능
	 *   - 카드를 한장 빼는 기능
	 *   - 카드를 출력 => Class04 클래스의 print 메서드 활용
	 *   - 카드 초기화 메서드
	 * */
	
	// 멤버변수
	private Card[] pack = new Card[52];
	// Card라는 클래스 자료형을 만든것
	private int cnt = 0;  // pack 배열의 index 체크용
	// 멤버변수로 해두면 모든 메서드에 적용이 되는 변수인거임.
	
	// 생성자 : 52장의 카드를 모두 생성
	public CardPack() {
		// ♥(1~13)  ♣(1~13)  ♠(1~13)  ◆(1~13)
		char shape='♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='♣'; break;
			case 3: shape='♠'; break;
			case 4: shape='◆'; break;
			}
			for(int j=1; j<=13; j++) {  // 숫자
				Card c = new Card(); //카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	// 메서드
	// 카드를 섞는 기능
	// 배열이 섞이기만 하면 되니까 void로 선언
	public void shuffle() {
		for(int i=0; i<pack.length-1; i++) {
			int k = (int)(Math.random()*52);
			Card tmp = pack[i];
			pack[i] = pack[k];
			pack[k] = tmp;
		}
	}
	
	// 카드를 위에서부터 한장씩 빼내는 기능[맨 위부터 확인]
	// 리턴타입 Card (카드 1장)
	public Card cardDrop() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	// 카드 초기화 메서드[봤던 카드를 그대로 정리, 카드 맨위로 복귀]
	// cnt만 마지막으로 다시 보내기
	public void reset() {
		cnt=pack.length;
	}
	
	
	// getter / setter
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	
}
