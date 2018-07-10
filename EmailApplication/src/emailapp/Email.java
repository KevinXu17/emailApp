package emailapp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String companySuffix = "SUPERcompany.com";

	
	//Constructor by first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email create: " + this.firstName + " " + this.lastName );
		
		//call ask department
		this.department =  setDepartment();
		System.out.println("Your department set to " + this.department + ".");
		
		//call set randompassword
		this.password = makeRandomPassword( defaultPasswordLength);
		
		//combine element to make new email
		email = this.firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department.toLowerCase()+ "." + this.companySuffix;
	
		System.out.println("Your email is: "+ this.email+ ", \n and" +  " password is: " + this.password + "." );

	}
	
	//getter
	public int getMailboxCapacity() {return this.mailboxCapacity;}
	public String getAlternateEmail() {return this.alternateEmail;}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	//check change password
	public void getPassword() {
		System.out.println("Your password is: " + this.password);
	}
	
	
	//ask for department
	private String setDepartment() {
		System.out.println("Department Code: \n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for None");
		System.out.println("Enter department code:");
		
		Scanner input = new Scanner(System.in);
		int dpmChoice =  input.nextInt();
		
		switch (dpmChoice) {
		case 1: return "Sales";
		case 2: return "Development";
		case 3: return "Accounting";
		default: return "None";
		}
		
		
	}
	
	//generate a random password
	private String makeRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%";
		char[] passwrd = new char[length];
		for (int i = 0 ; i < length ; i++) {
			int randm =  (int) (Math.random() * passwordSet.length());
			passwrd[i] = passwordSet.charAt(randm);
		}
		
		
		return new String(passwrd);
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alternateEmail
	public void setAlternateEmail (String alternateEmail) {
		this.alternateEmail = alternateEmail;
	} 
	
	
	//change password
	public void changePassWord() {
		System.out.println("Please enter your old password:");
		Scanner input = new Scanner(System.in);
		String inputPassWord = input.next();
		
		if (inputPassWord.equals(this.password)) {
			
			System.out.println("Please enter your new password:");
			Scanner input2 = new Scanner(System.in);
			String newPassWord = input.next();
			System.out.println("Please enter your new password again:");
			String newPassWord2 = input.next();
			
			if (!newPassWord.equals(newPassWord2)) {
				System.out.println("Input different password.");
				changePassWord();
			}
			
			this.password = newPassWord;
			System.out.println("Change password successfully.");
		} else {
		System.out.println("Wrong PassWord.");
		changePassWord();
		}
	}
		
 
	
	
	
	
	
}
