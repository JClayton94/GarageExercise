package garage;

public class Main {

	public static void main(String[] args) {

		Garage garage = new Garage();
		
		Lorry stobart = new Lorry(1, "Lorry", 6, 2, 2, "V12", 100, 20);
		
		Car mazda = new Car(2, "Car", 4, 2, 2, "S8", 150, "Convertable");

		Motorbike yamaha = new Motorbike(3, "Motorbike", 2, 0, 1, "300cc", 180, false);
		
		System.out.println(yamaha.getNumOfSeats());
		
		garage.addToGarage(stobart);
		garage.addToGarage(mazda);
		garage.addToGarage(yamaha);
		
	}

}
