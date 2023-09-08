package day17;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		/* Set 생성후 
		 * 1~45까지 랜덤수 6개 생성후 출력 
		 * */
		
		TreeSet<Integer> st = new TreeSet<Integer>();
		for(int i=0; st.size()<6; i++) {
			st.add((int)(Math.random()*45)+1);
		}
		System.out.println(st);
		
	}

}
