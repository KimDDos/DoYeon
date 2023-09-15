package Test;

import java.util.ArrayList;
import java.util.List;

public class CardPack2_김도연 {

public static void main(String[] args) {
		
		List<Card2_김도연> cd = new ArrayList<Card2_김도연>(); 
		char shape ='♥';
		for(int i=1; i<=4; i++) {
			switch (i) { 
			case 1: shape = '♥'; break;
			case 2: shape = '♣'; break;
			case 3: shape = '♠'; break;
			case 4: shape = '◆'; break;
			}
			for(int j=1; j<=13; j++) {
				cd.add(new Card2_김도연(shape, j));
			}
		}
		
		for(int i=0; i<cd.size(); i++) {
			System.out.print(cd.get(i).printCard2()+" ");
			if(cd.get(i).getNumber()==13) {
				System.out.println();
			}
		}
	}
	
}
