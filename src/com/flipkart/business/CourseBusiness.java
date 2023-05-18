package com.flipkart.business;

import com.flipkart.bean.Course;

public class CourseBusiness extends Course{
    public void createCourse(){
        System.out.println("course creation logic");
    }

    public boolean deleteCourse(String code) {
        System.out.println("implement delete course");
        return true;
    }
}