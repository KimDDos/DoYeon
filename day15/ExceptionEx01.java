package day15;

import java.nio.channels.NonWritableChannelException;
import java.util.Random;

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		ExceptionEx01 ex = new ExceptionEx01();
		
		try {
			
//			 int[] arr1 = createArray(-1, 1, 10);
			// int[] arr2 = createArray(10, -6, 10);
//			int[] arr3 = createArray(10, 1, 25);
//			randomArray(arr1, 10, 10);
//			int[] arr4 = new int[-1];
//			randomArray(arr4, 10, 25);
			
//			int[] arr5 = new int[5];
			int size = -1;
			int[] arr6 = new int[size];
			
//			randomArray(arr5, -1, 25);
			randomArray(arr6, 10, 25);
			
			
		}catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}
	
	// 메서드 생성
	/* 기능 : 배열의 길이가 주어지면 길이만큼 배열을 생성하여 배열을 돌려주는 메서드(size, strat, count)
	 *       배열안에 random값을 채워서 리턴 1~10 start, count
	 *       - size가 0보다 작다면 예외발생
	 *       - start가 0보다 작다면 예외발생
	 * */
	public static int[] createArray(int size, int start, int count) {
		if(start<0) {
			throw new RuntimeException("start가 0보다 작을수 없습니다.");
		}
		if(size<0) {
			throw new RuntimeException("size가 0보다 작을수 없습니다.");	
		}
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
	}
	
	/* 기능 : 배열을 받아서 배열에 랜덤값을 채우는 메서드(arr, strat, count)
	 *       - arr 배열이 null일 경우 예외발생
	 *       - arr 배열의 길이가 0보다 작을 경우 예외발생
	 * */
	public static int[] randomArray(int[] arr, int start, int count) throws RuntimeException{
		if(arr.length < 0) {
			throw new RuntimeException("배열의 길이가 0보다 작을수 없습니다.");
		}
		if(arr==null) {
			throw new RuntimeException("arr에 null이 있습니다.");	
		}
		// 객체의 값을 비교하여 확인할때 equals를 사용
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
	}
	
	
}
