/*
 * Author: Isabel Podolsky
 * Date created: 3-5-19
 * Desc: finds sum of first n natural numbers after user is prompted for n 
 */

import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		int n;
		int sumNum;
		int sumTotal = 0;
		System.out.println("Enter a natural number:");
		n = scanny.nextInt();
		if (n < 0) {
			System.out.println("Invalid number");
		}
		
		else {
			sumNum = n;
			
			 while (sumNum > 0) {
				sumTotal += sumNum;
				--sumNum;
			}
			 
			System.out.println("The sum is " + sumTotal);
		}
	}
		
}
