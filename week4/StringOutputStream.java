package week4;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;
public class StringOutputStream {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringWriter fullnameSW = new StringWriter();
		PrintWriter fullnamePW = new PrintWriter(fullnameSW);
		String firstName;
		String lastName;
		String fullName;
		
		System.out.printf("Please enter \"firstname lastname\": \n");
		firstName = input.next();
		lastName = input.next();
		
		fullnamePW.print(lastName + " , " + firstName);
		fullName = fullnameSW.toString();
		
		System.out.println(fullName);
		
	}

}
