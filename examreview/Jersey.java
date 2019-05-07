import java.util.Scanner;

public class Jersey {
	public static int[] numbers = new int[5];
	public static int[] ratings = new int[5];
	static Scanner scan = new Scanner(System.in);
	public static void printMenu () {
		System.out.println("MENU");
		System.out.println("o - Output roster");
		System.out.println("u - Update player rating");
		System.out.println("a - Output players above a rating");
		System.out.println("q - Quit");
		System.out.println("Choose an option: ");
	}
	public static void printRoster() {
		for (int i = 0; i < numbers.length; ++i) {
			System.out.printf("Player %d -- Jersey number: %d, Rating: %d%n", i + 1, numbers[i], ratings[i]); 
		}
	}
	public static void printAboveRate() {
		System.out.print("Enter a rating: ");
		int userRate = scan.nextInt();
		System.out.printf("ABOVE %d%n", userRate);
		for (int i = 0; i < numbers.length; ++i) {
			if (ratings[i] > userRate) {
			System.out.printf("Player %d -- Jersey number: %d, Rating: %d%n", i + 1, numbers[i], ratings[i]); 
		}
		}
	}
	public static void modifyRating() {
		System.out.print("Enter a jersey number: ");
		int jerseyNum = scan.nextInt();
		System.out.print("Enter a new rating for player: ");
		int newRating = scan.nextInt();
		for (int i = 0; i < numbers.length; ++i) {
			if (numbers[i] == jerseyNum) {
				ratings[i] = newRating;
			}
		}
	}
	public static void rosterFiller() {
		for (int i = 0; i < numbers.length; ++i) {
			System.out.printf("Enter Player %d's Number:%n", i+1);
			numbers[i] = scan.nextInt();
			System.out.printf("Enter Player %d's Rating:%n", i+1);
			ratings[i] = scan.nextInt();

		}
	}
	public static void main(String [] args) {
		char userChar = '/';
		rosterFiller();
		while (userChar != 'q') {
			printMenu();
			userChar = scan.next().charAt(0);
			if (userChar == 'o') {
				printRoster();
			}
			if (userChar == 'u') {
				modifyRating();
			}
			if (userChar == 'a') {
				printAboveRate();
			}
		}
	}
	
}
