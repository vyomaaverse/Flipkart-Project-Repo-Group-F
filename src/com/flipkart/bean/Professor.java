package com.flipkart.bean;

import java.util.Date;
import java.util.List;

public class Professor extends User{
    private String department;
    private String designation;
    private Date doj;

    List<Course> courseList;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }


}
