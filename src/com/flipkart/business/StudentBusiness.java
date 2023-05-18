/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Student;

/**
 * @author sai.krishnajupally
 *
 */
public class StudentBusiness extends Student {
	public boolean changePassword(String newPassword) {
		System.out.println("Impl Change Password of Student");

		return true;
	}

	public boolean register(int semester, String courseCode) {
		System.out.println("Impl register of Student for semester " + semester + " of course " + courseCode);

		return true;
	}

	public void viewGradeCard(int semester) {
		System.out.println("View GradeCard of Student " + this.getStudentId() + " of semester " + semester);
	}
}
