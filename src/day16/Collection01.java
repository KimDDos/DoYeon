package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List(최다), Set(다다음), Map(그다음)
		 * 데이터를 묶어서 관리할 때 사용 (배열 대신으로 List)
		 * 주로 배열 대신에 사용
		 * 
		 * List
		 * - 배열과 동일
		 * - 값을 하나씩 저장
		 * - 중복을 허용
		 * - index를 가짐
		 * - 배열 대신에 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 중복을 허용 X
		 * - index가 없음. => 정렬, 정형화가 안 됨
		 * - 순서를 보장 X
		 * 
		 * Map
		 * - 값을 두개씩 저장, Key/value 쌍으로 저장, 한 메모리 주소안에 값이 두개씩 들어감
		 * - Key 중복불가, Value는 중복가능
		 * - key가 중복되면 덮어쓰기 됨.
		 * - 아이디/패스워드처럼 같이 묶어서 하나의 자료로 저장해야할 때 사용됨.
		 * - 순서보장 X  
		 * 
		 * int arr[] = new int[5]; // 기본 자료형으로 사용가능
		 * collection 에서는 클래스로 데이터를 관리
		 * int -> Integer, String 을 제외한 나머지 자료형은 
		 * 첫글자만 대문자로 변환하면 클래스가 됨.
		 * 
		 * long -> Long, byte -> Byte, double -> Double 등...
		 * 클래스를 지정하지 않으면 Object가 자동 들어간다. 
		 * */
		List list3 = new ArrayList(); // Object가 자동 들어간 케이스
		List<Integer> list = new ArrayList<Integer>();  // 일반적인 선언
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// add() : 리스트에 요소를 추가
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		// size() : list의 길이를 리턴
		// list의 특징은 길이를 지정하지 않음.
		System.out.println(list.size());
		
		
		// 문자열만 가능한 ArrayList 생성 3개 추가 후 출력
		List<String> list4 = new ArrayList<>();
		// 앞에만 적어줘도 뒤에 꺽새는 따라옴
		list4.add("삼겹살");
		list4.add("목살");
		list4.add("항정살");
		System.out.println(list4);
		System.out.println(list4.size());
		list4.remove(list4.size()-1);
		System.out.println(list4);
		System.out.println(list4.size());
		
		
		// list2애 1뷰토 10까지 입력하고, 출력
		int i=0;
		while(i<10) {
			list2.add(i+1);
			i++;
		}
		System.out.println(list2);
		
		for(int j=1; j<=10; j++) {
			list2.add(j); // 중복가능.
		}
		System.out.println(list2);
		
		// get(index) : index번지의 값을 가져오는 것
		System.out.println(list2.get(0));
		
		// set(index, 값) : index번지의 값을 변경하는 것
		list2.set(0, 3);
		System.out.println(list2.set(0, 5)); // 변경되기전의 값이 찍힘
		System.out.println(list2);
		
		for(int k=0; k<list2.size(); k++) {
			if(list2.get(k)%2==0) {
				System.out.print(list2.get(k)+" ");
			}
		}
		
		// remove(index) : index 번지값 삭제, trmove(object) : Object 객체 삭제
		list2.remove(0); // 0번지의 값 삭제
		System.out.println(list2);
		Integer a = 10;
		list2.remove(a); // 0부터 시작해서 처음 만나는 값만 삭제, 10이라는 객체를 지우는것임
		System.out.println(list2);
		
		// contains(Object) : list에 값이 있는지 검사 true / false
		System.out.println("------------------------------");
		System.out.println(list2.contains(a));
		
		// clear : list 비우기
		list2.clear();
		System.out.println(list2);
		
		//isEmpty() : list가 비었는지 체크 true / false
		System.out.println(list2.isEmpty());
		
		// list2에 1부터 5까지 값을 추가하고 각 요소를 출력
		for(int k=1; k<=5; k++) {
			list2.add(k);
		}
		System.out.println(list2);
		
		// 향상된 for문
		// List에서만 일반 for문이 사용가능하고, Set, Map에서는 사용이 불가함
		// int와 Integer는 상호간 형변환이 자연스럽게 일어남
		for(int tmp : list2) {
			System.out.print(tmp+" ");
		}
		
		// index를 사용할 수 없는 컬렉션을 출력하기 위해 사용하는 객체
		// Iterator : index가 없는 collection을 출력하기위해 사용
		/* list는 index가 있기 때문에 get(i)를 사용가능
		 * set, map은 순서를 보장하기 않기 때문에 for 사용 불가
		 * 향상된 for문, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력가능
		 * */
		System.out.println();
		
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list2.iterator();
		// hasNext() : 다음 값이 있는지 물어보는 메서드, 순서값이 없는 경우에 자주 사용함
		while(it.hasNext()) { // 요소가 있는지 체크
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// indexof(값) : 값의 index 번지를 리턴 / 없으면 -1 리턴
		Integer b = 5;
		System.out.println(list2.indexOf(b));
		
		// sort(객체)
		// - 객체 : comparator 인터페이스를 구현한 객체를 넣어야 함.(내부(익명)클래스)
		
		list2.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 : 오름차순  /  o2 - o1 : 내림차순
				return o2 - o1; // 오름차순
			}
		});
		
		System.out.println(list2);
		
	}

}
