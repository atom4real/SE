package oop3;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scann = new Scanner(System.in);
		rectangle rec = new rectangle();
		double width = scann.nextDouble();
		double height = scann.nextDouble();
		
		int x = scann.nextInt();
		int y = scann.nextInt();
		System.out.println(rec.Area(width, height));

		rec.pointA();
		rec.PointB(height);
		rec.PointC(height, width);
		rec.PointD(width);
		
	}
}
