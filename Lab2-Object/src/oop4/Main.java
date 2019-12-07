package oop4;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scann = new Scanner(System.in);
		rectangle rec = new rectangle();
		System.out.println("PointA");
		int xa = scann.nextInt();
		int ya = scann.nextInt();
		System.out.println("PointB");
		int xb = scann.nextInt();
		int yb = scann.nextInt();
		System.out.println("PointC");
		int xc = scann.nextInt();
		int yc = scann.nextInt();
		System.out.println("PointD");
		int xd = scann.nextInt();
		int yd = scann.nextInt();
		
		
		rec.findH(ya, yb);
		rec.findW(xc, xb);
		rec.Area(yb, ya, xc, xb);
	}
}
