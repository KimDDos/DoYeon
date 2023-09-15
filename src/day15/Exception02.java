<<<<<<< HEAD
package day15;

public class Exception02 {

	public static void main(String[] args) {
		// try~catch문을 통해서 예외처리
		Exception02 ex = new Exception02();
		
//		int num1=0, num2=0;
//		int result =0;
//		char ch=0;
		try {
//			System.out.println("연산할 첫번째 숫자를 입력해주세요.");
//			num1 = sc.nextInt();
//			System.out.println("연산할 두번째 숫자를 입력해주세요.");
//			num2 = sc.nextInt();
//			System.out.println("연산자를 입력해주세요.(+, -, *, /, % 중 선택)");
//			ch = sc.next().charAt(0);
//			System.out.println(ex.calculator(num1, num2, ch));
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '$'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '%'));
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("계산기 종료");
		
	}

	// 두 수, 연산자를 입력받아 4칙 연산을 수행하고 결과를 리턴하는 메서드 생성
	public int calculator(int num1, int num2, char ch) {
		int result = 0;
		switch (ch) {
		case '+': result = num1 + num2;
			break;	
		case '-': result = num1 - num2;
			break;
		case '*': result = num1 * num2;
			break;
		case '/': result = (int)(num1 / num2);
			break;
		case '%': result = num1 % num2;
			break;
		default: System.out.println("잘못된 입력입니다.");
			break;
		}
		return result;
		
		
	}
	
	
	// throw를 발생시키게 되면 예외를 메서드르르 호출하는 객체에게 넘기는 현상 발생
	// throw를 발생시키게 되면 메서드 선언부 끝에 
	// throws 발생할 수 있는 예외를 반드시 적어줘야한다.
	// RuntimeException는 생략가능
	// 예외 떠넘기기라고도 함
	public static double calc(int num1, int num2, char op) throws RuntimeException {
		double result = 0;
		// 예외가 발생할 수 있는 상황을 미리 앞에서 체크
		if((op =='/' || op == '%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch (op) {
		case '+': result = num1 + num2;	break;	
		case '-': result = num1 - num2;	break;
		case '*': result = num1 * num2;	break;
		case '/': result = num1 / num2;	break;
		case '%': result = num1 % num2;	break;
		default: 
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return result;
	}
	
}
=======
package day15;

public class Exception02 {

	public static void main(String[] args) {
		// try~catch문을 통해서 예외처리
		Exception02 ex = new Exception02();
		
//		int num1=0, num2=0;
//		int result =0;
//		char ch=0;
		try {
//			System.out.println("연산할 첫번째 숫자를 입력해주세요.");
//			num1 = sc.nextInt();
//			System.out.println("연산할 두번째 숫자를 입력해주세요.");
//			num2 = sc.nextInt();
//			System.out.println("연산자를 입력해주세요.(+, -, *, /, % 중 선택)");
//			ch = sc.next().charAt(0);
//			System.out.println(ex.calculator(num1, num2, ch));
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '$'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '%'));
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("계산기 종료");
		
	}

	// 두 수, 연산자를 입력받아 4칙 연산을 수행하고 결과를 리턴하는 메서드 생성
	public int calculator(int num1, int num2, char ch) {
		int result = 0;
		switch (ch) {
		case '+': result = num1 + num2;
			break;	
		case '-': result = num1 - num2;
			break;
		case '*': result = num1 * num2;
			break;
		case '/': result = (int)(num1 / num2);
			break;
		case '%': result = num1 % num2;
			break;
		default: System.out.println("잘못된 입력입니다.");
			break;
		}
		return result;
		
		
	}
	
	
	// throw를 발생시키게 되면 예외를 메서드르르 호출하는 객체에게 넘기는 현상 발생
	// throw를 발생시키게 되면 메서드 선언부 끝에 
	// throws 발생할 수 있는 예외를 반드시 적어줘야한다.
	// RuntimeException는 생략가능
	// 예외 떠넘기기라고도 함
	public static double calc(int num1, int num2, char op) throws RuntimeException {
		double result = 0;
		// 예외가 발생할 수 있는 상황을 미리 앞에서 체크
		if((op =='/' || op == '%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch (op) {
		case '+': result = num1 + num2;	break;	
		case '-': result = num1 - num2;	break;
		case '*': result = num1 * num2;	break;
		case '/': result = num1 / num2;	break;
		case '%': result = num1 % num2;	break;
		default: 
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return result;
	}
	
}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
