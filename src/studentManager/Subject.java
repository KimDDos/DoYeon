package studentManager;

public class Subject {
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
	
	public Subject() {}
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	public Subject(String subjectName, int subjectNum, double subrank, String subjectTime, String professor, int term,
			String timeTable) {
		this(subjectName);
		this.subjectNum = subjectNum;
		this.subrank = subrank;
		this.subjectTime = subjectTime;
		this.professor = professor;
		this.term = term;
		this.timeTable = timeTable;
	}
	
	public void insertSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void print() {
		System.out.println("[ 과목:"+subjectName+"| 과목번호"+subjectNum+"| 교수명: "+professor+"]");
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSujectNum() {
		return subjectNum;
	}
	public void setSujectNum(int sujectNum) {
		this.subjectNum = sujectNum;
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
