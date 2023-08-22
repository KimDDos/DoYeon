package day05;

import javax.net.ssl.CertPathTrustManagerParameters;

public class Array02 {

	public static void main(String[] args) {
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 저장한 후 출력
		 * */
		
		int arr[] = new int[5];
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			num = (int)(Math.random()*50)+1;
			arr[i] = num;
			System.out.print(arr[i]+ " " );
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		
		// if(arr[0] > arr[1])
		// int tmp = a;     // 통상적으로 교환할때 사용할 임시 메모리 변수 이름은 tmp 을 사용함
		// a = b;
		// b = tmp;
		
		// 정렬(오름차순) 교환 
		// 4 37 23 9 43
		// 4 37 23 9 43 0 indexd와 후 index 비교후 변동없이 pass1
		// 4 37 23 9 43 1배열과 " - > 4 23 9 37 43 pass2  
		// 4 23 9 37 43 - > 4 9 23 37 43
		// 4 37 23 9 43 - > 변동없이 pass
		
		// 더블정렬 방식(처음의 수가 오른쪽 끝 배열까지 비교후 변경 )
		// 4 23 9 37 43  pass1
		// 4 9 23 37 46  pass2
		
		// 정렬을 하기 위해서는 이중 for문 필요
		int arr3[] = new int[] {4, 37, 23, 9, 43}; 
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3.length; j++) {
				if(arr3[i] > arr3[j]) {   // 오름차순
					int tmp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = tmp;
				}
			}
		}
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+ " " );
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		
		//내림차순 부등호의 방향에 따라 달라짐
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3.length; j++) {
				if(arr3[i] < arr3[j]) {   // 내림차순
					int tmp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = tmp;
				}
			}
		}
		
		//출력
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+ " " );
		}
		System.out.println();
		System.out.println("------------------------------------");
		
		// 향상된 for문
		// 순서대로 tmp에 값을 넣어주는 역할을 수행함
		// 하나씩 나열해주는 역할
		// i번지를 가지고 무언가를 하는것을 실행 할 수 없음
		// 완성된 배열을 가지고만 반복문으로 처리하거나 홀수나 짝수인지 확인 한다던지 과정만 수행 가능함
		// 바꾸거나 변환하는 것은 수행 할 수 없음
		for(int tmp : arr3) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		System.out.println("------------------------------------");

		int arr2[] = new int[20];
		// for문 밖에 랜덤함수 선언시 arr2[i]에는 동일한 값만 들어감 
		
		
		// 짝수만 배열에 저장해서 출력하는 예제임 [스스로 만듬 희희]
		for(int i=0; i<arr2.length; i++) {
			num = (int)(Math.random()*50)+1;
			arr2[i] = num;
			for(;;) {
				if(num % 2 == 0) {
					arr2[i] = num;
					break;
				} else {
					num = (int)(Math.random()*50)+1;
					int tmp = arr2[i];
					arr2[i] = num; 
					tmp = 0;
				}
			}
			System.out.print(arr2[i] + " ");
		}
		
		
		
		
	}

}
