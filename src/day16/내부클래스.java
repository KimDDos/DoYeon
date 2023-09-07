package day16;

import day16.A.B;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부 클래스 : 클래스 내부에 선언한 클래스
		 *   - 외부 클래스 -> 내부 클래스
		 *   - 다른 외부에서는 내부클래스를 사용할 일이 없고, 
		 *     내부클래스가 외부 클래스와 밀저한 연관이 있을 경우.
		 *     
		 *   - 내부적으로 사용할 목적으로 만드는 클래스이기 때문에 
		 *     private 선언하는 것을 권장
		 *   - 내부 클래스가 생성되는 시기 : 외부 클래스가 생성된 후 내부클래스가 생성됨.
		 * 익명(anonymous class) 내부클래스 -> 익명클래스를 사용하기 위해
		 * 내부 클래스 사용
		 * 클래스 안에 클래스를 선언해도 문제가 되지 않는다!
		 * 
		 * */
		A a = new A();
		a.outPrint();
		// B b = new B(); // 불가능, import를 해도 불가능
	}

}

// 외부 클래스
class A{
	// 내부 클래스
	private int num=10;
	private int num2=20;
	private B b;
	
	public A() {
		b = new B();
	}
	
	class B{
		int inNum = 100;
		public void inPrint() {
			System.out.println("외부 클래스 num1:"+num);
			System.out.println("외부 클래스 num2:"+num2);
			System.out.println("내부 클래스 inNum:"+inNum);
		}
	}
	
	public void outPrint() {
		b.inPrint();  // 내부 클래스의 객체 변수를 사용하여 생성
	}
}