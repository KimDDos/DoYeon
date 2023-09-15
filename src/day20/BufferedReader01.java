<<<<<<< HEAD
package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) throws IOException{
		/* BufferedReader : 문자 보조스트림.
		 * 라인단위 읽기가 가능
		 * 더 이상 읽을 라인이 없으면 null을 리턴
		 * 보조스트림 : 직접 읽고 쓰는 기능이 없기 때문에 
		 * 기반스트림을 매개변수로 포함해야 함. 
		 * */
		
		BufferedReader br = 
				new BufferedReader(new FileReader("test.txt"));
		
		while(true) {
			String line = br.readLine(); // 한 라인 읽어오기
			if(line==null) { // 더이상 읽을 라인이 없음
				break;
			}
			System.out.println(line);
		}
		br.close();
		
	}

}
=======
package day20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) throws IOException{
		/* BufferedReader : 문자 보조스트림.
		 * 라인단위 읽기가 가능
		 * 더 이상 읽을 라인이 없으면 null을 리턴
		 * 보조스트림 : 직접 읽고 쓰는 기능이 없기 때문에 
		 * 기반스트림을 매개변수로 포함해야 함. 
		 * */
		
		BufferedReader br = 
				new BufferedReader(new FileReader("test.txt"));
		
		while(true) {
			String line = br.readLine(); // 한 라인 읽어오기
			if(line==null) { // 더이상 읽을 라인이 없음
				break;
			}
			System.out.println(line);
		}
		br.close();
		
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
