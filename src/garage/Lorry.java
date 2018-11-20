package garage;

public class Lorry extends Vehicle{
	
	int maxTonnage;
	
	public Lorry(int vehicleID, String vehicleType, int numOfWheels, int numOfDoors, int numOfSeats, String engine, int topSpeed, int maxTonnage) {
		super(vehicleID, vehicleType, numOfWheels, numOfDoors, numOfSeats, engine, topSpeed);
		this.maxTonnage = maxTonnage;
	}

	public int getMaxTonnage() {
		return maxTonnage;
	}

	public void setMaxTonnage(int maxTonnage) {
		this.maxTonnage = maxTonnage;
	}

}
