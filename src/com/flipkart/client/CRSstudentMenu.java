package com.flipkart.client;

import com.flipkart.services.StudentOperationService;

import java.util.Scanner;

public class CRSstudentMenu {

    String studentID;
    private static StudentOperationService studentService = new StudentOperationService();



    /**
     * Constructor
     * @param studentID-> ID of student whose menu is being displayed
     */
    public CRSMStudentMenu(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Display menu for student
     */
    public void displayMenu() {
        // Display the options available for the Student
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Student Menu");
            System.out.println("1. View Grade Card");
            System.out.println("2. View Grades");
            System.out.println("3. Register");
            System.out.println("4. Add Course");
            System.out.println("5. Drop Course");
            System.out.println("6. View registered courses");
            System.out.println("7. Make Payment");
            System.out.println("8. Show Notifications");
            System.out.println("9. Logout\n");
            System.out.println("\nEnter Option : ");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    viewCourseCatalogue();
                    break;

                case 2:
                    viewGrades();
                    break;

                case 3:
                    registerCourses();
                    break;

                case 4:
                    addCourse();
                    break;

                case 5:
                    dropCourse();
                    break;

                case 6:
                    viewRegisteredCourses();
                    break;

                case 7:
                    payFee();
                    break;

                case 8:
                    showNotifications();
                    break;

                case 9:
                    System.out.println("==================== Logging Out ====================");
                    return;

                default:
                    System.err.println("No such operation exists, valid choices 1, 2, 3, 4, 5 ,6 ,7 ,8");
            }
        }
    }


}
