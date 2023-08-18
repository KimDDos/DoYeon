package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		/* 자료형 변환 : casting
		 * 자료형(변수의 타입)
		 * a = b : a의 자료형과 b의 자료형이 맞지 않는다면 오류
		 * 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		 * 
		 * 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 되지 않는 상황
		 * 크기가 큰 자료형 = 크기가 작은 자료형
		 * 
		 * 명시적 자료형 변환 : 리터러러 값 앞에 (타입) 명시
		 * */
		
		byte num = 10;
		int num1 = num;  // int = byte (자동 형변환 가능)
		
		double num2 = 10.2;
		num1 = (int)num2;   // int = double (명시적 형변환)
		// int 자료형으로 형변환을 했기 때문에 소숫점은 날아감
		System.out.println(num1);
		
		int num3 = (int)1.2; // 소숫점음 날아감
		System.out.println(num3);
		
		/* 문제 : 국어, 영어, 수학 세값의 합계와 평균을 출력 (소수점 살려서)
		 * */
		double kor = 98.85, eng = 88.87, math = 98.54;
		double sum = kor + eng + math;
		double avg = sum / 3;
		System.out.println("국어, 영어, 수학과목 합계 점수는 (" + sum + ")점 입니다.");
		System.out.println("국어, 영어, 수학과목 평균 점수는 (" + avg + ")점 입니다.");
		
		double kor1 = 98.85, eng1 = 88.87, math1 = 98.54;
		int sum1 = (int)(kor1 + eng1 + math1);
		int avg1 = (int)(sum1 / 3);
		System.out.println("국어, 영어, 수학과목 합계 점수는 (" + sum1 + ")점 입니다.");
		System.out.println("국어, 영어, 수학과목 평균 점수는 (" + avg1 + ")점 입니다.");
		
		int kor2 = 98, eng2 = 88, math2 = 98;
		int sum2 = kor2 + eng2 + math2;
		double avg2 = (double)sum2 / 3;
		System.out.println("국어, 영어, 수학과목 합계 점수는 (" + sum2 + ")점 입니다.");
		System.out.println("국어, 영어, 수학과목 평균 점수는 (" + avg2 + ")점 입니다.");
		
		// 강사쌤 문제풀이
		int kor3, eng3, math3;
		kor3 = 77;
		eng3 = 78;
		math3 = 89;
		int sum3 = kor3 + eng3 + math3;
		double avg3 = (double)sum / 3;
		// int avg3 = sum / 3;  -> 예외처리 발생
		// 자료형이 double이고, 나누는 값이 0아면 -> Infinity
		// 자료형이 int이고, 나누는 값 0이면 -> 예외발생(Exception)
		System.out.println("합계 : " + sum3 + ", 평균 : " + avg3);
		
	}

}
