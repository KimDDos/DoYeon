package Test;

public class Card2_김도연 {

	private char shape;
	private int number;
	
	
	public Card2_김도연() {
		shape = '♥';
		number = 1;
	}
	public Card2_김도연(char shape, int number) {
		this.shape = shape;
		this.number = number;
	}
	public String printCard2() {
		String prt = null;
		if(this.number==1) {prt="A";
		} else {prt= ""+this.number;}
		return shape + "" + prt;
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
			this.shape='♥';
		}
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number < 1 || number > 13) {
			this.number = 1;
		}else {
			this.number = number;			
		}
	}
	
}
