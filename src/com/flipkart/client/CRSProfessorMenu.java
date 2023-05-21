//package com.flipkart.client;
//
//import com.flipkart.bean.Professor;
//import com.flipkart.services.ProfessorOperationService;
//
//import java.util.Scanner;
//
//public class CRSProfessorMenu {
//	private static Scanner sc = new Scanner(System.in);
//	private static ProfessorOperationService professorService = new ProfessorOperationService();
//
//	private static void displayMenu() {
//        System.out.println("\n------------------------------");
//        System.out.println("Professor Menu:");
//        System.out.println(" 0. Logout");
//        System.out.println(" 1. View enrolled students");
//        System.out.println(" 2. Add grades");
//        System.out.print("Your Choice: ");
//	}
//
//	public static void professorMenu(Professor professor){
//        System.out.println("Welcome Professor " + professor.getName() + "!");
//        displayMenu();
//        int operation = sc.nextInt();
//        while (operation != 0){
//            switch (operation){
//                case 1:
//                    professorService.viewEnrolledStudents("courseCode");
//                    break;
//                case 2:
//                    professorService.addGrade(1, "courseCode", 1);
//                    break;
//
//                default:
//                    System.out.println("Invalid operation");
//            }
//
//
//            displayMenu();
//            operation = sc.nextInt();
//        }
//
//        System.out.println("Thank you Professor" + professor.getName() + ". Logging out.");
////        professorService.delete
//    }
//}
