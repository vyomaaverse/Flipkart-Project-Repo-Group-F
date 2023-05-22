package com.flipkart.services;

import com.flipkart.bean.Professor;

public class ProfessorOperationService extends Professor implements ProfessorServiceInterface {

	public void addGrade(int studentId, String courseCode, int semester, String grade) {
		System.out.println(
				"Adding grade for student " + studentId + " of semester " + semester + " for course " + courseCode);
	}

	public void viewEnrolledStudents(String courseCode) {
		System.out.println("Viewing enrolled students of course " + courseCode);
	}

	public boolean updateDetails() {
		System.out.println("Updating Details of professor");

		return true;
	}

}