
package day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime01 {

	public static void main(String[] args) {
		/* LocalDateTime : 현재 날짜 시간 처리
		 * LocalTime : 시간만
		 * Localdate : 날짜만
		 * */
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		// 출력 : 2023-09-11T10:21:35.605907600
		// T를 기준으로 앞에는 년월일, 뒤로는 시간
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString(); 
		// T를 기준으로 앞에 있는 연월일 추출
		String date = curr.substring(0, curr.indexOf("T"));
		System.out.println(date);
		System.out.println(curr.substring(0,curr.indexOf("T")));
		
		// T를 기준으로 뒤에 있는 시분초 추출
		String time = curr.substring(curr.indexOf("T")+1, curr.lastIndexOf("."));
		System.out.println(time);
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.lastIndexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd (a) hh:mm:ss");
		// 소문자 hh는 24시간으로 사용되고, 대문자 HH는 12시간으로 사용 
		// 오전 오후를 나타내려면 (a)를 입력하면 나옴
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2023, 9, 30, 13, 30);
		System.out.println(sDate.format(dtf));
	}

}
