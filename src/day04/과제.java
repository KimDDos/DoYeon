package day04;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import day02.IF02;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 5명의 점수를 입력받아서 배열에 저장하고, 점수의 합계와 평균만 출력 최고점수 찍기
		 */
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int num = 0;
		
		for (int i = 0; i < arr.length; i++) {
				System.out.println("1~100 사이의 점수를 입력해주세요.");
				num = sc.nextInt();
				arr[i] = num;
			}

		int sum = 0;
		double avg = 0;
		int max = 0;
		int person = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = (double) sum / arr.length;
			if (arr[0] >= arr[i]) {
				max = arr[0];
				person = i;
			} else if (arr[i] < arr[arr.length]) {
				max = arr[i];
				person = arr.length;
			} else {
				continue;
			}
		}
		System.out.printf("합계 : " + sum + ", 평균 : %.2f%n", avg);
		System.out.println(person + "번째 점수가 최고점수이고 " + max + "점 입니다.");

		sc.close();
	}

}
