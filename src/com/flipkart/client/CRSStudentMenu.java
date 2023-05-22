package com.flipkart.client;

import com.flipkart.services.StudentOperationService;

import java.util.Scanner;

public class CRSStudentMenu {

	private static void displayMenu() {
		System.out.println("\n------------------------------");
		System.out.println("Student Menu");
		System.out.println(" 0. Logout");
		System.out.println(" 1. View Grade Card");
		System.out.println(" 2. Register");
		System.out.println(" 3. Change Password");
		System.out.println(" 4. Update Details");
		System.out.print("Your Choice: ");
	}

	public static void showCRSStudentMenu() {

		StudentOperationService sos = new StudentOperationService();

		Scanner scanner = new Scanner(System.in);

		displayMenu();

		int optionChosen = scanner.nextInt();
		scanner.nextLine();

		while (optionChosen != 0) {
			switch (optionChosen) {
			case 1:
				sos.viewGradeCard(3);
				break;

			case 2:
				sos.register("name", "branch", 2023);
				break;

			case 3:
			sos.changePassword("new");
				break;


			default:
				System.out.println("Invalid operation");
			}

			displayMenu();
			optionChosen = scanner.nextInt();
			scanner.nextLine();
		}

		System.out.println("Thank you student. Logging out");

//		scanner.close();
	}
}