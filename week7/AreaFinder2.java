import java.util.Scanner;
public class AreaFinder2 {
	static Scanner scan = new Scanner(System.in);
	/*
	 * Input: parameters to find area for particular shape
	 * Process: parameters are multiplied with necessary constants
	 * Output: Area of shape 
	 */
public static void rectArea() {
	double width;
	double length;
	double area;
	System.out.println("Okay! I will find the area of a rectangle.");
	System.out.println("Enter width (to the nearest hundreth): ");
	width = scan.nextDouble();
	System.out.println("Enter length (to the nearest hundreth): ");
	length = scan.nextDouble();
	area = width * length;
	System.out.printf("The area of the rectangle with width %.2f and length %.2f is approx %.3f. %n", width, length, area);
}
public static void circleArea () {
	double radius;
	double area;
	final double PIE = Math.PI;
	System.out.println("Okay! I will find the area of a circle.");
	System.out.println("Enter radius (to the nearest hundreth): ");
	radius = scan.nextDouble();
	double radiussq = Math.pow(radius, 2);
	area = radiussq * PIE;
	System.out.printf("The area of the circle with radius %.2f is approx %.3f. %n", radius, area);
}
public static void triArea () {
	double base;
	double height;
	double area;
	System.out.println("Okay! I will find the area of a triangle.");
	System.out.println("Enter base length (to the nearest hundreth): ");
	base = scan.nextDouble();
	System.out.println("Enter height (to the nearest hundreth): ");
	height = scan.nextDouble();
	area = (base * height) / 2.0;
	System.out.printf("The area of the triangle with base %.2f and height %.2f is approx %.3f. %n", base, height, area);
}
public static void main(String [] args) {
	System.out.println("Hi! Rectangle, Circle or Triangle?" );
	String userChoice = scan.nextLine();
	if (userChoice.equalsIgnoreCase("Rectangle")) {
		rectArea();
	}
	else if (userChoice.equalsIgnoreCase("Circle")) {
		circleArea();
	}
	else if (userChoice.equalsIgnoreCase("Triangle")) {
		triArea();
	}
	else {
		System.out.println("This is not a valid option.");
	}
	}
}
