package com.flipkart.client;

import java.util.Scanner;
import com.flipkart.services.AdminOperationService;
import com.flipkart.bean.*;

public class CRSAdminMenu {

    private static void display(){
        System.out.println("0. Close Admin");
        System.out.println("1. Generate Report Card");
        System.out.println("2. Add Professor");
        System.out.println("3. Approve student registration");
        System.out.println("4. Add Course");
        System.out.println("5. Remove Course");
    }


    public static void showCRSAdminMenu(){
        AdminOperationService admin = new AdminOperationService();
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
            display();
        }
    }
}
