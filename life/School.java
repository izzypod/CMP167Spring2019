public class School {
	private String name;
	private int classrooms;
	private String address;
	private boolean isPublic;
	private boolean isOpen;

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
	public void openUp(String userCommand) {
		if (userCommand.equalsIgnoreCase("open school")) {
			isOpen = true;
		}
		isOpen = false;
	}
	//FIXME write get methods

}
