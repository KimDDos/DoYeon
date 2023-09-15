<<<<<<< HEAD
package day18;

import java.util.Objects;

public class Word_풀이 implements Comparable {

	// 단어, 의미
	// 정렬 => Comparator 구현 객체
	// 기존클래스 + Comparable 구현
	// 정렬(equals 비교하여 정렬)
	// 어떤 값을 기준으로 정렬?
	
	private String word;
	private String mean;
	
	public Word_풀이() {}
	public Word_풀이(String word, String mean) {
		this.word=word;
		this.mean=mean;
	}
	
	@Override
	public String toString() {
		return word + ":" + mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	// ctrl + alt + s 에서 hashCode , equals 생성 
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  // 주소가 같은지 확인
			return true;  
		if (obj == null)  
			return false;
		if (getClass() != obj.getClass())  // 클래스 정보 확인
			return false;
		Word_풀이 other = (Word_풀이) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	
	@Override
	public int compareTo(Object o) {
		// Comparable(compareTo) : 내 클래스의 객체 값과, 매개변수로 들어오는 객체의 값을 비교
		// Comparator : 이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교
		Word_풀이 word = (Word_풀이)o;
		return this.word.compareTo(word.word);
		// 자료형값의 마이너스만 붙여주면 내림차순 정렬을 시행
		// return -this.word.compareTo(word.word);
	}
	
}
=======
package day18;

import java.util.Objects;

public class Word_풀이 implements Comparable {

	// 단어, 의미
	// 정렬 => Comparator 구현 객체
	// 기존클래스 + Comparable 구현
	// 정렬(equals 비교하여 정렬)
	// 어떤 값을 기준으로 정렬?
	
	private String word;
	private String mean;
	
	public Word_풀이() {}
	public Word_풀이(String word, String mean) {
		this.word=word;
		this.mean=mean;
	}
	
	@Override
	public String toString() {
		return word + ":" + mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	// ctrl + alt + s 에서 hashCode , equals 생성 
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)  // 주소가 같은지 확인
			return true;  
		if (obj == null)  
			return false;
		if (getClass() != obj.getClass())  // 클래스 정보 확인
			return false;
		Word_풀이 other = (Word_풀이) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	
	@Override
	public int compareTo(Object o) {
		// Comparable(compareTo) : 내 클래스의 객체 값과, 매개변수로 들어오는 객체의 값을 비교
		// Comparator : 이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교
		Word_풀이 word = (Word_풀이)o;
		return this.word.compareTo(word.word);
		// 자료형값의 마이너스만 붙여주면 내림차순 정렬을 시행
		// return -this.word.compareTo(word.word);
	}
	
}
>>>>>>> 7e55295e1e8297d877e4178f3e9beaad02402913
