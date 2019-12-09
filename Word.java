package lab5;

public class Word{
	
	/* 
	 * Skapar ett nytt ord med den givna texten.
	 */
	String text;
	public Word(String text) {
		this.text = text;
	}
	
	/* 
	 * Jämför detta ord med det specifierade objektet. Resultatet 
	 * är true om och endast om obj också är ett ord (Word) 
	 * och har samma text.
 	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Word)) {
			return false;
		}
		Word objWord = (Word) obj;
		if(this.text.equals(objWord.text)) {
			return true;
		}
			return false;
		//return false;
		//return this.text.equals(objWord.text);
	}	
	@Override
	public String toString() {
		return text;
	}
	
	public int hashCode() {
		return text.hashCode();
	}
	
}