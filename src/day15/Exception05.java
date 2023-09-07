package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception05 {

	public static void main(String[] args) { // throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name =null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(name);
		
	}

}
