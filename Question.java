
public class Question {
	private String text;
	private String answer;
	
	public Question() {
		text = "";
		answer = "";
	}
	
	public void setText(String questionText) {
		text = questionText;
	}
	
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	
	public void display() {
		System.out.println(text);
	}
	
	public boolean checkAnswer(String response) {
		if(response.equals(answer)) {
			return true;
		} else {return false;}
	}
}
