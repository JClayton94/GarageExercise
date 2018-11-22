package garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	
	List<Vehicle> garageStore = new ArrayList<Vehicle>();
	
	public void addToGarage(Vehicle vehicle) {
		
		garageStore.add(vehicle);
		
	}
	
	public void removeFromGarage(Vehicle v) {
		
		garageStore.remove(v);
		//garageStore = garageStore.stream().filter(id -> id.getVehicleID() != ID).collect(Collectors.toList());
		
	}
	
}
