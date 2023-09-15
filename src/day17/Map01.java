<<<<<<< HEAD
package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 *   - 값을 2개 저장, Key / value 값으로 저장
		 *   - 검색은 Key로 value는 Key를 따라간다고 보면됨
		 *   - Key는 중복불가, value는 중복가능
		 *   - HashMap을 가장 많이 사용
		 *   
		 *  HashMap<String, Integer> map = new HashMap<String, Integer>();
		 *  Map은 값이 2개여서 Iterator를 map 자체로는 사용불가.
		 *  향상된 for / Iterator = set으로 Key값 추출 후 사용
		 *  
		 *  
		 *  list, set => .add()
		 *  map => .put()  /  keySet(), values() => 추출은 단체로 추출해버림
		 * */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		
		System.out.println(map);
		System.out.println(map.keySet());  //set
		System.out.println(map.values());  // collection
		
		// key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		// 향상된 for문으로 출력 (제일 많이 쓴다고 함)
		System.out.println("==향상된 for문 출력==");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":"+map.get(tmp)+" ");
		}
		
		System.out.println();
		// Iterator로 출력
		System.out.println("==Iterator 출력==");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+":"+map.get(tmp)+" ");
		}
		
		System.out.println();
		System.out.println(map.entrySet());
		// entrySet 구성시 : getKey, getValue로 출력
		for(Map.Entry<String, Integer> tmp:map.entrySet()) {
			System.out.print(tmp.getKey()+":"+tmp.getValue()+" ");
		}
		
		
		
		
	}

}
=======
package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 *   - 값을 2개 저장, Key / value 값으로 저장
		 *   - 검색은 Key로 value는 Key를 따라간다고 보면됨
		 *   - Key는 중복불가, value는 중복가능
		 *   - HashMap을 가장 많이 사용
		 *   
		 *  HashMap<String, Integer> map = new HashMap<String, Integer>();
		 *  Map은 값이 2개여서 Iterator를 map 자체로는 사용불가.
		 *  향상된 for / Iterator = set으로 Key값 추출 후 사용
		 *  
		 *  
		 *  list, set => .add()
		 *  map => .put()  /  keySet(), values() => 추출은 단체로 추출해버림
		 * */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		
		System.out.println(map);
		System.out.println(map.keySet());  //set
		System.out.println(map.values());  // collection
		
		// key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		// 향상된 for문으로 출력 (제일 많이 쓴다고 함)
		System.out.println("==향상된 for문 출력==");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":"+map.get(tmp)+" ");
		}
		
		System.out.println();
		// Iterator로 출력
		System.out.println("==Iterator 출력==");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+":"+map.get(tmp)+" ");
		}
		
		System.out.println();
		System.out.println(map.entrySet());
		// entrySet 구성시 : getKey, getValue로 출력
		for(Map.Entry<String, Integer> tmp:map.entrySet()) {
			System.out.print(tmp.getKey()+":"+tmp.getValue()+" ");
		}
		
		
		
		
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
