package Liskov;

public class MotorCar extends Car {

	@Override
	public void turnOnEngine() {
		System.out.println("Engine turned on");
		
	}

	@Override
	public void accelerate() {
		
		System.out.println("Car is getting faster");
		
	}

	
	
}
