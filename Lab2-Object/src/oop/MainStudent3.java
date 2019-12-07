package oop;

public class MainStudent3 {
	public static void main(String[] args) {
		Student Apisit = new Student();
		Apisit.name = "Apisit";
		Apisit.studentID = "4921362";
		Apisit.score = 10;
		
		Student Thaksin = new Student();
		Thaksin.name = "Thaksin";
		Thaksin.studentID = "402561";
		Thaksin.score = 56;
		
		Student Samak = new Student();
		Samak.name = "Samak";
		Samak.studentID = "489653";
		Samak.score = 28;
		
		System.out.println(Apisit.compareScore(Thaksin));
		System.out.println(Apisit.compareScore(Samak));
		System.out.println(Thaksin.compareScore(Samak));
	}

}
