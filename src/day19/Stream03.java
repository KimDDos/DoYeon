package day19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬해서)
		 * 중복제거 .distinct()
		 * */
		int[] arr = {5,6,1,2,4,7,8,9,3,2,4,7,8};
		Arrays.sort(arr);
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		IntStream arrStream = Arrays.stream(arr);
		arrStream.sorted()
		.filter(n->n%2==0)
		.forEach(n->System.out.print(n+" "));;
		System.out.println();
		
		Arrays.stream(arr).sorted()
		.filter(n->n%2==0)
		.forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("--------------");
		
		Arrays.stream(arr).filter(n->n%2==1)
		.sorted()
		.distinct()
		.forEach(a->System.out.print(a+" "));
		
		System.out.println();
		System.out.println("-----------------");
		
		// 배열로 리턴(toArray())
		int result[] = Arrays.stream(arr).filter(n->n%2==0)
				.sorted().distinct().toArray();
		
		for(int tmp:result) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("------------------");
		
		// reduce : 계산 a = a*b 이렇게 값을 누적해서 리턴받고 싶을때
		// reduce(초기값)
		// int a=1;
		int sum = Arrays.stream(arr).distinct()
				.filter(n->n%2==0).reduce(1,(a,b)->a*b);
		System.out.println(sum);
		
	}

}
