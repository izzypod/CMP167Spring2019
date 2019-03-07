import java.util.Scanner;
public class Averages {
	public static void main(String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		int i;
		int userNum;
		int totalNumber = 0;
		int totalSum = 0;
		System.out.println("Please enter a natural number: ");
		userNum = scnr.nextInt();
		for (i = 1; i <= userNum; ++i) {
			totalSum += i;
		}
		double avg = (totalSum / userNum);
		System.out.printf("The average of %d natural numbers is: %.1f%n", userNum, avg);
	}
}
