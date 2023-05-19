package com.flipkart.services;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;

public class AdminOperationService extends Admin implements AdminServiceInterface {
	public boolean addProfessor(Professor newProfessor) {
		System.out.println("Impl addProfessor of AdminBusiness");

		return true;
	}

	public boolean assignCourse(int professorId, String courseCode) {
		System.out.println("Assigning course " + courseCode + " to professor " + professorId);

		return true;
	}

	public boolean approveStudent(int studentId) {
		System.out.println("Approving student " + studentId);

		return true;
	}

	public boolean updateDetails() {
		System.out.println("Updating Details of admin");

		return true;
	}

	public boolean addCourse(Course newCourse) {
		System.out.println("Adding course");

		return true;
	}

	public boolean removeCourse(String courseCode) {
		System.out.println("Removing course " + courseCode);

		return true;
	}

	public boolean generateReportCard() {
		System.out.println("Generating Report Card");

		return true;
	}
}
