package day20;

import java.io.IOException;

public class IOStream01 {

	public static void main(String[] args) {
		/* 스트림(Stream) : 단방향으로 데이터가 흘러가는 형태, 입력/출력을 할수 있게 만들어주는 스트림이다! 라고 이해
		 * 자바는 입력스트림, 출력스트림을 통해 데이터를 입출력한다.
		 * 다양한 장치에 독립적이고 일관성있는 입출력을 유지하기 위해 입출력 스트림을 통해 일관성을 제공
		 * 
		 * 두가지 형태의 스트림
		 *   - 바이트 형태의 스트림 : 기본 (문자, 그림, 멀티미디어)
		 *   - 문자 형태의 스트림 : 문자만 입출력 할 때 사용
		 *   
		 * 바이트 스트림
		 *   - 입력(InputStream) : fileInputStream, BufferedInputStream, DateInputStream 
		 *   - 출력(OutputStream) :  fileOutputStream, BufferedOutputStream, DateOutputStream, PrintWriter...
		 * 문자 스트림
		 *   - 입력(Reader) : FileReader, BufferedReader, InputStreamReader ...
		 *   - 출력(Writer) : FileWriter, PrintWriter, BufferedWriter ...
		 *   
		 * 기반스트림 / 보조스트림
		 * 기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * 기반스트림 종류 : fileInputstream, fileOutputStream, fileReader, fileWriter ... 
		 *  
		 * 보조스트림 : 직접 읽고 쓰는 기능은 없지만, 추가적인 기능을 더해주는 스트림
		 * 보조스트림 종류 : InputStreamReader, BufferedReader, BufferedInputStream, BufferedOutputStream ...  
		 * */
		
		// 표준 출력(모니터=콘솔) 스트림
		System.out.println();
		
		// 표준 입력(키보드) 스트림
		try {
			// 한번에 한 바이트 읽기
			int b = System.in.read();
			System.out.println("read() >"+ b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		// 표준 에러출력 스트림
		System.err.println("111");
		
		
	}

}
