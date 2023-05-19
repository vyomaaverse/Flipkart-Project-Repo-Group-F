package com.flipkart.services;

public interface StudentServiceInterface {
    public boolean addCourse(int semester, String courseCode) ;

    public boolean dropCourse(int semester, String courseCode) ;

    public void viewGradeCard(int semester) ;

    public boolean updateDetails() ;

    public boolean register(String studentName, String studentBranch, int batch);
}
