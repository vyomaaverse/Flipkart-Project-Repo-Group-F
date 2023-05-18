/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Admin;

/**
 * @author sai.krishnajupally
 *
 */
public class AdminBusiness extends Admin {
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
