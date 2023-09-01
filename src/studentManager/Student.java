package studentManager;

import javax.naming.ldap.StartTlsRequest;

public class Student {
	
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * = 학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter, 기타 메서드...
	 * - (학생이 수강을 시청하는 메서드(배열이 꽉 차면 배열 새로 복사생성), 철회하는 메서드, 기타 출력)
	 * */
	
	private String studentId;
	private String name;
	private String persnalNumber;
	private String college;
	private String major;
	private int size = 5;
	private Subject[] sub = new Subject[size];
	private int cnt;
	
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	public Student(String studentId, String name, String persnalNumber, String college, String major, Subject[] sub) {
		this.studentId = studentId;
		this.name = name;
		this.persnalNumber = persnalNumber;
		this.college = college;
		this.major = major;
		this.sub = sub;
	}

	// Method
	public void printInfo() {
		System.out.println("[이름: "+name+"|학번: "+studentId+"|학과/학부: "+college+"/"+major+"]");
		System.out.print("[수강중인 과목/교수명: ");
		if(sub[0]==null) {
			System.out.print("수강중인 과목 없음");
		}
		for(int i=0; i<cnt; i++) {
			sub[i].print();
		}
		System.out.println();
	}
	public void persnalInfo() {
		System.out.println("[ 주민등록번호: "+persnalNumber+" ]");
	}
	
	public void insertSub(String subjectName) {
		sub[cnt]= new Subject(subjectName);
		cnt++;
	}
	
	public Subject subjectReturn(int num) {
		Subject[] sr = new Subject[1];
		sub[num] = sr[0];
		return sr[0];
	}
	
	public void SubjectArray() {
		if(cnt==sub.length) {
			sub = new Subject[2*size];
		}
	}
	
	public void delete(String subjectName) {
		for(int i=0; i<cnt; i++) {
			if(sub[i].equals(subjectName)) {
				for(int j=i+1; j<=cnt; j++) {
					if(j==1) {
						sub[0] = null;
					}
					sub[i] = sub[j];
				}
			}
		}
		
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersnalNumber() {
		return persnalNumber;
	}
	public void setPersnalNumber(String persnalNumber) {
		this.persnalNumber = persnalNumber;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Subject[] getSub() {
		return sub;
	}
	public void setSub(Subject[] sub) {
		this.sub = sub;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
