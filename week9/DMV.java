public class DMV {
	static Scanner scan = new Scanner(System.in);
	public static String generateDL(int age, boolean testPass) {
		if (age >= 17 && testPass) {
			return "DL generated";
		}
		else {
			return "Cannot generate DL";
		}
	}
	public static int calculateExpirationDate(int year) {
		return year + 10;
	}
	
	public static void main(String [] args) {
		int userAge;
		int licenseYear;
		int currYear = Year.now().getValue();
		String passTest;
		boolean passYN = false;
		System.out.println("Enter your age: ");
		userAge = scan.nextInt();
		if (userAge < 17) {
			System.out.println(generateDL(userAge, passYN));
		}
		else {
			System.out.println("Did you pass your driving test? (yes or no) ");
			passTest = scan.next();
			if (passTest.equalsIgnoreCase("yes")) {
				passYN = true;
				System.out.println(generateDL(userAge, passYN));
				System.out.println("Enter the year that you got your driver's license: ");
				licenseYear = scan.nextInt();
				int yearExp = calculateExpirationDate(licenseYear);
				if (yearExp < currYear) {
					System.out.println("Your license expired in " + yearExp);
				}
				else if (yearExp == currYear) {
					System.out.println("Your license expires this year");
				}
				else {
					System.out.println("Your license will expire in " + yearExp);
				}
				
			}
			if (passTest.equalsIgnoreCase("no")){
				System.out.println(generateDL(userAge, passYN));
			}
		}
	}
}
