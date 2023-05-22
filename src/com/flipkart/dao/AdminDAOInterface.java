package com.flipkart.dao;


import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public interface AdminDAOInterface {

    public void addCourse(Course course);
    public void addProf(Professor professor);
    public void addUser(User user);
    public void removeCourse(int courseID);
    public void approveStudent(String studentId);
    public void generateReportCard(String studentID);



}


