import java.util.Scanner;
public class ArrayCalculator {
	static Scanner scnr = new Scanner(System.in);
	public static int calcSum(int[] userArray, int arraySize) {
		int sum = 0;
		for (int i = 0; i < arraySize; ++i) {
			sum += userArray[i];
		}
		return sum;
	}
	public static double calcAvg(int[] userArray, int arraySize) {
		double avg = 1.0;
		int sum = calcSum(userArray, arraySize);
		avg = sum / arraySize;
		return avg;
	}
	public static int oddElements(int[] userArray, int arraySize) {
		int numOdds = 0;
		for (int i = 0; i < arraySize; ++i) {
			if (userArray[i] % 2 != 0) {
				++numOdds;
			}
		}
		return numOdds;
	}

	public static void main(String [] args) {

		int [] userNums = new int[10];
		int arrayCount;
		boolean runLoop = true;
		String userChoice;
		System.out.print("Enter amount of numbers in array (between 1 and 10): ");
		arrayCount = scnr.nextInt();
		System.out.printf("Enter %d number(s), separated by spaces: ", arrayCount);
		for (int i = 0; i < arrayCount; ++i) {
			userNums [i] = scnr.nextInt();
		}
		while (runLoop) {
			System.out.println("Would you like the sum, average, or odd-number-count of these numbers?");
			userChoice = scnr.next();
			if (userChoice.equalsIgnoreCase("sum")) {
				int userSum = calcSum(userNums, arrayCount);
				System.out.printf("The sum is %d", userSum);
				runLoop = false;
			}
			else if (userChoice.equalsIgnoreCase("average")) {
				double userAvg= calcAvg(userNums, arrayCount);
				System.out.printf("The average is %.3f", userAvg);
				runLoop = false;
			}
			else if (userChoice.equalsIgnoreCase("odd-number-count")) {
				int userOdds = oddElements(userNums, arrayCount);
				System.out.printf("There are %d odd number(s)", userOdds);
				runLoop = false;
			}
			else {
				System.out.println("Invalid.");
				continue;
			}
		}
	}
}
