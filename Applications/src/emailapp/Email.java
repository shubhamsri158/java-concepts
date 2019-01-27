package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private int mailBoxCapacity = 15;
	private String department;
	private String company = "xyz.com";
	private String password;
	private int passwordLength = 5;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = getDepartmentName();
		this.email = makeEmail();
		this.password = getPassword();
		System.out.println(email + " " + password);
	}

	private String getPassword() {
		String Pass = "ABSDJSSNSKLSNS@^R&@%*@(^@(";
		char[] newPass = new char[passwordLength];
		for (int i = 0; i < passwordLength; i++) {
			int rand = (int) (Math.random() * Pass.length());
			newPass[i] = Pass.charAt(rand);
		}
		return new String(newPass);
	}

	private String makeEmail() {
		return firstName + lastName + "@" + department + "." + company;

	}

	private String getDepartmentName() {
		System.out.println("Enter the department 1. sales 2.dev 3. acc");
		Scanner sc = new Scanner(System.in);
		int dep = sc.nextInt();
		sc.close();
		if (dep == 1)
			return "sales";
		else if (dep == 2)
			return "dev";
		else if (dep == 3)
			return "acc";
		else
			return "";
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void showInfo() {
		System.out.print(
				"Email: " + email + " name :" + firstName + " " + lastName + " mailboxcapacity: " + mailBoxCapacity);
	}

}
