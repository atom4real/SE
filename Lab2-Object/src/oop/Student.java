package oop;

public class Student {
	String studentID;
	String name;
	int score;
	
	
	void printScore() {
		System.out.println("Score of "+studentID+" : "+name+" is "+score);
	}
	
	int compareScore(Student otherStudent) {
		return otherStudent.score - this.score;
	}
	
	
	
	int calculateGrade(Student otherStudent) {
		if(score > 80 && score <= 100) {
			System.out.println("Grade : A");
		}
		else if (score > 70 && score <= 80) {
			System.out.println("Grade : B");
		}
		else if (score > 60 && score <= 70) {
			System.out.println("Grade : C");
		}
		else {
			System.out.println("Grade : F");
		}
		return score;
		
		
	
	}
}
