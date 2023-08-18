package day03;

public class For01 {
	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do ~ while
		 * - for, while문은 동작방식이 같음  
		 * -> 조건에 맞지 않으면 한번도 실행 안 될 수도 있음 
		 * - do~while문은 두 방식과 동작 방식이 조금 다름
		 * -> 조건에 맞지 않아도 무조건 1번은 실행함
		 * 
		 * 초기화식이 생략이 가능해서 생략하더라도 세미콜론은 생략되면 안 됨
		 * 조건식 생략시 무조건 참으로 무한 반복함, 이때 break; 로 종료할수있음
		 * 
		 * for(초기화식; 조건식; 증감식;) {
		 *   실행문;
		 * }
		 * 
		 * - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화 : 생략가능
		 * 			처음 1번만 실행
		 * 			초기화식에 float를 넣으면 안 됨 -> 0.1이 정확하게 나오는 것이 아니기 때문에 정확한 값으로 계산을 할 수 없기 때문에
		 * - 조건식 : 반복문의 반복을 결정하는 식(true -> 반복) : 생략가능
		 * - 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		 * 
		 * for(a; b; c;) {
		 *   d;
		 * }
		 * 순서 : a -> b -> d -> c -> b -> d -> c -> b -> d -> c ...
		 * */
		
		// 1~10 까지 출력하는 예제
		// 초기화 : i변수 사용 int i = 1;
		// 조건식 : 10이 될때까지 출력 -> i <= 10;
		// 중감식 : i거 1씩 증가  i++;
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); // 줄바꿈용
		System.out.println("--------------------");
		
		// 10부터 1까지 출력하는 예제
		for(int i =10; i >= 1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("--------------------");
		
		// 2부터 10까지 짝수만 출력 예제
		
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("--------------------");
		
		// 1부터 20까지 중 짝수만 출력 예제
		// if문을 사용하여 조건에 맞는 자료만 출력
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("--------------------");
		
		// 1부터 20까지 중 홀수만 출력 예제
		// if문을 사용하여 조건에 맞는 자료만 출력
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("--------------------");
		
		// 1부터 10까지 홀수만 출력 / 짝수일때는 짝수 pass~!!
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i);
			} else {
				System.out.print(" Pass~! ");
			}
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("--------------------");
		
		// 1부터 10까지 합계 출력
		// 초기화 : 1부터, 조건식 : 10까지, 증감식 : 1씩 증가
		// 실행문 : 누적 더하기
		// 실행 후 출력
		// 지역변수() {생성   소멸}
		
		int sum = 0;
		// 지역변수 sum을 초기화하지 않고 선언만 한 상태로 사용하고 싶다고 class 전역변수로 선언하면 됨
		// 메인 메소드 위에 static int sum; 이라고 선언하면 정적인 전역변수로서 활용이 가능하나 활용성이 떨어짐 (sum을 활용할때마다 초기화룰 해줘야함. int 더 치기 싫다고 그러는게 더 안 좋음)
		for(int i=1; i<=10; i++) {
			sum += i;
		} 
		System.out.println(sum);
		
		System.out.println("--------------------");
		
		// 1부터 10까지 짝수의 합과 홀수의 합을 출력
		/* 랙 1부터, 10까지 1씩 증가하여 값을 비교
		 * if 짝수인지 판단 -> 짝수의 합계
		 *    홀수인지 판단 -> 홀수의 합계
		 * for문 종료후 -> 출력
		 * */
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum1 += i;
			} else if(i%2==1) {
				sum2 += i;
			} else {
				System.out.println("출력할 수 있는 값이 아닙니다.");
			}
		}
		System.out.println("짝수 합 : " +sum1+ ", 홀수 합 : "+sum2);
		System.out.println("--------------------");
				
		// 내가 따로 만들어본것임 수업내용 X
//		int i, n;
//		int sum;
//		for(i = 0; i<=10; i++) {
//			n = 1 + i;
//			System.out.print(n+" ");
//		}
		
		int i = 0;
		while(0 <= i && i <= 10) {
			System.out.print(i+" ");
			i++;
		} 
		System.out.println();
		System.out.println("i : " + i);
		// main method의 전역변수인 i는 while문 안에서 연산이 끝난값이 유지되는것을 볼 수 있음
		
		i = 5;
		while(0 <= i && i <= 10) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		System.out.println("i : " + i);
		
	}

}
