package studentadministratorapp;

import java.util.Scanner;

/*Your application should do the following:
 Ask the user how many new students will be added to the database
 The user should be prompted to enter the name and year for each student
 The student should have a 5-digit unique ID, with the first number being their grade level
 A student can enroll in the following courses:
History 101
Mathematics 101
English 101
Chemistry 101
Computer Science 101
 Each course costs $600 to enroll
 The student should be able to view their balance and pay the tuition
 To see the status of the student, we should see their name, ID, courses enrolled, and balance*/

public class StudentDatabaseApplication {

	public static void main(String args[]) {
		// ask user how many students need to be entered
		System.out.println("Enter the number of student to be admitted");
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		Students students[] = new Students[noOfStudents];
		for (int i = 0; i < noOfStudents; i++) {
			students[i] = new Students();
			students[i].enrollCourse();
			System.out.println("Enter the payment that is to be made");
			students[i].pay(sc.nextInt());
		}
		sc.close();
		// show details of students when needed
		for (int i = 0; i < noOfStudents; i++) {
			students[i].show();
		}
	}

}
