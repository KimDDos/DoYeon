package day06;

public class Method01 {
	// 메서드의 선언위치
	public static void main(String[] args) {
		/* 메서드 : 가능/함수
		 * 접근제어자(제한자) : 접근할 수 잇는 주체의 제한범위
		 * 리턴타입 : 메서드의 실행 결과를 받을수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드의 이름 => 소문자로 시작
		 * 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수명)
		 * 메서드 선언구현
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수) {
		 * 구현;
		 * }
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * 메서드의 선언위치는 main 메서드 밖에 위치하도록
		 * */
		int sum = sum(3, 5);
		// 변수이름을 생성, 메모리공간을 만들고 객체의 값을 반환받는것
		System.out.println(sum);
		
		int sum1 = sum(sum, 12);
		System.out.println(sum1);
		
		int multi = mul(3, 5);
		System.out.println(multi);
		System.out.println(mul(5,8));
		
		int multi1 = mul(multi, 185);
		System.out.println(multi1);
		
		sum2(10,20);
		
		
	}
	// 메서드 선언 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 합 (자료형으로 한다면 : int)
	 * 매개변수 : 두 정수 => (int num1, int num2)
	 *         선언시 각자의 매개변수는 각자의 자료형을 별개로 선언해주어야 함.
	 * 메서드명 : sum  (메서드명을 만들때는 그 기능의 뜻을 함축적으로 적어줘야함)  // 안하면 호온남
	 * 
	 * */
	public static int sum(int num1, int num2) {
		// 리턴타입울 적었는데 리턴값이 없으면 빠알간 밑줄이 그임
		int result = num1 + num2;
		return result;
		// result 값을 int형으로 반환하겠다.
		// 호출을 다른 메서드들이 해도되지만 결과를 볼 수 있는것은 main 메서드만 가능함.
	}
	/* 기능 : 두 정수가 주어지면 두정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱셈 (int) 
	 * 매개변수 : 두 정수(int num1, int num2)
	 * 메서드명 : multiplication -> mul
	 * */
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
		// return = num1 * num2;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : 없음 (void)
	 * 매개변수 : 두 정수(int num1, int num2)
	 * 메서드명 : sum2
	 * 리턴하는 값이 없기 때문에 값을 받을 변수를 선언해줄 필요가 없음
	 *  ㄴ 용도에 따라서 사용하면 됨, 예를 들어서 메서드의 결과값을 
	 *    어딘가에 활용할때 자료형을 선언해서 결과값을 반환하고 재활용
	 * void의 경우 바로 출력이 가능하다는 점
	 * */
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
		return;
	}
	
	
	
}
