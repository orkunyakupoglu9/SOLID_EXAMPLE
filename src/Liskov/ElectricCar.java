package Liskov;



public class ElectricCar extends Car{

	@Override
	public void turnOnEngine() {
		
		
		/*Liskov prensiplerine ayk�r� ��nk� elektirkli araban�n motoru yok b�yle bi method yaz�lamaz buna dikkat etmek laz�m
		 * A ve B yer de�i�tirilebilir olacak*/
		
	}

	@Override
	public void accelerate() {
		
		System.out.println("Car is getting faster");
		
	}

}
