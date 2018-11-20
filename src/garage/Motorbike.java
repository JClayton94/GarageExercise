package garage;

public class Motorbike extends Vehicle{
	
	boolean hasStorage;
	
	public Motorbike(int vehicleID, String vehicleType, int numOfWheels, int numOfDoors, int numOfSeats, String engine, int topSpeed, boolean hasStorage) {
		super(vehicleID, vehicleType, numOfWheels, numOfDoors, numOfSeats, engine, topSpeed);
		this.hasStorage = hasStorage;
		
	}

	public boolean isHasStorage() {
		return hasStorage;
	}

	public void setHasStorage(boolean hasStorage) {
		this.hasStorage = hasStorage;
	}

}
