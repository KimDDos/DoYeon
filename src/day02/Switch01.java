package day02;

import javax.swing.SpinnerNumberModel;

public class Switch01 {

	public static void main(String[] args) {
		/* switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * swihch(변수/식) {
		 * case 값1 : 실행문1; break;
		 * case 값2 : 실행문2; break;
		 * case 값3 : 실행문3; break;
		 * default : 나머지 실행문;
		 * }
		 * break; : switch문을 빠져 나갈때 사용, 없으며 빠져나가지 못함 반드시 필수사항임
		 * */
		
//		int num = 1;
//		switch(num) {
//		case 1:
//			System.out.println("num은 1입니다.");
//			break;
//		case 2:
//			System.out.println("num은 2입니다.");
//			break;
//		case 3:
//			System.out.println("num은 3입니다.");
//			break;
//			default:
//				System.out.println("잘못된 입력입니다.");
//		}
		
		// 1~6까지의 수를 랜덤으로 추출
		int num1 = (int)(Math.random()*6) + 1;
		switch(num1) {
		case 1:	System.out.println("주사위 : 1칸 전진"); break;
		case 2: System.out.println("주사위 : 2칸 전진"); break;
		case 3:	System.out.println("주사위 : 3칸 전진"); break;
		case 4:	System.out.println("주사위 : 4칸 전진"); break;
		case 5:	System.out.println("주사위 : 5칸 전진"); break;
		case 6:	System.out.println("주사위 : 6칸 전진"); break;
			default: System.out.println("잘못된 주사위값입니다.");
		}
	}

}
