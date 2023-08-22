package day05;

import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
		
		String[] fileName = { "java의 정석.txt", "이것이 java다.jpg", "String메서드.txt"
				, "String함수.jpg", "java의 함수.png" };
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toString();
		
		
		
		for(int i=0; i<fileName.length; i++) {
			int compareTo = fileName[i].compareTo(str);
			if(compareTo > 0) {
				System.out.println("A");
			} else if(compareTo == 0) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
		
		sc.close();
		
	}

}
