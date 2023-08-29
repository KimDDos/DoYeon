package day10;

import java.lang.ProcessHandle.Info;

public class Class03 {

	public static void main(String[] args) {
		// Tv
		Tv t1 = new Tv("LG");
		t1.tvPrint();
		t1.isPower();
		t1.volumeUp();
		t1.volumeUp();
		t1.volumeUp();
		t1.volumeUp();
		t1.volumeUp();
		
		t1.chUp();
		t1.tvPrint();
		t1.isPower();
		t1.tvPrint();
		
	}

}

// 멤버변수 : name, power, channel, vol
// 메서드 : 전원, 패널 Up/Down

class Tv{
	private boolean power;
	private String name;
	private int ch;
	private int volume;
	private String[] chInfo;
	
	// 생성자
	public Tv() {}
	public Tv(String name) {
		this.name = name;
	}
	
	public void tvPrint() {
		System.out.println("----------------");
		System.out.println("전원 >" + power);
		System.out.println("ch:"+ch+", 소리:"+volume);
		System.out.println("----------------");
	}
	
	public void isPower() {
		if(!power) {
		power = true;
		System.out.println("Tv 전원이 켜졌습니다.");
		} else {
			power = false;
			System.out.println("Tv 전원이 꺼졌습니다.");
		}
	}
	
	public void volumeUp() {
		if (power == true) {
			if (25 >= volume && volume >= 0) {
				volume++;
				System.out.println("소리:" + volume);
			}
		} else {
			System.out.println("Tv 전원을 켜주세요.");
		}
	}
	
	public void volumeDown() {
		if (power == true) {
			if (25 >= volume && volume >= 0) {
				volume--;
				System.out.println("소리:" + volume);
			}
		} else {
			System.out.println("Tv 전원을 켜주세요.");
		}
	}
	
	public void chUp() {
		if (power == true) {
			if (ch > 100) {
				ch = 0;
			} else {
				ch++;
			}
			System.out.print("ch :" + ch);
		} else {
			System.out.println("Tv 전원을 켜주세요.");
		}
	}
	
	public void chDown() {
		if (power == true) {
			if (ch < 0) {
				ch = 10;
			} else {
				ch--;
			}
			System.out.print("ch :" + ch);
		} else {
			System.out.println("Tv 전원을 켜주세요.");
		}
	}
	
	public String[] chInfo() {
		String[] info = new String[10];
		info[0] = "6시 내고향";
		info[1] = "미운새끼";
		info[2] = "빚만 많은 SOLO";
		info[3] = "전치적 꼽사리시점";
		info[4] = "달오락실";
		info[5] = "혜미리예채파 -부글부글 지옥살이-";
		info[6] = "귀찮아";
		info[7] = "이정도만?";
		info[8] = "해보자구";
		info[9] = "잇힝";
		
		return info;
	}
	
	public boolean getPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}