package com.flipkart.services;

import com.flipkart.bean.Admin;

public class AdminOperationService extends Admin {
    public boolean addProfessor() {
        System.out.println("Impl addProfessor of AdminBusiness");

        return true;
    }

    public boolean assignCourse(int profId, String courseCode) {
        System.out.println("Impl assignCourse on prof " + profId + " to course " + courseCode + " of AdminBusiness");

        return true;
    }

    public boolean approveStudent(int studentId) {
        System.out.println("Impl approveStudent on student " + studentId + " of AdminBusiness");

        return true;
    }
}
