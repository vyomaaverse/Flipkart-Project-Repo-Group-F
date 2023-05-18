package com.flipkart.client;

import com.flipkart.services.ProfessorOperationService;

import java.util.Scanner;

public class CRSProfessorMenu {
    static void showCRSProfessorMenu() {

        ProfessorOperationService pos = new ProfessorOperationService();


        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==========================================================================\n");
        System.out.println("Professor Menu");
        System.out.println(" 1. View Enrolled Students");
        System.out.println(" 2. Add Grades");
        System.out.println(" 3. Update Details");
        System.out.println("\n==========================================================================\n");


        System.out.println("Enter Option : ");

        int optionChosen = scanner.nextInt();
        scanner.nextLine();

        switch (optionChosen) {
            case 1:
                pos.viewEnrolledStudents();
                break;

            case 2:
                pos.addGrades();
                break;

            case 3:
                pos.updateDetails();
                break;
        }
    }
}
