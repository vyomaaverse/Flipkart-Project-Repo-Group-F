package com.flipkart.services;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;

public interface AdminOperationInterface {
    public boolean addProfessor(Professor newProfessor);

    public boolean assignCourse(int professorId, String courseCode);

    public boolean approveStudent(int studentId);

    public boolean updateDetails();

    public boolean addCourse(Course newCourse);

    public boolean removeCourse(String courseCode);

    public boolean generateReportCard();
}
