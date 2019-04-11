public class Vehicle {
	private String color;
	private int wheels;
	private String brand;
	private boolean turnOnOff;

	public void setWheels(int wheelCount) {
		wheels = wheelCount;
	}
	public void setBrand(String carBrand) {
		brand = carBrand;
	}
	public void setColor(String carColor) {
		color = carColor;
	}
	public void carOn(String userCommand) {
		if (userCommand.equalsIgnoreCase("go")) {
			turnOnOff = true;
		}
		turnOnOff = false;
	}
	public void carOff(String userCommand) {
		if (userCommand.equalsIgnoreCase("stop")) {
			turnOnOff = false;
		}
		turnOnOff = true;
	}
	//FIXME write get methods
}
