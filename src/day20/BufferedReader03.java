<<<<<<< HEAD
package day20;

public class BufferedReader03 {

	public static void main(String[] args) {
		/* 
		 * */
	}

}
=======
package day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader 를 통해서 out.txt 파일을
		 * map에 저장하고, 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(값) : String => int
		 * */
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		int sum=0;
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}
			String name = line.substring(0, line.indexOf(" "));
			String num = line.substring(line.indexOf(" ")+1, line.length());
			int score = Integer.parseInt(num);
			map.put(name, score);
			sum += map.get(name);
		}
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp)+"점");
			
		}
		System.out.println("합계:"+sum+"점, 인원수:"+map.size()+"명");
		br.close();
	}

}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
