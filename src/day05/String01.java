package day05;

import java.lang.invoke.StringConcatFactory;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다";  // 일반 자료형처럼 이용이 가능
		 * index 0부터 시작 
		 * */
		String str = "Hello world~!!";
		System.out.println(str);
		
		// charAt(index) : index번지에 있는 한글자를 반환
		System.out.println("--charAt--");
		System.out.println(str.charAt(0));
		
		// 배열과 비슷한점이 글자 하나하나를 저장한것으로 보면됨
		
		
		// length : 문자열의 전체 길, 공배포함
		System.out.println("--length--");
		System.out.println(str.length());
		
		// compareTo(str) : str문자열과 비교하여 같으면 0,
		// 사전순으로 앞이면 -1, 뒤면 1  // 문자열 정렬시 사용함.
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("c"));
		System.out.println("b".compareTo("b"));
		//                                ㄴ 비교대상
		
		// concat(str) : 이어붙이기 (+연사자와 같은 의미)
		// 문자열 메서드는 거의 비슷함. 
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		
		// equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		// == 주소가 같은지 확인 / equals 내용이 같은지 확인
		System.out.println("--equals--");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("def"));
		
		
		// indexOf(str) : 문자의 위치를 찾아주는 기능. 
		// 찾는 문자가 없으면 -1을 리턴
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("b"));
		System.out.println("abc".indexOf("f"));
		String email = "ehdus0731@naver.co.kr";
		// 이메일에서 아이디만 찾던지 골뱅이만 찾던지 등
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf(".")); // 가장 처음에 있는 .의 값을 리턴
		System.out.println(email.lastIndexOf(".")); // 가장 마지막에 있는 .의 값을 리턴
		// 중간에 있는 값을 찾는 방법은 없음, for문을 활용해서 위치를 계속 조회하는것으로 조회해야함
		
		
		// substring : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(0,5));
		// 시작번지는 포함, 끝번지는 포함 X
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@"))); // @부터 출력
		System.out.println(email.substring(email.indexOf("@")+1)); // @ 다음부터 출력
		
		// trim : 불필요한 공백을 제거
		System.out.println("--trim--");
		System.out.println("       hello            ".trim());
		// 값이 전송되어 올때 공백을 제거하기 위해 많이 사용함.
		
		// replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("Hello World".replace("H", "W"));
		System.out.println("Hello World".replace("World", "JAVA"));
		
		// spilt : 특정 값을 기준을 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
//		String str2 = str1.split(",");
//		for(String s : str2) {
//			System.out.println(s);
//		}
		
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1 + num2);
		
		// parseInt : 문자열을 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3 + num4);
		
		
	}

}
