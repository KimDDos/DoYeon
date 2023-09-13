package day20;

import java.io.IOException;

public class SystemIn01 {

	public static void main(String[] args) throws IOException {
		/* System.in 을 이용하여 알파벳 하나를 쓰고 Enter를 누르면 알파벳을 콘솔에 찍기
		 * */
		
		System.out.println("알파벳 입력 > ");
		int i=0;
		while((i = System.in.read()) != '\n') {
			System.out.print((char)i);
		}
		System.out.println();

	}

}
