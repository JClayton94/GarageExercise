package garage;

public abstract class Vehicle {
	
	int vehicleID;
	String vehicleType;
	int numOfWheels;
	int numOfDoors;
	int numOfSeats;
	String engine;
	int topSpeed;
	
	public Vehicle(int vehicleID, String vehicleType, int numOfWheels, int numOfDoors, int numOfSeats, String engine, int topSpeed) {
		
		this.vehicleType = vehicleType;
		this.vehicleID = vehicleID;
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
		this.numOfSeats = numOfSeats;
		this.engine = engine;
		this.topSpeed = topSpeed;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	

}
