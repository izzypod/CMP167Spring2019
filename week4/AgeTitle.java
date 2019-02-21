/*
 * Author: Isabel Podolsky
 * Created: 2-21-19
 * Desc: prints the age category of the user
 */

package week4;

import java.util.Scanner;
public class AgeTitle {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int userAge;
		System.out.println("Please enter age: ");
		userAge = scan.nextInt();
		if (userAge > 25) {
			System.out.println("Adult");
		}
		else if ((userAge >= 19) && (userAge <= 25)) {
			System.out.println("Young adult");
		}
		else  {
			System.out.println("Teen");
		}
	}

}
