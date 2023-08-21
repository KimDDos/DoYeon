package day04;

public class Array01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수의 집합 (참조변수)
		 * - 참조변수는 초기화가 미리 되어 있음. 대신 그 값은 'null' or '0'
		 * - 기본형 변수는 초기화를 해주지 않음. 직접 초기화를 해줘야 함.
		 * - 배열 선언 방법
		 *   타입[] 배열이름;
		 *   타입 배열이름[];
		 *   
		 * - 배열 선언 & 초기화
		 *   타입[] 배열이름 = new 타입[길이];   // 가장 일반적인 방법
		 *   타입[] 배열이름 = new 타입[]{값, 값, 값, 값, 값, 값, 값 ...}
		 *   타입[] 배열이름 = {값, 값, 값, 값, 값 ....} 
		 *   //             ㄴ 선언과 동시에 초기화를 할 때만 가능
		 * - 배열의 길이는 0이상 이여야 한다. (0을 포함하는 상수여야 한다.)
		 * - 배열의 길이는 length 확인할 수 있음.
		 * - 배열의 시작번지는 0번지부터 시작.
		 * 	 배열[3] -> 0 1 2
		 * 	 배열의 마지막 번지는 항상 length - 1 임  
		 * */
		
		int[] arr;  // 숫자형 배열을 만들겠습니다~
		arr = new int[5];  // 출력 : 객체 주소인 ( [I@123a439b )
		int arr1[]; // null
		int arr2[] = new int[] {1,2,3,4,5}; // 출력 : 객체 주소인 ( [I@1c4af82c )
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		for(int i=0; i<arr2.length; i++) {  // arr2.length 활용시에 =를 쓰면 안 됨
			System.out.print(arr2[i]+" ");
		} // 반복문을 통해서 반복적으로 찍어줘야함.
		
		System.out.println();
		System.out.println("-----------");
//		System.out.println(arr2);  // 주소가 출력
//		System.out.println(arr);   // 
		int arr3[] = {1,2,3};
		
		/* 배열을 사용하는 이유
		 * 반복문을 이용할 수 있기 때문에 편리함
		 * 관리가 쉽다. (가장 큰 이유임!)
		 * 
		 * */
		
		// 배열에 값을 추가
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0]);
		System.out.println("-----------");
		for(int i=0; i<arr.length; i++) {
			arr[i] = i*10 + 10;  // +10을 해야 0번지의 값을 추가할 수 있고, length - 1 을 잊지말것
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------");
		
		/* 배열을 생성하고, 1 2 3 4 5로 저장 및 출력
		 * */
		
		// 선언 및 for문을 통한 배열 값 입력
		int[] array = new int[5];  // 가장 일반적인 방식
		for(int i=0; i<array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("--------------");
		
		
		// 짝수 구하기, arr5 배열으 ㄹ생성하고 짝수만 저장하고, 출력
		int[] arr5 = new int[10];
		for(int i=0; i<arr5.length; i++) {
//			arr5[i] = i*2 +2;
			arr5[i] = (i+1)*2;
			System.out.print(arr5[i]+" ");
		}
		System.out.println();
		System.out.println("--------------");
		
		// 홀수 구하기
		int[] arr6 = new int[10];
		for(int i=0; i<arr6.length; i++) {
			arr6[i] = i*2 +1;
			System.out.print(arr6[i]+" ");
		}
		
		
		
		
	}

}
