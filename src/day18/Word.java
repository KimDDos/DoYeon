package day18;

public class Word {
	private String word;
	private String means;
	
	public Word() {}
	public Word(String word, String means) {
		this.word = word;
		this.means = means;
	}
	
	@Override
	public String toString() {
		return word + " : " + means;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeans() {
		return means;
	}

	public void setMeans(String means) {
		this.means = means;
	}
	
	
}
