package day09;

// class의 public은 파일명과 일치하는 class에만 가능
// 한 파일에 1개만 public class 존재
public class MethodEx01 {
	// 멤버변수 자리
	
	
	// 메서드 자리
	public static void main(String[] args) {
		/* num1, num2 숫자 두개를 주고 두수의 합을 리턴하는 메서드
		 * */ 
		// 메서드는 메서드를 선언하는 것으로 일을 하지 않음.
		int a = 3;
		int b = 5;
		int c = (int)(Math.random()*250)+1;
		// 호출 : 반복적으로 호출 가능. (여러번 호출 가능)
		int num = sum(a, b);
		System.out.println(num);
		int sum = sum(c, b);
		System.out.println(sum);
		System.out.println(sum(c,c));
//		System.out.println(sum1(num, num));
//		리턴값이 있어야 sysout에서 값을 출력할 수 있음
		sum1(c, num);
		
		// static이 없는 메서드 호출
		// 객체를 생성 - 클래스 MethodEx01
		// 같은 클래스안인데도 객체를 생성하는 이유는 [더 찾아봥 궁금행]
		// 현재 실행 Method가 static을 포함하는 main 메서드이기 때문에
		MethodEx01 me = new MethodEx01();  // 객체생성
		int num2 = me.sum2(a, b);
		System.out.println(num2);
	}
	
	// 다음 메서드
	// 기능 : 두 정수의 합을 리턴하는 메서드
	// 리턴타입 : 타입만 => int
	// 매개변수 : 두 정수 => int num1, int num2
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 기능 : 두 정수의 합을 출력하는 메서드
	// 리턴타입 : 없음 => void
	// 매개변수 : 두 정수 => int num1, int num2
	// 리턴이 없는 것은 출력구문이 대부분임.(=void)
	public static void sum1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 메서드 오버로딩이 가능하려면,
	// 메서드 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것.
	// 매개변수의 종류가 다르거나, 개수가 다르거나...
	
	// 두 수의 합으 리턴하는 메서드
	public int sum2(int num1, int num2) {
		return num1 + num2;
	}
	
	
	
}

// 클래스 자리
