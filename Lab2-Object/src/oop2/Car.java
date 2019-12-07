package oop2;

public class Car {
	
	String carColor = "red";
	String brand = "Honda";
	

	double speed = 60;
	double brake = 10;
	double speedup = 20.0;
	
	public double Calculate() {
		return speed - brake;
	}
	
	public double speedUp() {
		return speed + speedup;
	}
}
