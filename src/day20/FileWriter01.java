<<<<<<< HEAD
package day20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {
		// FileWriter : 문자 기반 스트림
		// 또 실행하게 될 경우, 기존에 있던 내용을 덮어씌움
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			for(int i=1; i<=10; i++) {
				String date = i+". test 입니다. \r\n";  // \r\n 줄바꿈
				fw.write(date);
			}
			fw.close();
			
			// 파일 추가 모드 ("파일명",true)
			// true가 있어야만 추가값을 넣을수있음(변수로 append 임)
			FileWriter fw2 = new FileWriter("test.txt", true);
			for(int i=11; i<=20; i++) {
				String date = i+". test 입니다. \r\n";  // \r\n 줄바꿈
				fw2.write(date);
			}
			fw2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
=======
package day20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {
		// FileWriter : 문자 기반 스트림
		// 또 실행하게 될 경우, 기존에 있던 내용을 덮어씌움
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			for(int i=1; i<=10; i++) {
				String date = i+". test 입니다. \r\n";  // \r\n 줄바꿈
				fw.write(date);
			}
			fw.close();
			
			// 파일 추가 모드 ("파일명",true)
			// true가 있어야만 추가값을 넣을수있음(변수로 append 임)
			FileWriter fw2 = new FileWriter("test.txt", true);
			for(int i=11; i<=20; i++) {
				String date = i+". test 입니다. \r\n";  // \r\n 줄바꿈
				fw2.write(date);
			}
			fw2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
