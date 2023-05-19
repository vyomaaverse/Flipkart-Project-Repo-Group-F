package com.flipkart.services;

public interface ProfessorServiceInterface {
    public void addGrade(int studentId, String courseCode, int semester) ;
    public void viewEnrolledStudents(String courseCode);

    public boolean updateDetails() ;
}
