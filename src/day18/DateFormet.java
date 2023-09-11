package day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormet {

	public static void main(String[] args) throws ParseException {
		/* 날짜의 형식을 맞춰주기 위한 설정
		 * formet 설정
		 * 날짜는 년 원 일 요일 시 분 초
		 * 날짜를 -> 문자로 변환, String
		 * */
		
		Date date = new Date();
		System.out.println(date);
		// 출력 : Mon Sep 11 10:10:32 KST 2023

		// 날짜를 문자로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) hh:mm:ss");
		// MM은 월, mm은 분
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		// 문자열을 날짜로 변환
		String birth = "2009-09-30 08:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//		Date date2 = sdf2.parse(dateString);
		Date date2 = sdf2.parse(birth);
		System.out.println(date2);
	}

}
