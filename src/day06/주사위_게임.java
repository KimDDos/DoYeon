package day06;

public class 주사위_게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex) 
		 * 주사위 : 3
		 * 칸 이동  ->  27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동  -> ??칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 0번 완주이라고 출력
		 * */
		
		// 1부터 6개의 정수 랜덤 입력
		int ran = 0;
		int num = 30;
		int sum = 0;
		int move = 0;
		
		for(int i=1; move <= num ; i++) {
			ran = (int)(Math.random()*6)+1;
			move += ran;
			sum++;
			if(ran < 6) {
				System.out.println("주사위 : " +ran+ ", " +ran+ "칸 이동, " + (num - move) + "칸 남았습니다.");
			} 
			if(move > num) {
				System.out.println("도착~!");
				System.out.println("주사위 던진횟수 : " +sum+ "회");
			} 
			
		}
		
		// while문 활용하 다시 해보기
		// 입력받지 않고 주사위가 돌아가는데 유저가 하는 듯한 느낌이 들게 만들면?
		
		
		
		
		
	}

}
