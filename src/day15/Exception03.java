<<<<<<< HEAD
package day15;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 *  - ArithmeticException
		 *  - ArrayIndexOutOfBoundsException
		 *  - ClassCastException
		 *  - NullPointerException
		 *  
		 * */
		// ArithmeticException : / by zero
		// 0으로 나누었을때 발생하는 에러
		// System.out.println(1/0);
		
		
		// ArrayIndexOutOfBoundsException : 배열의 번지가 넘어갔을 때  
		// 출력 : Index 6 out of bounds for length 5
		// 
		int[] arr = new int[5];
		// arr[6] = 1;
		P p = new C();
		// ClassCastException : 클래스의 캐스팅이 잘못되었을 경우(형변환 오류)
		// C c = (C)P;
		
		
		// NullPointerException : 객체가 생성되지 않은 경우
		C c = null;
		// c.print();
	}
}


class P{
	int num = 10;
}

class C extends P{
	int num = 100;
	
	public void print() {
		System.out.println();
	}
=======
package day15;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 *  - ArithmeticException
		 *  - ArrayIndexOutOfBoundsException
		 *  - ClassCastException
		 *  - NullPointerException
		 *  
		 * */
		// ArithmeticException : / by zero
		// 0으로 나누었을때 발생하는 에러
		// System.out.println(1/0);
		
		
		// ArrayIndexOutOfBoundsException : 배열의 번지가 넘어갔을 때  
		// 출력 : Index 6 out of bounds for length 5
		// 
		int[] arr = new int[5];
		// arr[6] = 1;
		P p = new C();
		// ClassCastException : 클래스의 캐스팅이 잘못되었을 경우(형변환 오류)
		// C c = (C)P;
		
		
		// NullPointerException : 객체가 생성되지 않은 경우
		C c = null;
		// c.print();
	}
}


class P{
	int num = 10;
}

class C extends P{
	int num = 100;
	
	public void print() {
		System.out.println();
	}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
}