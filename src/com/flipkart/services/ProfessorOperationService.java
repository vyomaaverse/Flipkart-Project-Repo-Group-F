package com.flipkart.services;

import com.flipkart.bean.Professor;

public class ProfessorOperationService extends Professor{


    public void addGrade(){
        System.out.println("add grades for students");
    }

    public void viewEnrolledStudents(){
        System.out.println("Display enrolled students here");
    }

    public boolean updateDetails() {
        System.out.println("Impl of updateDetails of UserBusiness");

        return true;
    }


}
