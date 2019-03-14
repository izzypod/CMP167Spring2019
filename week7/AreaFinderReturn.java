import java.util.Scanner;
public class AreaFinderReturn {
	static Scanner scan = new Scanner(System.in);
	/*
	 * Input: parameters to find area for particular shape
	 * Process: parameters are multiplied with necessary constants
	 * Output: Area of shape 
	 */
	public static double rectArea(double width, double length) {
		double area;
		area = width * length;
		return area;
	}
	public static double circleArea(double radius) {
		double area;
		final double PIE = Math.PI;
		double radiussq = Math.pow(radius, 2);
		area = radiussq * PIE;
		return area;
	}
	public static double triArea(double base, double height) {
		double area;
		area = (base * height) / 2.0;
		return area;
	}
	public static void main(String [] args) {
		System.out.println("Hi! Rectangle, Circle or Triangle?" );
		String userChoice = scan.nextLine();
		if (userChoice.equalsIgnoreCase("Rectangle")) {
			System.out.println("Okay! I will find the area of a rectangle.");
			System.out.println("Enter width (to the nearest hundreth): ");
			double rectwidth = scan.nextDouble();
			System.out.println("Enter length (to the nearest hundreth): ");
			double rectlength = scan.nextDouble();
			double rectarea = rectArea(rectwidth, rectlength);
			System.out.printf("The area of the rectangle with width %.2f and length %.2f is approx %.3f. %n", rectwidth, rectlength, rectarea);
		}
		else if (userChoice.equalsIgnoreCase("Circle")) {
			System.out.println("Okay! I will find the area of a circle.");
			System.out.println("Enter radius (to the nearest hundreth): ");
			double radius = scan.nextDouble();
			double circarea = circleArea(radius);
			System.out.printf("The area of the circle with radius %.2f is approx %.3f. %n", radius, circarea);
		}
		else if (userChoice.equalsIgnoreCase("Triangle")) {
			System.out.println("Okay! I will find the area of a triangle.");
			System.out.println("Enter base length (to the nearest hundreth): ");
			double tribase = scan.nextDouble();
			System.out.println("Enter height (to the nearest hundreth): ");
			double triheight = scan.nextDouble();
			double triarea = triArea(tribase, triheight);
			System.out.printf("The area of the triangle with base %.2f and height %.2f is approx %.3f. %n", tribase, triheight, triarea);
		}
		else {
			System.out.println("This is not a valid option.");
		}
	}
}
