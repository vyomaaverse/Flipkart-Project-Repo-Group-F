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
		System.out.println("\n------------------------------");
		System.out.println("Welcome to CRS Application");
		System.out.println(" 0. Exit");
		System.out.println(" 1. Login");
		System.out.println(" 2. Registration of the student");
		System.out.println(" 3. Update Password");
		System.out.print("Your Choice: ");
	}

	private static void handleLogin() {
		// Get login details about the person
		System.out.println("\n------------------------------");
		System.out.println("Login as (Roles)\n a: Admin\n p: Professor \n s: Student");
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
			case "p":
//				Professor p = (Professor) user;
//				System.out.println(user.getName());
				CRSProfessorMenu.professorMenu((Professor) user );
				break;
			case "a":
//				System.out.println("Admin menu");
				CRSAdminMenu.showCRSAdminMenu();
				break;
			case "s":
//				System.out.println("Student menu");
				CRSStudentMenu.showCRSStudentMenu();
				break;
			default:
				System.out.println("Invalid role");
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

		loginService.registerStudent(name, branch, batch);
//		boolean registrationStatus = studentService.register(name, branch, batch);
//		System.out.println("Registration status: " + (registrationStatus ? "Pending for Approval" : "Failed"));
	}

	private static void handleUpdatePassword(){
		String buf = sc.nextLine();

		System.out.print("Enter your email: ");
		String email = sc.nextLine();

		System.out.print("Enter old password: ");
		String oldPass = sc.nextLine();

		System.out.print("Enter new password: ");
		String newPass = sc.nextLine();

		loginService.updatePassword(email, oldPass, newPass);
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
					handleStudentRegister();
					break;

				case 3:
					handleUpdatePassword();
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


/*

drop role in
hello -> welcome "..."

 */