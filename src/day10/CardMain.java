package day10;

public class CardMain {

	public static void main(String[] args) {
		CardPack cp = new CardPack();
		int	index = 0;
		for(int i=0; i<cp.getPack().length; i++) {
				cp.getPack()[i].print();
				index++;
				if(index % 13==0) {
					System.out.println();
				}
			}
		System.out.println("-------------------------");
		
		cp.shuffle();
		index=0;
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
			index++;
			if(index % 13==0) {
				System.out.println();
			}
		}
		
		System.out.println("-------------------------");
		Card tmp = cp.cardDrop();
		tmp.print();
		cp.cardDrop().print();
		System.out.println("-------------------------");
		cp.cardDrop().print();
		cp.cardDrop().print();
		cp.cardDrop().print();
		cp.cardDrop().print();
		System.out.println();
		System.out.println("-------------------------");
		
		cp.reset();
		cp.cardDrop().print();
		cp.cardDrop().print();
		System.out.println();
		System.out.println("-------------------------");

		}
	
	
	
	// 이중for문 다시 연습
}

