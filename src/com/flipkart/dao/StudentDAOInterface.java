package com.flipkart.dao;

public interface StudentDAOInterface {
    public boolean addCourse(int semester, String courseCode) ;

    public boolean dropCourse(int semester, String courseCode) ;

    public void viewGradeCard(int semester) ;

    public boolean updateDetails(int id, String name, String branch, int batch, String email) ;

    public boolean register(String studentName, String studentBranch, int batch);
}
