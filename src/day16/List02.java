<<<<<<< HEAD
package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1. 햄버거:7000원
		 * 2. 피자:15000원
		 * 3. 음료수:2000원
		 * 4. 과자:1000원
		 * 5. 사탕:500원
		 * 6. 프로그램 종료
		 * 
		 * 메뉴선택 > 1
		 * 수량 > 2
		 * => 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 1
		 * 메뉴선택 => 3
		 * 수량 > 2
		 * => 3번 음료수 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * -- 선택한 메뉴 --
		 * 1. 햄버거 2개
		 * 2. 음료 2개 선택
		 * 총 지불금액 00000원
		 * */
		FoodManager fM = new FoodManager();
		Scanner sc = new Scanner(System.in);
		fM.menu();
		
		
	}
}

class FoodManager {
	// 멤버변수 ArrayList 메뉴, ArrayList 가격
	List<String> foodMenu = new ArrayList<>();
	List<Integer> foodPrice = new ArrayList<>();
	List<Integer> selectnum = new ArrayList<>();
	List<Integer> num = new ArrayList<>();

	// 그외 필요한 멤버변수는 선택
	int result; // 결재금액
	
	
	// 메뉴추가
	public void insertMenu() {
		foodMenu.add("햄버거");
		foodMenu.add("불고기피자");
		foodMenu.add("후라이드 치킨");
		foodMenu.add("엄마손길 감자튀김");
		foodMenu.add("콜라");
		foodMenu.add("사이다");
		foodMenu.add("아이스크림콘");
	}
	public void insertPrice() {
		foodPrice.add(4300);
		foodPrice.add(13900);
		foodPrice.add(12000);
		foodPrice.add(2600);
		foodPrice.add(1800);
		foodPrice.add(1900);
		foodPrice.add(1200);
	}
	// 메서드
	// 출력 : 결과출력, 메뉴출력, 메뉴선택 add(), 계산 sale()
	// 1. 결과출력
	public void print() {
		for(int i=0; i<selectnum.size(); i++) {
			System.out.print(foodMenu.get(selectnum.get(i))+" "+num.get(i)+"개입니다.");
		}
		System.out.println();
	}
	// 2. 메뉴출력
	public void menu() {
		insertMenu();
		insertPrice();
		Scanner sc = new Scanner(System.in);
		int selectNumber = 0;
		do {
			System.out.println("=== M e n u ===");
			for(int i=0; i<foodMenu.size(); i++) {
				System.out.println(i+1+"."+foodMenu.get(i) + " : " + foodPrice.get(i) + "원");
			}
			System.out.println("9. 메뉴선택 종료");
			selectNumber = sc.nextInt();
			switch (selectNumber) {
			case 1:
				menuAdd(0);
				break;
			case 2:
				menuAdd(1);
				break;
			case 3:
				menuAdd(2);
				break;
			case 4:
				menuAdd(3);
				break;
			case 5:
				menuAdd(4);
				break;
			case 6:
				menuAdd(5);
				break;
			case 7:
				menuAdd(6);
				break;
			case 8:
				menuAdd(7);
				break;
			case 9:	break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		} while(selectNumber != 9);
		print();
		System.out.println("총 결재금액은 "+sale()+"원입니다.");
	}
	
	// 3. 메뉴 및 수량선택
	public void menuAdd(int menu) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매수량을 입력해주세요.");
		selectnum.add(menu);
		num.add(sc.nextInt());
	}
	
	// 4. 계산
	public int sale() {
		int price = 0;
		for(int i=0; i<selectnum.size(); i++) {
			price = foodPrice.get(selectnum.get(i)) * num.get(i);
			result += price;
		}
		return result;
	}
	
}
	
	
=======
package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1. 햄버거:7000원
		 * 2. 피자:15000원
		 * 3. 음료수:2000원
		 * 4. 과자:1000원
		 * 5. 사탕:500원
		 * 6. 프로그램 종료
		 * 
		 * 메뉴선택 > 1
		 * 수량 > 2
		 * => 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 1
		 * 메뉴선택 => 3
		 * 수량 > 2
		 * => 3번 음료수 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * -- 선택한 메뉴 --
		 * 1. 햄버거 2개
		 * 2. 음료 2개 선택
		 * 총 지불금액 00000원
		 * */
		FoodManager fM = new FoodManager();
		Scanner sc = new Scanner(System.in);
		fM.menu();
		
		
	}
}

class FoodManager {
	// 멤버변수 ArrayList 메뉴, ArrayList 가격
	List<String> foodMenu = new ArrayList<>();
	List<Integer> foodPrice = new ArrayList<>();
	List<Integer> selectnum = new ArrayList<>();
	List<Integer> num = new ArrayList<>();

	// 그외 필요한 멤버변수는 선택
	int result; // 결재금액
	
	
	// 메뉴추가
	public void insertMenu() {
		foodMenu.add("햄버거");
		foodMenu.add("불고기피자");
		foodMenu.add("후라이드 치킨");
		foodMenu.add("엄마손길 감자튀김");
		foodMenu.add("콜라");
		foodMenu.add("사이다");
		foodMenu.add("아이스크림콘");
	}
	public void insertPrice() {
		foodPrice.add(4300);
		foodPrice.add(13900);
		foodPrice.add(12000);
		foodPrice.add(2600);
		foodPrice.add(1800);
		foodPrice.add(1900);
		foodPrice.add(1200);
	}
	// 메서드
	// 출력 : 결과출력, 메뉴출력, 메뉴선택 add(), 계산 sale()
	// 1. 결과출력
	public void print() {
		for(int i=0; i<selectnum.size(); i++) {
			System.out.print(foodMenu.get(selectnum.get(i))+" "+num.get(i)+"개입니다.");
		}
		System.out.println();
	}
	// 2. 메뉴출력
	public void menu() {
		insertMenu();
		insertPrice();
		Scanner sc = new Scanner(System.in);
		int selectNumber = 0;
		do {
			System.out.println("=== M e n u ===");
			for(int i=0; i<foodMenu.size(); i++) {
				System.out.println(i+1+"."+foodMenu.get(i) + " : " + foodPrice.get(i) + "원");
			}
			System.out.println("9. 메뉴선택 종료");
			selectNumber = sc.nextInt();
			switch (selectNumber) {
			case 1:
				menuAdd(0);
				break;
			case 2:
				menuAdd(1);
				break;
			case 3:
				menuAdd(2);
				break;
			case 4:
				menuAdd(3);
				break;
			case 5:
				menuAdd(4);
				break;
			case 6:
				menuAdd(5);
				break;
			case 7:
				menuAdd(6);
				break;
			case 8:
				menuAdd(7);
				break;
			case 9:	break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		} while(selectNumber != 9);
		print();
		System.out.println("총 결재금액은 "+sale()+"원입니다.");
	}
	
	// 3. 메뉴 및 수량선택
	public void menuAdd(int menu) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매수량을 입력해주세요.");
		selectnum.add(menu);
		num.add(sc.nextInt());
	}
	
	// 4. 계산
	public int sale() {
		int price = 0;
		for(int i=0; i<selectnum.size(); i++) {
			price = foodPrice.get(selectnum.get(i)) * num.get(i);
			result += price;
		}
		return result;
	}
	
}
	
	
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
