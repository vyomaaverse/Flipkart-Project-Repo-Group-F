package com.flipkart.client;

import com.flipkart.bean.User;
import com.flipkart.bean.Professor;
import com.flipkart.services.LoginOperationService;
//import com.flipkart.services.StudentOperationService;
import com.flipkart.services.StudentOperationService;

import java.util.Scanner;

public class CRSApplicationClient {
	private static Scanner sc = new Scanner(System.in);

	private static LoginOperationService loginService = new LoginOperationService();

	private static StudentOperationService studentService = new StudentOperationService();

	private static void displayMainMenu() {
		System.out.println(
				"\nSelect Operation: " + "\n 1: Login" + "\n 2: Register as a Student" + "\n 0: Close Application");
		System.out.println("------------------------------");
		System.out.print("Your Choice: ");
	}

	private static void handleLogin() {
		// Get login details about the person
		System.out.println("\nLogin as (Roles)\n A: Admin\n P: Professor \n S: Student");
		System.out.println("------------------------------");
		System.out.print("Your Choice: ");

		String buf = sc.nextLine();
		String role = sc.nextLine();

		System.out.print("\nEnter username: ");
		String username = sc.nextLine();

		System.out.print("Enter password: ");
		String password = sc.nextLine();

		User user = loginService.login(role, username, password);
		System.out.println("\nLogin status: " + (user != null ? "true" : "false"));

		switch (role) {
		case "P":
			CRSProfessorMenu.professorMenu((Professor) user);
		}
		return;
	}

	private static void handleStudentRegister() {
		String buf = sc.nextLine();

		System.out.print("\nEnter you name: ");
		String name = sc.nextLine();

		System.out.print("Enter your branch: ");
		String branch = sc.nextLine();

		System.out.print("Enter your batch: ");
		int batch = sc.nextInt();

		System.out.println("");

		boolean registrationStatus = studentService.register(name, branch, batch);
		System.out.println("Registration status: " + (registrationStatus ? "Pending for Approval" : "Failed"));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the registration portal!");

		displayMainMenu();

		int operation = sc.nextInt();
		while (operation != 0) {
			switch (operation) {
			case 1:
				handleLogin();
				break;

			case 2:
				// StudentOperationService
				handleStudentRegister();
				break;

			default:
				System.out.println("Invalid Operation.");
			}
			displayMainMenu();
			operation = sc.nextInt();
		}

		System.out.println("Thank You!");
	}
}
