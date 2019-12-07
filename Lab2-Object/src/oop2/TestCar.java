package oop2;

public class TestCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.brand);
		System.out.println(car1.carColor);
		System.out.println(car1.Calculate());
		System.out.println(car1.speedUp());
	}
}
