import java.util.Scanner;
public class Factorial {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int userNum;
		int factorial = 1;
		System.out.println("Please enter an integer: ");
		userNum = scnr.nextInt();
		for (i = userNum; i >= 1; --i) {
			factorial *= i;
		}
		System.out.printf("The factorial of %d is: %d%n", userNum, factorial);
	}
}
