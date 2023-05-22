package com.flipkart.services;

import java.util.List;

import com.flipkart.bean.Student;

public interface ProfessorServiceInterface {
	public void addGrade(int studentId, String courseCode, int semester, String grade);

	public List<Student> viewEnrolledStudents(String courseCode);
}
