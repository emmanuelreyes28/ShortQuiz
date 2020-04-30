import java.util.Scanner;
public class QuestionDemo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ChoiceQuestion first = new ChoiceQuestion();
		first.setText("What was the original name of the Java language?");
		first.addChoice("*7", false);
		first.addChoice("Duke", false);
		first.addChoice("Oak", true);
		first.addChoice("Gosling", false);
		//first.setAnswer("Oak");

		ChoiceQuestion second = new ChoiceQuestion();
		second.setText("In which country was the inventor of Java born?");
		second.addChoice("Australia", false);
		second.addChoice("Canada", true);
		second.addChoice("Denmark", false);
		second.addChoice("United States", false);
		//second.setAnswer("Canada");

		
		presentQuestion(first);
		//System.out.println("");
		presentQuestion(second);
		//String response = in.nextLine();
		//System.out.println(first.checkAnswer(response));
		//System.out.println(second.checkAnswer(response));
		//in.close();

	}
	
	public static void presentQuestion(ChoiceQuestion q) {
		Scanner in = new Scanner(System.in);
		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
	
}
