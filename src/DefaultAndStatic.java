interface Vehicle{
	String getBrandName();
	String getSpeed();
	default String getTurnOn() {
		return "turn on";
	}
	static String getTurnOff() {
		return "turn off";
	}
}

 class Car implements Vehicle{
	
	@Override
	public String getBrandName() {
		return "BMW";
	}

	@Override
	public String getSpeed() {
		return "Neutral Speed";
	}
	
}

public class DefaultAndStatic {
	public static void main(String[] args) {
		Car vehicle =new Car();
		System.out.println(vehicle.getBrandName());
		System.out.println(vehicle.getSpeed());
		System.out.println(vehicle.getTurnOn()); 
		System.out.println(Vehicle.getTurnOff());
	}
	
	
}
