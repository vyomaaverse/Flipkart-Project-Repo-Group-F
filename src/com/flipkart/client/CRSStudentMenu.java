package com.flipkart.client;

import com.flipkart.services.ProfessorOperationService;
import com.flipkart.services.StudentOperationService;

import java.util.Scanner;

public class CRSStudentMenu {
    static void showCRSStudentMenu(){

        StudentOperationService sos= new StudentOperationService();


        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==========================================================================\n");
        System.out.println("Student Menu");
        System.out.println(" 1. View Grade Card");
        System.out.println(" 2. Register");
        System.out.println(" 3. Change Password");
        System.out.println("\n==========================================================================\n");


        System.out.println("Enter Option : ");

        int optionChosen = scanner.nextInt();
        scanner.nextLine();

        switch (optionChosen) {
            case 1:
                sos.viewGradeCard(3);
                break;

            case 2:
                sos.register(2, "abc");
                break;

            case 3:
                sos.changePassword("new");
                break;
        }
}
}
