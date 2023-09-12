package day19;

import java.util.ArrayList;
import java.util.Objects;

public class Student_과제 {

	private String stdNum;
	private String stdName;
	private String stdresisterNum;
	private String faculty;
	private String major;
	private ArrayList<Subject_과제> subList = new ArrayList<Subject_과제>();
	private int subCount;
	
	public Student_과제() {}
	public Student_과제(String stdName, String stdNum) {
		this.stdName=stdName;
		this.stdNum=stdNum;
		subList.add(new Subject_과제(null, 0));
	}
	public Student_과제(String stdName, String stdNum, String subjectName, int subjectNum) {
		this(stdName, stdNum);
		subList.add(new Subject_과제(subjectName, subjectNum));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stdName, stdNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_과제 other = (Student_과제) obj;
		return Objects.equals(stdName, other.stdName) && Objects.equals(stdNum, other.stdNum);
	}
	@Override
	public String toString() {
		
		
		
		return "학생명:" + stdNum + ", 학번" + stdName ;
	}
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdresisterNum() {
		return stdresisterNum;
	}
	public void setStdresisterNum(String stdresisterNum) {
		this.stdresisterNum = stdresisterNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public ArrayList<Subject_과제> getSubList() {
		return subList;
	}
	public void setSubList(ArrayList<Subject_과제> subList) {
		this.subList = subList;
	}
	public int getSubCount() {
		return subCount;
	}
	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}
	
}
