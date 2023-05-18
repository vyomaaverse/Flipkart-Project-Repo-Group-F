package com.flipkart.client;

import com.flipkart.bean.Professor;
import com.flipkart.bean.User;
import com.flipkart.services.LoginOperationService;
import com.flipkart.services.StudentOperationService;

import java.util.Scanner;

public class CRSApplicationClient {
    private static Scanner sc = new Scanner(System.in);
    private static LoginOperationService loginService = new LoginOperationService();

    private static void displayMainMenu(){
        System.out.println("Select Operation: ");
        System.out.println(" 0: Close Application");
        System.out.println(" 1: Login");
        System.out.println(" 2: Register as a Student");
    }
    private static void handleLogin(){
//        Get login details about the person
        System.out.println("Roles:\n A: Admin\n P: Professor \n S: Student\nEnter Role Code:");
        String role = sc.nextLine();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        User user = loginService.login(role, username, password);
        System.out.println("login status: " + (user!=null?"true":"false"));

        switch (role){
            case "S":
                System.out.println("call student client here");
                break;
            case "P":
                CRSProfessorMenu.professorMenu((Professor) user);
                break;
            case "A":
                System.out.println("call admin client here");
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the registration portal.");

        displayMainMenu();
        int operation = sc.nextInt();
        while(operation != 0){
            switch (operation){
                case 1:
                    handleLogin();
                    break;

                case 2:
//                    StudentOperationService.
                    System.out.println("Create a new student here");
                    break;


                default:
                    System.out.println("Invalid Operation.");
            }
            displayMainMenu();
            operation = sc.nextInt();
        }

        System.out.println("Thank you for using our application.");
    }
}
