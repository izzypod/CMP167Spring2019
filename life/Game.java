import java.util.Scanner;
public class Game {
	static Scanner scanny = new Scanner(System.in);
	public static void main (String [] args) {
		boolean playGame = true;
		String userName = "";
		int userAge = 0;
		String userChoice = "";
		double userWealth = 0.0;
		while (playGame) {
			System.out.print("How many people do you want to create? ");
			int userNum = scanny.nextInt();
			if (userNum > 10) {
				System.out.print("Too many. Enter a new number.");
				continue;
			}
			else {
				Human [] people = new Human[userNum];
				for (int i = 0; i < userNum; ++i ) {
					System.out.print("Name your person: ");
					userName = scanny.next();
					people[i].setName(userName);
					System.out.print("How old is " + userName + "? ");
					userAge = scanny.nextInt();
					people[i].setAge(userAge);
					System.out.print("How much money does " + userName + " have? ");
					userWealth = scanny.nextDouble();
					people[i].setWealth(userWealth);
					System.out.print("Is " + userName + " hungry? ");
					userChoice = scanny.next();
					if (userChoice.equalsIgnoreCase("yes")) {
						people[i].setHunger(true);
					}
					else {
						people[i].setHunger(false);
					}
					System.out.print("Does " + userName + " have food in the fridge? ");
					userChoice = scanny.next();
					if (userChoice.equalsIgnoreCase("yes")) {
						people[i].setFood(true);
					}
					else {
						people[i].setFood(false);
					}
					System.out.print("Does " + userName + " have a car? ");
					userChoice = scanny.next();
					if (userChoice.equalsIgnoreCase("yes")) {
						people[i].setVehicle(true);
					}
					else {
						people[i].setVehicle(false);
					}
				}

			}
		}
	}
}
