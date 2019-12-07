package oop;

public class GradeCalculate {
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

		System.out.println("Apisit");
		System.out.println("Score : " + Apisit.calculateGrade(Apisit));
		System.out.println("Thaksin");
		System.out.println("Score : " + Thaksin.calculateGrade(Thaksin));
		System.out.println("Samak");
		System.out.println("Score : " + Samak.calculateGrade(Samak));
	}
}
