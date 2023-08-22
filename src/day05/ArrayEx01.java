package day05;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 자료형 배열명[][] = new 자료형[길이][길이];
		 * */
		
		int arr[][] = new int[3][3];
		int cnt = 1;
		// 행 개수[행][열]
		for(int i=0; i<arr.length; i++) {
			// 열개수
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
