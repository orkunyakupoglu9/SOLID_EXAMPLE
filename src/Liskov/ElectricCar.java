package Liskov;



public class ElectricCar extends Car{

	@Override
	public void turnOnEngine() {
		
		
		/*Liskov prensiplerine aykýrý çünkü elektirkli arabanýn motoru yok böyle bi method yazýlamaz buna dikkat etmek lazým
		 * A ve B yer deðiþtirilebilir olacak*/
		
	}

	@Override
	public void accelerate() {
		
		System.out.println("Car is getting faster");
		
	}

}
