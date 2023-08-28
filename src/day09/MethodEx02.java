package day09;

public class MethodEx02 {

	public static void main(String[] args) {
		/* 두 정수의 사칙연산(+ - * / %)을 처리
		 * */
		MethodEx02 me = new MethodEx02();
		int num1 = 45;
		int num2 = 15;
		
		System.out.println(me.add(10,20));
		System.out.println(me.sub(10,20));
		System.out.println(me.mul(10,20));
		System.out.println(me.div(10,20));
		System.out.println(me.rem(10,20));
	}
	
	// 사칙 연산의 메서드 생성
	// static 붙이지 말고
	// 처리구문은 간결하게 만드는편임
	// 어떤 매개변수를 받아서 어떤 값을 리턴할 것인가가 제일 중요함
	// 객체의 책임과 임무가 무엇인지 중요하다.라는게 중요함 ㄹㅇ
	
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(int num1, int num2) {
		return ((double)num1 / num2);
	}
	
	public int rem(int num1, int num2) {
		return num1 % num2;
	}
	
	
	
}
