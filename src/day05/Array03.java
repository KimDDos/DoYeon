package day05;

public class Array03 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 arr를 생성 후 출력
		 * */
		
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
		
		
		System.out.println();
		System.out.println("---------------------");
		
		// 정렬된 배열을 내림차순으로 바꿔보기
		for(int i=0; i < arr.length-1 ; i++) {
			for(int j =i+1; j < arr.length; j++) {
				// 실수한게 j가 i+1로 넣어야 되는것임, 범위 설정간 신경 씁시다
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j]= tmp; 
				}
			}
		}
		
		// 향상된 for문
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		
		
	}

}
