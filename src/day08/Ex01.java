package day08;

public class Ex01 {

	public static void main(String[] args) {
		int a[] = {100, 200};
		int b = 200;
		
	}

	public static void add(int a[]) {
		a[a.length-1] = 300;
	}
	
	public static int add2(int b) {
		return (b=500);
		// 매개변수와 일반변수는 지역변수
		// 리턴을 통해서 값을 변경.
	}
}
