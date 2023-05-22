package com.flipkart.services;

import com.flipkart.bean.Student;

public class StudentOperationService extends Student implements StudentServiceInterface{

	public boolean addCourse(int semester, String courseCode) {
		System.out.println("Registering student for semester " + semester + " of course " + courseCode);

		boolean addStatus = StudentDAOImpl.getInstance().addCourse(semester, courseCode);

		return addStatus;
	}

	public boolean dropCourse(int semester, String courseCode) {
		System.out.println("Dropping student for course " + courseCode + " of semester " + semester);

		boolean dropStatus = StudentDAOImpl.getInstance().dropCourse(semester, courseCode);

		return dropStatus;
	}

	public boolean viewGradeCard(int semester) {
		System.out.println("Viewing GradeCard of student " + this.getStudentId() + " of semester " + semester);

		boolean viewGradeStatus = StudentDAOImpl.getInstance().viewGradeCard(semester);

		return viewGradeStatus;

	}

	public boolean updateDetails(int id, String name, String branch, int batch, String email) {
		boolean updateStatus = StudentDAOImpl.getInstance().updateDetails(int id, String name, String branch, int batch, String email);

		return updateStatus;
	}

	public boolean register(String studentName, String studentBranch, int batch) {
		System.out.println("Registering you as a student\n Name: " + studentName + "\n Branch: " + studentBranch
				+ "\n Batch: " + batch);

		boolean registerStatus = StudentDAOImpl.getInstance().register(studentName, studentBranch,batch);

		return registerStatus;
	}
}
