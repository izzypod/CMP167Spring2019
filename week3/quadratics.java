
/*
 * File: quadratics.java
 * author: izzy podolsky
 * created 2-14-19
 * desc: this program implements the quadratic formula in order to find the roots of a quadratic equation
 */

package quadratics;

import java.util.Scanner;
public class quadratics {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double avar;
      double bvar;
      double cvar;
      System.out.println("a:");
      avar = scnr.nextDouble();
      System.out.println("b:");
      bvar = scnr.nextDouble();
      System.out.println("c:");
      cvar = scnr.nextDouble();
      double discriminant = Math.pow(bvar, 2) - (4 * avar * cvar);
      double discriminantrt = Math.sqrt(discriminant);
      double root1 = ((-1 * bvar) + discriminantrt) / (avar * 2.0);
      double root2 = ((-1 * bvar) - discriminantrt) / (avar * 2.0);
      System.out.println("Your first root is: " + root1);
      System.out.println("Your second root is: " + root2);
      
      
      
      
	}
}
