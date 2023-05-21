package com.flipkart.dao;

public interface ProfessorDAOInterface {

    public void addGrade(int studentID, String courseID, String grade);

    public List<Student> viewEnrolledStudents(String courseID, int profID);

}
