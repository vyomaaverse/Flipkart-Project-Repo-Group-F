package com.flipkart.bean;

import java.util.Date;
import java.util.List;

public class SemesterRegistration {

    private int studentId;
    private int semester;
    private Date dateOfRegistration;


    private List<RegisteredCourse> registeredCourseList;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
