import java.util.Scanner;
public class powerof2 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int userNum;
		int pow = 1;
		System.out.println("Please enter a number n: ");
		userNum = scnr.nextInt();
		for (i = 0; i <= userNum; ++i) {
			if (i < userNum) {
			System.out.println(pow);
			pow *= 2;
			}
			else {
			System.out.println(pow);
			}
			
		}
		System.out.printf("Two to the power of %d is %d%n", userNum, pow);
	}
}
