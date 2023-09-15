package day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReader03_풀이 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader 를 통해서 out.txt 파일을
		 * map에 저장하고, 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(값) : String => int
		 * */
		
		BufferedReader br = new BufferedReader(new FileReader("Out.txt"));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int sum=0;
		
		// while((br.readLine()) != null)  <- 이것도 됨 ㅋ
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
		}
		System.out.println(map);
		for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum += map.get(key);
		}
		System.out.println("합계:"+sum+" | 인원수:"+map.size());
	}

}
