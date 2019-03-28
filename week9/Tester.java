class numPeople {
	int peopleCounter;
}

public class Tester {
	public static void main (String [] args) {
		Person p1 = new Person("Lauren", 18, "female", false);
		Person p2 = new Person("Benny", 9, "male", false);
		Person p3 = new Person("Jane", 34, "female", true);
		Person p4 = new Person("Oliver", 87, "male", true);

		System.out.println(DMV.generateDL(p1.age, p1.driveGood));
		System.out.println(DMV.generateDL(p2.age, p2.driveGood));
		System.out.println(DMV.generateDL(p3.age, p3.driveGood));
		System.out.println(DMV.generateDL(p4.age, p4.driveGood));
		
	}
}
