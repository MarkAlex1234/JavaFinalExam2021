
/**
*
* QUESTION 7
*
* Mark Alexander
*
* 20112145
*
* COMP503
*
* */

import java.util.ArrayList;

public class MyVehicleList {

	
	public static void main(String[] args)
	{
		ArrayList<Vehicle> array = new ArrayList<Vehicle>();
		
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		//Add Bus Objects
		array.add(bus1);
		array.add(bus2);
		array.add(bus3);
		
		//Add Car Objects
		array.add(car1);
		array.add(car2);
		
		for(Vehicle object : array) {
			object.honk();
			object.model();
		}
	}

}
