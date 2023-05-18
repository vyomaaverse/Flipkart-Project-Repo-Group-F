package com.flipkart.client;

import java.util.Scanner;

public class StudentManagementClient {
    public static void main(String[] args){
        System.out.println("Enter roles : ");
        System.out.println("1. Student");
        System.out.println("2. Professor");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();
    }
}
