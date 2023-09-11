package day18;

import java.util.Calendar;
import java.util.Date;

public class Calendar01 {

	public static void main(String[] args) {
		/* 날짜 시간 클래스
		 * Date 클래스 : 잘 안쓰는 클래스, 새로 만들때 사용하지 않는 것을 권장
		 * Calendar 클래스 사용 => 추상클래스
		 * 직접 객체를 생성할 수 없음.
		 * new 연산자를 통해 객체 구현 X
		 * getOmstance()를 통해 구현한 인스턴스를 가져올 수 있음.
		 * 
		 * month : (0월~11월) +1을 꼭 해줘야함.
		 * day : 1일 ~ 31일
		 * week : 1=일요일, 2=월요일
		 * ampm : am=0 / pm=1
		 * */
		
		Date d = new Date();  // 직접 객체 생성 가능
		
		Calendar now = Calendar.getInstance();
		// 구현된 객체를 가져와야만 사용 가능함.
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month= now.get(Calendar.MONTH)+1;  // 0월부터 시작
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week=now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		// 시스템의 시간을 가져오는 것임
		
		// hour, minute, second
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		
		// 2023-09-11 (월)
		// 오전 09:43
		System.out.println(year+"년 "+month+"월 "+day+"일 ("+isWeeks(week)+")");
		System.out.println(isAmPm(ampm)+" "+hour+":"+minute+":"+second);
		
		String weekString = null;
		switch (week) {
		case 1:	weekString="일";	break;
		case 2:	weekString="월";	break;
		case 3:	weekString="화";	break;
		case 4:	weekString="수";	break;
		case 5:	weekString="목";	break;
		case 6:	weekString="금";	break;
		case 7:	weekString="토";	break;
		default: break;
		}
		System.out.println(year+"년 "+month+"월 "+day+"일 ("+weekString+")");
		System.out.println((ampm==0? "오전":"오후")+" "+hour+":"+minute+":"+second);
		
	}

	public static String isWeeks(int week) {
		String str = null;
		if(week==1) {
			str = "일";
			return str;
		}
		if(week==2) {
			str = "월";
			return str;
		}
		if(week==3) {
			str = "화";
			return str;
		}
		if(week==4) {
			str = "수";
			return str;
		}
		if(week==5) {
			str = "목";
			return str;
		}
		if(week==6) {
			str = "금";
			return str;
		}
		if(week==7) {
			str = "토";
			return str;
		}
		return str;
	}
	
	public static String isAmPm(int ampm) {
		String str = null;
		if(ampm==0) {
			str = "오전";
			return str;
		}
		if(ampm==1) {
			str = "오후";
			return str;
		}
		return str;
	}
	
}
