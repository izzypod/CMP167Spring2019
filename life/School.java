public class School {
	private String name;
	private int classrooms;
	private String address;
	private boolean isPublic;
	private boolean isOpen;

	public School() {
		this.name = "";
		this.classrooms = 5;
		this.address = "";
		this.isPublic = true;
		this.isOpen = false;
	}
	public void setRooms(int userRooms) {
		classrooms = userRooms;
	}
	public void setName(String userName) {
		name = userName;
	}
	public void setLocation(String userAddress) {
		address = userAddress;
	}
	public void setPublic(boolean userPub) {
		isPublic = userPub;
	}
	public void setOpen(boolean userOpen) {
		isOpen = userOpen;
	}
	public int getRooms() {
		return rooms;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public boolean getPublic() {
		return isPublic;
	}
	public boolean getOpen() {
		return isOpen;
	}
	public void openUp(String userCommand) {
		if (userCommand.equalsIgnoreCase("open school")) {
			isOpen = true;
		}
		isOpen = false;
	}

}
