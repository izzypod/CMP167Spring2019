import java.util.Random;
import java.util.Scanner;
class PromptBank {

	static String [] questions = new String[6];
	static String [] statements = new String[6];
	static Random randy = new Random();

	public static void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "When you mention BLANK1 and BLANK2, you look upset. What's wrong?";
		statements[4] = "When you say BLANK1 and BLANK2, I doubt that you're telling me exactly how you're feeling.";
		statements[5] = "BLANK1 and BLANK2? Tell me why you feel this way.";
	}
	public static void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "Are you sure that BLANK1 and BLANK2 don't scare you?";
		questions[4] = "Next session, we should talk more about BLANK1 and BLANK2, don't you think?";
		questions[5] = "Are BLANK1 and BLANK2 holding you back from achieving your goals?";
	}
	 
	public static String getRandomStatementTrunk(){
		populateStatementsArray();
		int index = randy.nextInt(5);
		return statements[index];
	}
	
	public static String getRandomQuestionTrunk(){
		populateQuestionsArray();
		int index = randy.nextInt(5);
		return questions[index];
	}

}
class ElizaLogic {
	static Scanner scan = new Scanner(System.in);
	public static String[] arrayMaker(String userPhrase) {
		if (userPhrase.charAt(userPhrase.length() - 1) == '?' || userPhrase.charAt(userPhrase.length() - 1) == '.' || userPhrase.charAt(userPhrase.length() - 1) == '!') {
			userPhrase = userPhrase.substring(0, userPhrase.length()-1);
		}
		String[] userWords = userPhrase.split(" ");
		return userWords;
	}
	public static String firstWord(String[] userWords) {
		return userWords[0];
	}
	public static String lastWord(String[] userWords) {
		return userWords[userWords.length - 1];
	}
	public static String statement(String word1, String word2) {
		String sayThis = PromptBank.getRandomStatementTrunk();
		sayThis = sayThis.replace("BLANK1", word1);
		sayThis = sayThis.replace("BLANK2", word2);
		return sayThis;
	}
	public static String drama(String word1, String word2) {
		String sayThis = PromptBank.getRandomStatementTrunk();
		sayThis = sayThis.replace("BLANK1", word1);
		sayThis = sayThis.replace("BLANK2", word2);
		sayThis = "WOW! Dramatic! ".concat(sayThis);
		return sayThis;
	}
	public static String question(String word1, String word2) {
		String sayThis = PromptBank.getRandomQuestionTrunk();
		sayThis = sayThis.replace("BLANK1", word1);
		sayThis = sayThis.replace("BLANK2", word2);
		return sayThis;
	}
	public static void elizaRunner() {
		String userPhrase = "";
		String userName = "";
		String userCommand = "";
		boolean go = true;
		while (go) {
			System.out.println("Hello, my name is Eliza. What is your name?");
			userName = scan.nextLine();
			System.out.printf("Hello %s. Tell me what is on your mind today in 1 sentence.%n", userName);
			userPhrase = scan.nextLine();
			while (!(userPhrase.equals("exit"))) {

				String[] userWords = arrayMaker(userPhrase);
				String first = firstWord(userWords);
				String last = lastWord(userWords);
				if (userPhrase.charAt(userPhrase.length() - 1) == '?') {
					System.out.println(question(first, last));
				}
				else if (userPhrase.charAt(userPhrase.length() - 1) == '!') {
					System.out.println(drama(first, last));
				}
				else {
					System.out.println(statement(first, last));
				}
				userPhrase = scan.nextLine();
			}
			System.out.println("Do you want to run the session again?");
			userCommand = scan.next();
			if (userCommand.equalsIgnoreCase("no")) {
				System.out.println("Goodbye, until next time");
				go = false;
			}
			else {
				continue;
			}
		}
	}
}

public class ProjectEliza {
	public static void main(String [] args) {
		ElizaLogic.elizaRunner();
	}
	
}
