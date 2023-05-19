package com.flipkart.client;

import java.util.Scanner;
import com.flipkart.services.AdminServiceService;
import com.flipkart.bean.*;

public class CRSAdminMenu {

    private static void display(){
        System.out.println("\n------------------------------");
        System.out.println("Admin Menu:");
        System.out.println(" 0. Logout");
        System.out.println(" 1. Generate Report Card");
        System.out.println(" 2. Add Professor");
        System.out.println(" 3. Approve student registration");
        System.out.println(" 4. Add Course");
        System.out.println(" 5. Remove Course");
        System.out.print("Your Choice: ");
    }


    public static void showCRSAdminMenu(){
        AdminServiceService admin = new AdminServiceService();

        System.out.println("Welcome Admin!");
        display();
        Scanner myObj = new Scanner(System.in);
        int option = myObj.nextInt();

        while(option!=0) {
            switch(option) {
                case 1:
                    System.out.println(admin.generateReportCard());
                    break;
                case 2:
                    System.out.println(admin.addProfessor(new Professor()));
                    break;
                case 3:
                    System.out.println(admin.approveStudent(10001));
                    break;
                case 4:
                    System.out.println(admin.addCourse(new Course()));
                    break;
                case 5:
                    System.out.println(admin.removeCourse("Course Code"));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            display();
            option = myObj.nextInt();
        }

        System.out.println("Thank you admin. Logging out.");
    }
}
