package day05;

public class String02 {

	public static void main(String[] args) {
		/* 이것이자바다.txt  --> 파일명과 확장자를 분리하여 출력
		 * 파일명은 뭐고, 확장명은 뭐다 라고 출력
		 * */
		
		String fileName = "이것이자바다.txt";
		System.out.println("파일명 : " + fileName.substring(0, fileName.indexOf("."))+ 
				" , 확장자명 : " + fileName.substring(fileName.indexOf(".")));
		
		String file = fileName.substring(0,fileName.indexOf("."));
		System.out.println("file:" + file);
		
		String sux = fileName.substring(fileName.indexOf("."));
		System.out.println("확장자명 : " + sux);
		
		// contains(str) : 해당글자를 포함하고 있는지를 체크 boolean
		System.out.println(fileName.contains("자바"));
		
		
		
	}

}
