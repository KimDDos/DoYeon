package day19;

public class Student {
	
	// 이름과 점수만 가지고 있는 클래스 생성
	// 멤버변수, 생성자, getter/setter, toString
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
	
//	@Override
//	public String toString() {
//		return name + ":" + score;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
