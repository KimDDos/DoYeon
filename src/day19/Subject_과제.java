package day19;

public class Subject_과제 {
	/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
	 *   - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표
	 *   - 멤버변수 선언, 생성자, getter/setter, 그 외 필요한 메서드
	 *   - toString, print 메서드 정도?
	 * */
	private String subjectName;
	private int subjectNum;
	private double subrank;
	private String subjectTime;
	private String professor;
	private int term;
	private String timeTable;
	
	public Subject_과제() {}
	public Subject_과제(String subjectName, int subjectNum) {
		this.subjectName=subjectName;
		this.subjectNum=subjectNum;
	}
	
	
	@Override
	public String toString() {
		return "과목:" + subjectName + ", 과목코드" + subjectNum;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}

	public double getSubrank() {
		return subrank;
	}

	public void setSubrank(double subrank) {
		this.subrank = subrank;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getTimeTable() {
		return timeTable;
	}
	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}
}
