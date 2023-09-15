package day17;

import java.util.HashMap;

public class Map02 {

	public static void main(String[] args) {
		/* map을 이용하여 과목과 점수를 입력하고.
		 * 합계와 평균을 출력
		 * -- 홍길동 점수
		 * 국어 : 89
		 * 영어 : 78
		 * 수학 : 96
		 * 합계 :
		 * 평균 : 
		 * */
		int sum=0;
		double avg=0;
		
		HashMap<String, Integer> std = new HashMap<>();
		std.put("국어", 89);
		std.put("영어", 78);
		std.put("수학", 96);
		std.put("사회", 75);
		std.put("과학", 80);
		
		for(String tmp : std.keySet()) {
			sum += std.get(tmp);
		}
		avg = sum / std.size();
		
		System.out.println("==홍길동==");
		for(String tmp : std.keySet()) {
			System.out.println(tmp+":"+std.get(tmp));
		}
		System.out.println("합계:"+sum+"점");
		System.out.println("평균:"+(int)avg+"점");
		
	}

}
