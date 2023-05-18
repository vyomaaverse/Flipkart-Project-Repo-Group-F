package com.flipkart.business;

import com.flipkart.bean.Professor;

public class ProfessorBusiness extends Professor {
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
}
