package day21;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보 출력
		
		File f = new File("D:\\KDY\\work_space\\DoYeon\\Out.txt");
		
		System.out.println(f.getName());    // 경로를 제외한 이름
		System.out.println(f.getPath());    // 경로 + 이름
		System.out.println(f.getParent());  // 경로만
		System.out.println(File.separator); // 파일구분자, Os별 알아서 구분자 위치를 알려줌 (많이 사용함)
		
		// 파일명과 경로가 String 형태로 들어오다면... 구분
		String fstr = f.toString();
		System.out.println(fstr);
		// fstr에서 드라이브만 추출
		String separator = File.separator;
		String drive = fstr.substring(0, fstr.indexOf(separator));
		System.out.println("드라이브만 추출 : "+drive);
		
		// 파일명만 추출
		String fileName = fstr.substring(fstr.lastIndexOf(separator)+1);
		System.out.println("파일명만 추출 : "+fileName);
		
		// 파일경로만 추출
		String path = fstr.substring(fstr.indexOf(separator), fstr.lastIndexOf(separator));
		System.out.println("경로만 추출 : "+path);
	}
	
}
