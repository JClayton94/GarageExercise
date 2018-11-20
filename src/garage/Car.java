package garage;

public class Car extends Vehicle {
	String typeOfCar;
		
		
	public Car(int vehicleID, String vehicleType, int numOfWheels, int numOfDoors, int numOfSeats, String engine, int topSpeed, String typeOfCar) {
		super(vehicleID, vehicleType, numOfWheels, numOfDoors, numOfSeats, engine, topSpeed);
		this.typeOfCar = typeOfCar;
	}



	public String getTypeOfCar() {
		return typeOfCar;
	}

	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}

}
