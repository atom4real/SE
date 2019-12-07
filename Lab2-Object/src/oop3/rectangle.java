package oop3;

import java.util.Scanner;

public class rectangle {
	
	int x = 1;
	int y = 1;
	
	
	public double Area(double width, double height) {
		return height * width;
	}

	public void pointA() {
		System.out.println("A : X = 1, Y = 1");
	}

	public void PointB(double height) {
		System.out.println("B : X = " + x + " ,Y = " +(y + height));

	}
	
	public void PointC(double height, double width) {
		System.out.println("C : X = " + (x+width) + " ,Y = " +(y + height));
	}
	
	public void PointD(double width) {
		System.out.println("D : X = " + (x+width) + " ,Y = " +y);
	}
	
}
