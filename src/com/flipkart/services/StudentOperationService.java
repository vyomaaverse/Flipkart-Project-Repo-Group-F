package com.flipkart.services;

import com.flipkart.bean.Student;

public class StudentOperationService extends Student {

	public boolean addCourse(int semester, String courseCode) {
		System.out.println("Registering student for semester " + semester + " of course " + courseCode);

		return true;
	}

	public boolean dropCourse(int semester, String courseCode) {
		System.out.println("Dropping student for course " + courseCode + " of semester " + semester);

		return true;
	}

	public void viewGradeCard(int semester) {
		System.out.println("Viewing GradeCard of student " + this.getStudentId() + " of semester " + semester);
	}

	public boolean updateDetails() {
		System.out.println("Updating Details of student");

		return true;
	}

	public boolean register(String studentName, String studentBranch, int batch) {
		System.out.println("Registering you as a student\n Name: " + studentName + "\n Branch: " + studentBranch
				+ "\n Batch: " + batch);

		return true;
	}
}
