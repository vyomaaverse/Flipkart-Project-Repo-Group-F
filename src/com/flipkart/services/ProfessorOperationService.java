package com.flipkart.services;

public class ProfessorOperationService {

    public void addGrades(){

        System.out.println("add grades for students");
    }

    public void viewEnrolledStudents(){

        System.out.println("Enrolled studnets are viewed");
    }

    public void createProfessor(){
        System.out.println("create professor here");
    }

    public boolean deleteProfessor(int id){
        System.out.println("delete professor with " + id + "id");

        return true;
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
