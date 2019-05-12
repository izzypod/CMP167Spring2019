import java.util.Arrays;
class Animal {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;

	public Animal () {
		this.name = "";
		this.birthYear = 1900;
		this.weight=0.0;
		this.gender= 'u';
	}
	public Animal (String initName, int initYear, double initWeight, char initGender) {
		name = initName;
		birthYear = initYear;
		if (initWeight >= 0) {
			weight = initWeight;
		} 
		else {
			weight = -1;
		}
		if (initGender == 'f' || initGender == 'm') {
			gender = initGender;
		}
		else {
			gender = 'u';
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String userName) {
		name = userName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int userYear) {
		birthYear = userYear;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double userWeight) {
		if (userWeight >= 0) {
			weight = userWeight;
		}
		else {
			weight = -1;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char userGender) {
		if (userGender == 'f' || userGender == 'm') {
			gender = userGender;
		}
		else {
			gender = 'u';
		}
	}
	public boolean isMale() {
		if (gender == 'm') {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFemale() {
		if (gender == 'f') {
			return true;
		}
		else {
			return false;
		}
	}
	public int calculateAge(int currentYear) {
		if (birthYear > currentYear) {
			return -1;
		}
		else {
			return currentYear - birthYear;
		}
	}
	public void printDetails() {
		System.out.printf( "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name, birthYear, weight, gender);
	}
	public void gainWeight() {
		++weight;
	}
	public void gainWeight(double input) {
		weight += input;
		if (weight < 0) {
			weight = 0;
		}
	}
	public void loseWeight() {
		--weight;
		if (weight < 0) {
			weight = 0;
		}
	}
	public void loseWeight(double input) {
		if (weight >= 0) {
			weight -= input;
		}
		if (weight < 0) {
			weight = 0;
		}
	}

}
public class Farm {
	private Animal[] animals;
	private String farmName;
	private int numAnimals;
	public Farm() {
		this.animals = new Animal[10];
		this.farmName = "";
		this.numAnimals = 0;
	}

	public Farm(String farmName) {
		this.animals = new Animal[10];
		this.farmName = farmName;
		this.numAnimals = 0;
	}
	public Farm(int maxAnimals) {
		if (maxAnimals < 0) {
			this.animals = new Animal[0];
		}
		else {
			this.animals = new Animal[maxAnimals];
		}
		this.farmName = "";
		this.numAnimals = 0;
	}
	public Farm(String farmName, int maxAnimals) {
		if (maxAnimals < 0) {
			this.animals = new Animal[0];
		}
		else {
			this.animals = new Animal[maxAnimals];
		}
		this.farmName = farmName;
		this.numAnimals = 0;
	}
	public void setFarmName(String name) {
		farmName = name;
	}
	public String getFarmName() {
		return farmName;
	}
	public Animal[] resizeAnimalArray(Animal[] a) {
		Animal[] newArr = new Animal[a.length * 2];
		for(int i = 0; i < a.length; ++i) {
			newArr[i] = a[i];
		}
		return newArr;
	}
	public void addAnimal(Animal a) {
		if (animals[animals.length-1] != null) {
			animals = resizeAnimalArray(animals);
		}
		for (int i = 0; i < animals.length; ++i) {
			if(animals[i] == null) {
				animals[i] = a;
				++numAnimals;
				break;
			}
		}
	}
	public Animal getAnimal(int index) {
		if (index > (numAnimals - 1) || index < 0) {
			return null;
		}
		else {
			return animals[index];
		}

	}
	public int getNumAnimals() {
		return numAnimals;
	}
	public Animal getFirstAnimal() {
		if (animals[0].getName().equals(null)) {
			return null;
		}
		else {
			return animals[0];
		}
	}
	public Animal getLastAnimal() {
		Animal currAnimal = new Animal();
		for (int i = 0; i < animals.length; ++i) {
			if(animals[i] == null) {
				if (i == 0) {
					currAnimal = null;
				}
				else {
					currAnimal = animals[i-1];
				}
				break;
			}
		}
		return currAnimal;
	}
	public Animal[] getAnimals() {
		return animals;
	}
	public Animal removeAnimal(int index) {
		if (index < numAnimals && index >= 0) {
			Animal removed = new Animal();
			removed = animals[index];
			for (int i = index; i < numAnimals - 1; ++i) {                
			    animals[i] = animals[i+1];
			}
			--numAnimals;
			return removed;
		}
		else {
			return null;
		}
	}
	
	public void removeAllAnimals() {
		Arrays.fill(animals, null);
		numAnimals = 0;
	}
	public double getTotalWeightOfAllAnimals() {
		double weightTotal = 0;
		for (int i = 0; i < numAnimals; ++i) {
			weightTotal += animals[i].getWeight();
		}
		return weightTotal;
	}
	public double getAverageWeightOfAllAnimals() {
		double weightTotal = getTotalWeightOfAllAnimals();
		double avg;
		if (numAnimals > 0) {
			avg = weightTotal/numAnimals;
		}
		else {
			avg = 0;
		}
		return avg;
	}
public int getNumberOfAnimalsAboveWeight(double weight) {
		int total = 0;
		for (int i = 0; i < numAnimals; ++i) {
			if(animals[i].getWeight() > weight) {
				++total;
			}
		}
		return total;
	}
public int getNumberOfAnimalsBelowWeight(double weight) {
	int total = 0;
	for (int i = 0; i < numAnimals; ++i) {
		if(animals[i].getWeight() < weight) {
			++total;
		}
	}
	return total;
}
public void increaseWeightOfAllAnimals() {
	for (int i = 0; i < numAnimals; ++i) {
		animals[i].gainWeight();
	}
}
public void increaseWeightOfAllAnimals(double weight) {
	for (int i = 0; i < numAnimals; ++i) {
		animals[i].gainWeight(weight);
	}
}
public void printAllDetails() {
	System.out.printf( "FarmName: %20s | Number of Animals: %4d | FarmSize: %4d%n", farmName, numAnimals, animals.length);
	for (int i = 0; i < numAnimals; ++i) {
		animals[i].printDetails();
	}
}
}
