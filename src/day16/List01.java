package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성 <String>
		 * 
		 * */
		
		List<String> toDayDoIt = new ArrayList<>();
		toDayDoIt.add("밥먹기");
		toDayDoIt.add("학원가기");
		toDayDoIt.add("출석체크");
		toDayDoIt.add("교육듣기");
		toDayDoIt.add("점심밥먹기");
		toDayDoIt.add("교육듣기");
		toDayDoIt.add("퇴실체크");
		
		// 향상된 for문으로 출력
		for(String tmp : toDayDoIt) {
			System.out.print(tmp+" | ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		// Iterator로 출력
		Iterator<String> doIt = toDayDoIt.iterator();
		while(doIt.hasNext()) {
			String tmp = doIt.next();
			System.out.print(tmp+" | ");
		}
		
		// Collection.sort(list);  // 오름차순만 가능
		// sort(Comparator c)      // 오름차순, 내림차순 가능
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		Collections.sort(toDayDoIt);
		for(String tmp : toDayDoIt) {
			System.out.print(tmp+" | ");
		}
		
		
		// sort(Comparator c) 
		toDayDoIt.sort(new Test());
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println(toDayDoIt);
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// compareTo메서드 사용 o2.compareTo(o1);
		return o1.compareTo(o2); // 오름차순
	}
	
}
