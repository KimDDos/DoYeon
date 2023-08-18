package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * 반올림(Math.round) : 소수점의 자리수는 무조건 0
		 * Natg.ceil 올림, Math.floor 버림
		 * */
		double num = 34.6666666;
		
		int roundNum = (int)Math.round(num);  // round는 return값이 long이기 때문에 값을 받기 위해서는 명시적 형변환을 해줘야함
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		// Math.max 최대값, Math.min 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		// Math.random : 0과 1사이의 아무값을 리턴
		// 0 <= random < 1
		// (int)(Math.random()*10)+1  : 1부터 10개의 정수를 얻는 공식임(굉장히 많이 쓰임, 꼭 숙지)
		System.out.println((Math.random())); // 0은 포함, 1은 미포함  -> 통상적으로 처음은 포함 끝은 미포함하는 경우가 많음
		System.out.println((int)(Math.random()*10)+1);
	
	}

}
