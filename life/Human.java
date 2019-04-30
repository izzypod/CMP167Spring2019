import java.util.Random;
public class Human {
	private int age;
	private String name;
	private double wealth;
	private int foodquant;
	private boolean hunger;
	private boolean hasVehicle;
	private Vehicle[] vehicles;
	private Random randy = new Random();

	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = false;
		this.foodquant = 10;
		this.vehicles = new Vehicle[100];
	}

	public void setAge(int userAge) {
		age = userAge;
	}
	public void setName(String userName) {
		name = userName;
	}
	public void setWealth(double userWealth) {
		wealth = userWealth;
	}
	public void setHunger(boolean userHunger) {
		hunger = userHunger;
	}
	public void setFood(boolean gotFood) {
		if (gotFood) {
			foodquant = randy.nextInt(100);
		}
		else {
			foodquant = 0;
		}
	}
	public void setVehicle(boolean carYN) {
		this.hasVehicle = carYN;
	}
	public void ageUp() {
		++age;
	}
	public void working() {
		if (!hunger) {
			wealth += 1000 * randy.nextDouble();
			hunger = true;
		}
		else {
			System.out.print("I cannot work, I'm too hungry.");
		}
	}
	public void eat() {
		if (foodquant > 0) {
			hunger = false;
		}
		else {
			hunger = true;
			System.out.print("I cannot eat, I have no food.");
		}
	}
	public void buyFood() {
		if (wealth > 10) {
			foodquant += randy.nextInt(25);
			wealth -= 10;
		}
		else {
			System.out.print("I cannot buy food, I don't have enough money.");
		}
	}
	//FIXME write get methods
}
