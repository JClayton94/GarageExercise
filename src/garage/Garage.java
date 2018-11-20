package garage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	
	Lorry stobart = new Lorry(1, "Lorry", 6, 2, 2, "V12", 100, 20);
	
	Car mazda = new Car(2, "Car", 4, 2, 2, "S8", 150, "Convertable");

	Motorbike yamaha = new Motorbike(3, "Motorbike", 2, 0, 1, "300cc", 180, false);
}
