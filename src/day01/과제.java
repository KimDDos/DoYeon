package day01;
// 김도연
public class 과제 {

	public static void main(String[] args) {
		/* 매일 마지막 시간 과제 출제
		 * 카페에 과제 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택연산자 이용하여 
		 * 평균은 소숫점으로 출력하면 된다고 함
		 * 평균이 80이상이면 결과 : 합격, 아니면 결과 : 불합격 출력
		 * 내일 출석전까지 제출하면 됨! 
		 * */

		// 합격결과가 나오는 문제풀이 1
		int kor, eng, math;
		kor = 90;
		eng = 86;
		math = 95;
		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		System.out.println("점수합계 : " + sum + ", 점수평균 : " + avg);
		System.out.println(avg >= 80 ? "합격" : "불합격" );
		
		// 불합격결과가 나오는 문제풀이 2
		int kor1, eng1, math1;
		kor1 = 78;
		eng1 = 83;
		math1 = 75;
		int sum1 = kor1 + eng1 + math1;
		double avg1 = (double) sum1 / 3;
		System.out.println("점수합계 : " + sum1 + ", 점수평균 : " + avg1);
		System.out.printf("점수합계 : " + sum1 + ", 점수평균 : " + "%.2f%n", avg1);
		System.out.println(avg1 >= 80 ? "합격" : "불합격" );
		System.out.printf("%.3f%n", avg1);
		
//		강사님 문제풀이
		int kor2, eng2, math2;
		kor2 = 78;
		eng2 = 83;
		math2 = 75; 
		// 지역변수는 반드시 초기화를 해야한다.
		int sum2 = 0;
		double avg2 = 0;
		sum2 = kor2 + eng2 + math2;
		avg2 = (sum2 / 3.0) - 30;
		System.out.println("합계 : " + sum2 + ", 평균 : " + avg2);
		System.out.println("결과 : " + (avg2 >= 80 ? "합격" : "불합격"));
		
		if(avg2 >= 80) {
			System.out.printf("%.2f" + "점으로 합격하셨습니다.", avg2);
		} else if (avg2 <= 50) {
			System.out.printf("%.2f" + "점으로 보충수업 대상자로 선정되셨습니다.", avg2);
		} else {
			System.out.printf("%.2f" + "점으로 불합격하셨습니다.", avg2);
		}
		
	}

}
