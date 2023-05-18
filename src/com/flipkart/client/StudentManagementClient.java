package com.flipkart.client;

import com.flipkart.bean.Student;

import java.util.Scanner;

public class StudentManagementClient {
    public static void main(String[] args){


        Scanner role = new Scanner(System.in);
        System.out.println("Enter roles: \n 1. Student\n 2. Professor \n");
        int role1 = role.nextInt();

        if(role1==1){
            Student student = new Student();
        }
        else if(role1 == 2){

        }
        else{
            System.out.println("Enter correct option");
        }



    }
}
