package com.email;


import java.util.Scanner;

public class Email {

	public static void main(String[] args) {

		Boolean flag = false;
		String user[] = new String[10];

		user[0] = "ram25@gmail.com";
		user[1] = "amrutha13@gmail.com";
		user[2] = "nivin@gmail.com";
		user[3] = "sejal@gmail.com";
		user[4] = "akanksha@gmail.com";
		user[5] = "priya@gmail.com";
		user[6] = "farhana@gmail.com";
		user[7] = "sriya@gmail.com";
		user[8] = "mary@gmail.com";
		user[9] = "john@gmail.com";

		try (Scanner sc = new Scanner(System.in)) {
			int option;

			while (true) {
				flag = false;
				System.out.println("Enter your Email Id: ");
				String userEmail = sc.next();

				for (String email : user) {
					if (userEmail.matches(email)) {
						System.out.println("Welcome back " + userEmail);
						flag = true;
						break;
					}
				}


				if (flag == false) {
					System.out.println("Invalid User!");
					System.out.println("...Please enter a valid email address...");
				}
				System.out.println("Enter 1 to continue" +"...");
				System.out.println("Enter 2 to discontinue" +"...");
						
				option = sc.nextInt();


				if (option == 2) {
					System.out.println("Thank you for the response...");
					break;
				}
			}
		}

	}

}