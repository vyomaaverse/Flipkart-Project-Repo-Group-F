package com.flipkart.client;

import java.util.Scanner;
import com.flipkart.services.AdminOperationService;
import com.flipkart.bean.*;

public class CRSAdminMenu {

    private static Scanner sc = new Scanner(System.in);

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
        AdminOperationService admin = new AdminOperationService();

        System.out.println("Welcome Admin!");
        display();
        Scanner myObj = new Scanner(System.in);
        int option = myObj.nextInt();

        while(option!=0) {
            if (option == 1){
                System.out.println(admin.generateReportCard());
            }
            else if(option == 2){

                System.out.println(admin.addProfessor(new Professor()));
            }
            else if(option == 3){
                System.out.println(admin.approveStudent(10001));
            }
            else if(option == 4){
                System.out.println(admin.addCourse(new Course()));

            }
            else if(option == 5){
                System.out.println(admin.removeCourse("Course Code"));
            }
            else{
                System.out.println("Invalid operation");
            }
            display();
            option = sc.nextInt();
        }

        System.out.println("Thank you admin. Logging out.");
    }
}
