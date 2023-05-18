package com.flipkart.services;

import com.flipkart.bean.Professor;

public class ProfessorOperationService extends Professor{
    public void createProfessor(){
        System.out.println("create professor here");
    }

    public boolean deleteProfessor(int id){
        System.out.println("delete professor with " + id + "id");

        return true;
    }

    public void addGrades(){
        System.out.println("add grades for students");
    }

    public void viewEnrolledStudents(){
        System.out.println("Display enrolled students here");
    }

    public boolean updateDetails() {
        System.out.println("Impl of updateDetails of UserBusiness");

        return true;
    }

    public boolean updatePassword(String newPassword) {
        System.out.println("Impl of updatePassword of UserBusiness");

        return true;
    }
}
