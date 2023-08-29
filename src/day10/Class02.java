package day10;

public class Class02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : power, speed, color, mission, axel, break1
		 * 메서드 : 전원, 스피드 up/down, 상태
		 * 
		 * */
		Car c1 = new Car("그랜져 IG","흰색","2016","AT");
		c1.carPrint();
		System.out.println("--------------------");
		c1.carState();
		System.out.println("--------------------");
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.carState();
		System.out.println("--------------------");
		c1.onOff();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.carState();
		System.out.println("--------------------");
		c1.carState();
		System.out.println("--------------------");
		
	}

}


class Car{
	private boolean power;
	private int speed;
	private String name;
	private String year;
	private String color;
	private String mission;
	private String eng;
	private boolean axel;
	private boolean break1;
	
	public void carPrint() {
		System.out.println("기본정보");
		System.out.println("모델명 >"+name);
		System.out.println("연식 >"+year);
		System.out.println("색상 >"+color);
		System.out.println("미션 >"+mission);
	}
	
	public void carState() {
		if(power==true) {
			eng = "On";
		} else {
			eng = "Off";
		}
		System.out.println("계기판 상태");
		System.out.println("전원 >"+eng);
		System.out.println("속도 >"+speed);
		System.out.println("악셀 :"+axel+", 브레이크 :"+break1);
	}
	
	public Car() {}
	public Car(String name, String color, String year, String mission) {
		this.name = name;
		this.color = color;
		this.year = year;
		this.mission = mission;
	}
	
	public void onOff() {
		if(speed > 0) {
			System.out.println("시동을 끌 수 없습니다.");
		}
		if(speed == 0) {
			if(power==false) {
				this.power = true;
				this.eng = "On";
				System.out.println("전원이 켜졌습니다.");
			} else if(power == true){
				this.power = false;
				this.eng = "Off";
				System.out.println("전원이 꺼졌습니다.");
			}
		}
	}
	
	public void speedUp() {
		if(power == true) {
			this.axel = true;
			this.break1 = false;
			speed += 5;
			if(speed>=100) {
				speed = 100;
			}
		}
	}
	
	public void speedDown() {
		if(power == true) {
			this.axel = false;
			this.break1 = true;
			speed -= 5;
			if(speed <= 0) {
				speed = 0;
			}
		}
	}
	
	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isAxel() {
		return axel;
	}

	public void setAxel(boolean axel) {
		this.axel = axel;
	}

	public boolean isBreak1() {
		return break1;
	}

	public void setBreak1(boolean break1) {
		this.break1 = break1;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}
	
	
	
}