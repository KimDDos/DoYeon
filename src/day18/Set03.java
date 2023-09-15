package day18;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// 이것이 자바다 set자료구조 15장 Collection p.641 / p.664
		// 책을 참고해서 자료구조나 내부구조에 대한 공부가 필요!
		// 검색 : ArrayList 유리, LinkedList : 삽입, 삭제에 유리
		// 어떤 List, Set, Map이든 선언 -> 메서드 사용
		// 내부 동작하는 구조가 좀 다름.
		// 각 List, Set, Map 마다 본인만의 메서드 다름
		
		// Set : TreeSet => 검색에 유리, 순차로 데이터를 정렬해서 저장
		// HashSet, HashMap

		// 해당 점수등 중 가장 큰점수와 가장 작은 점수를 출력
		int[] score = {80,89,94,70,78,59,84,56,60,80,90};
		TreeSet<Integer> set = new TreeSet<Integer>();
		
//		for(int i=0; i<score.length; i++) {
//			set.add(score[i]);
//		}
		
		for(int tmp : score) {
			set.add(tmp);
		}
		System.out.println(set);
		
		// fisrt() : 가장 앞에 있는 값 출력
		// last(): 가장 뒤에 있는 값 출력
		System.out.println("최소값 : "+set.first());
		System.out.println("최대값 : "+set.last());
		
		// headSet : 지정된 객체보다 작은(앞쪽) 값 출력
		// tailSet : 지정된 객체보다 큰(뒤쪽) 값 출력
		System.out.println("80보다 작은 값"+set.headSet(80)); 
		// 80보다 작은 객체
		System.out.println("80보다 큰 값"+set.tailSet(80));
		// 80보다 큰 객체
		
		// subSet : 범위를 Set으로 추출
		// 범위 검색시(70은 포함, 90은 미포함) => 범위는! 첫 값은 포함, 끝값은 미포함
		System.out.println("70이상 90미만 사이 :"+set.subSet(70, 90));
		// 출력 : 70이상 90미만 사이 :[70, 78, 80, 84, 89]
		
		// 내림차순 정렬 가능
		NavigableSet<Integer> desSet = set.descendingSet();
		System.out.println(desSet);
		
		
	}

}
