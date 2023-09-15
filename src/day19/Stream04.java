package day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream04 {

	public static void main(String[] args) {
		// Student 클래스를 가지는 List 생성
		// 5명 정도의 값을 추가
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("kim",98));
		list.add(new Student("lee",88));
		list.add(new Student("pack",87));
		list.add(new Student("bak",79));
		list.add(new Student("choi",81));
		
		// stream 구성후 출력
//		list.stream().forEach(System.out::println);
		// toString이 존재할때 위와같이 출력 가능
		
		
		// toString이 없을때
		// 처리가 많을때는 중괄호 필요
		list.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+":"+score);
		});
		
		// 성적 합계 출력
		int sum = list.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("전 인원의 점수 합계: "+sum);
		System.out.println("전 인원의 점수 합계: "+list.stream().mapToInt(n->n.getScore()).sum());
		
		// 점수가 70점 이상인 인원수 출력
		Long count = list.stream().mapToInt(n->n.getScore()).filter(a->a>=70).count();
		System.out.println("70점 이상인 인원수: "+count);
		System.out.println("70점 이상인 인원수: "+list.stream().filter(n->n.getScore()>=70)
				.count());
		
	}

}
