// Create a class Student & enter mark, name of the student. If mark is more than 100, create
// exception MarksOutOfBoundException & throw it using Java.

import java.util.*;

class Student {
	int marks;
	String name;

	public Student(int marks, String name) throws Exception {
		this.marks = marks;
		this.name = name;
		if (marks < 0 || marks > 100) {
			throw new MarksOutOfBoundsException("Invalid Marks");
		} else {
			this.marks = marks;
		}
	}

	public void display() {
		System.out.println("Name: " + this.name + "\tMarks: " + this.marks);
	}
}

class MarksOutOfBoundsException extends Exception {
	public MarksOutOfBoundsException(String str) {
		super(str);
	}
}

public class a3_p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your name: ");
		String s = sc.next();
		System.out.print("Enter marks: ");
		int m = sc.nextInt();
		try {
			Student S = new Student(m, s);
			S.display();
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		sc.close();
	}
}

// Your name: Hello
// Enter marks: 101
// Error MarksOutOfBoundsException: Invalid Marks