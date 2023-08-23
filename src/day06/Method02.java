package day06;

public class Method02 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 +, -, *, /, % 를 활용하는 메서드 나들기 
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드르르 작성
		 * + 이 때 호출  => 메인에서 출력
		 * - 일 때 호출  => 메인에서 출력
		 * * 일 때 호출  => 메서드에서 출력
		 * / 일 때 호출  => 메서드에서 출력 => 리턴을 double로
		 * % 일 때 호출  => 메서드에서 출력
		 * */
		
//		int sum = sum(10, 5);
//		System.out.println(sum);
////		System.out.println(sum(10,15));
//		int min = min(30, sum);
//		System.out.println(min);
		System.out.println(min(30,10));
		
		mul(10, 20);
		double num3 = div(10, 20);
		div(50, 13);
//		rem(sum, min);
		
		int method = Method01.sum(10, 30);  
		// Method01 클래스에서 정의된 sum 호출
		System.out.println(method);
		
		// double a = div(50, 13);
		// void 선언시 리턴값으로 새로운 변수에 값을 저장하지 못함 / 입력되지 않음.
		// System.out.printf("%.3f",div(50, 13));
		
		
		// 다른 클래스에 있는 메서드를 사용 (static 있는 경우 사용 가능)
		// 클래스명.메서드명
		// 쿨래스 => 정의서로 사용하는 게 x => 객체를 생성해서 메서드를 사용
		// 현재 시점에서 객체 생성없이 메서드를 사용할수 있는 이유는 = static
		// (static 이 없는 경우) - 선언만 해놓고 생성이 안 되어있다는 것을 의미
		//   ㄴ 선언 및 생성까지 했다는것임.
		// 객체를 생성  =>  클래스가 필요
		Method02 me = new Method02();  // 클래스의 객체 생성
		int s = me.sum(20,30);         // 객체를 활용
		System.out.println("me 객체 생성 후 sum 호출 : "+s);
	}
	
	// Method 정의
	// add
	public int sum(int num1, int num2) {
		return num1 + num2;
		// return 되는 값은 값을 저장해서 활용
	}
	
	// sub
	public static int min(int num1, int num2) {
		return num1 - num2;
	}
	
	
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static double div(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	public static void rem(int num1, int num2) {
		System.out.println(num1 % num2);
	}
	
}
