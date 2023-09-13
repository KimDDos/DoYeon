package day19;

import java.util.ArrayList;

public class Lambda01 {

	public static void main(String[] args) {
		/* lambda Expression : 람다식
		 * 함수형 프로그래밍(Functional Programming : FP)
		 * 순수한 함수를 구현하고 호출함으로써 외부 자료에 
		 * 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
		 * 순수함수(pure function) : 매개변수만을 사용하여 만드는 함수
		 * 즉, 함수 내부에서 함수 외부의 변수를 사용하지 않아 
		 * 함수가 실행되더라도 외부의 영향을 전혀 주지 않는 형태
		 * */
		
		/* 리턴이 있으면 중괄호 필요
		 * 람다식 예시(==화살표 함수)
		 * (int x, int y) -> {return x+y}
		 * 리턴이 없고, 처리가 하나면 중괄호 필요 없음.
		 * str -> System.out.println(str);
		 * */
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(45);
		number.add(65);
		number.add(89);
		number.add(75);
		number.add(23);
		System.out.println("--일반 for문을 이용한 출력--");
		for(Integer tmp : number) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		System.out.println("--람다식을 이용한 출력--");
		// forEach
		// n은 임시변수, 출력문에도 임시변수 n이 반영되도록
		number.forEach((n)->{
			System.out.print(n+" ");
		});
		System.out.println();
		
		// 중괄호 없이 시행(리턴X, 처리 하나)
		number.forEach((n)->System.out.print(n+" "));
		System.out.println();
		// 람다식을 스트림을 이용해서 표현을 한다.
		
		// 메서드에 직접 참조
		number.forEach(System.out::println);
		
		// number의 총개수
		System.out.println("---스트림 이용한 총개수---");
		System.out.println(number.stream().count());
		
		
		
		
	}

}
