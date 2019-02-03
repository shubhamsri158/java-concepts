package studentadministratorapp;

import java.util.Scanner;

public class Students {

	private int balance;
	private int cost = 600;
	private String courses = "";
	private String firstName;
	private int gradeYear;
	private int id = 0;
	private String lastName;
	private String studentId;

	public Students() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name ,year of student");
		this.firstName = sc.next();
		this.lastName = sc.next();
		this.gradeYear = sc.nextInt();
		id++;
		studentId = gradeYear + "" + id;
	}

	public void enrollCourse() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter courses that are to be enrolled. Press 'Q' to quit.");
			String str = sc.next();
			if (!str.equals("Q")) {
				this.courses = this.courses + str;
				this.balance = this.balance + cost;
			} else {
				break;
			}
		} while (true);
	}

	public void pay(int payment) {
		this.balance = this.balance - payment;
	}

	public void show() {
		System.out.println();
		System.out.println("Student name : " + firstName + " " + lastName + " \nyear : " + gradeYear + " \nstudent id: "
				+ studentId + " \ncourses : " + courses + "\nbalance: " + balance);

	}
}
