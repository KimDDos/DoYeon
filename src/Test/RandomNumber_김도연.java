package Test;

import java.util.Scanner;

public class RandomNumber_김도연 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("난수의 개수를 입력하세요.");
		int randomSize = sc.nextInt();
		int sum=0;
		int random=(int)(Math.random()*99);
		
		for(int i=1; i<=randomSize; i++) {
			sum += random;
		}
		System.out.println("난수 "+randomSize+"개의 합은 "+sum);
		
		
	}

}
