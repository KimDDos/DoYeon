package day10;

public class Class04 {

	public static void main(String[] args) {
		Card c1 = new Card();
		
		c1.print();
		c1.setShape('♣');
		c1.setNum(13);
		c1.print();
		
	}

}

/* Card 클래스 생성
 * 포커카드
 * 멤버변수 : 
 * 모양 => 4가지 모양 (♥ ♣ ♠ ◆)
 * 숫자 => 1 ~ 10 J(11) Q(12) K(13)
 * 생성자 : 하트1(♥1)
 * 모양/숫자가 들어올 수 없는 값이 들어오면 => ♥1  $45(X)
 * */

// 카드 클래스 카드 1장을 생성하는 클래스임.
class Card{
	private char shape;  // 모양
	private int num;
	
	// 생성자
	public Card() {
		shape = '♥';
		num = 1;
	}
	
	// print 메서드
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11: System.out.print("J ");
			break;
		case 12: System.out.print("Q ");
			break;
		case 13: System.out.print("K ");
			break;
			default:
				System.out.print(num+" ");
		}
	}
	

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '♣': case '♠': case '◆':
			this.shape = shape;
			break;
			default: 
				this.shape = '♥';
				break;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(0 < num && num < 14) {
			this.num = num;
		} else {
			this.num = 1;
		}
	}
	
	
	
}