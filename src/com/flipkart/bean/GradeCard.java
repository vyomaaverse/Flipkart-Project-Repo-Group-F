package com.flipkart.bean;

import java.util.List;

public class GradeCard {
    private int studentID;
    private int semester;
    private float cpi;

    List<RegisteredCourse> registeredCourses;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getCpi() {
        return cpi;
    }

    public void setCpi(float cpi) {
        this.cpi = cpi;
    }

    public List<RegisteredCourse> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<RegisteredCourse> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
