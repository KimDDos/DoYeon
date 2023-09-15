package Word;

import java.util.Objects;

public class Word implements Comparable {

	//단어, 의미
	//정렬 => Comparator 구현 객체
	//기존클래스 + Comparable 구현
	//정렬(equals 비교하여 정렬)
	//어떤값을 기준으로 정렬?
	
	private String word; 
	private String mean;
	
	public Word() {
	}
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
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
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 같은지 확인
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//클래스 정보 확인
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	
	@Override
	public int compareTo(Object o) {
		// 내 클래스의 객체 값과, 매개변수로 들어오는 객체의 값을 비교
		// Comparator(이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교)
		Word word = (Word)o;
		return this.word.compareTo(word.word); 
		//내림차순 결과 앞에 - 부호만 변경.
		//return -this.word.compareTo(word.word); 
	}
}
