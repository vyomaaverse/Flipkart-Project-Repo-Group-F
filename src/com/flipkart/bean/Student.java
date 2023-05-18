package com.flipkart.bean;

import java.util.List;

public class Student extends User{
    private int studentId;
    private String branch;
    private int batch;

    private List<SemesterRegistration> semesterRegistrations;

    private List<GradeCard> gradeCardList;



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }





}
