package com.flipkart.business;

public class CatalogBusiness {
    public void addCourse(CourseBusiness course){

        System.out.println("add course to catalog");
    }

    public boolean deleteCourse(String code){

        System.out.println("Delete course with code " + code);
        
        return true;
    }

    public void viewCourses(){
        System.out.println("Print entire catalog");
    }
}
