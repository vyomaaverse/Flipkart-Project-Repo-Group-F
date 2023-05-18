/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.SemesterRegistration;

/**
 * @author sai.krishnajupally
 *
 */
public class SemesterRegistrationBusiness extends SemesterRegistration {
	public boolean registerCourses() {
		System.out.println("Impl of registerCourses of SemesterRegistration");

		return true;
	}

	public boolean addCourse(String courseCode) {
		System.out.println("Impl of addCourse on course " + courseCode + "of SemesterRegistration");

		return true;
	}

	public boolean dropCourse(String courseCode) {
		System.out.println("Impl of dropCourse on course " + courseCode + " of SemesterRegistration");

		return true;
	}

	public boolean payFees() {
		System.out.println("Impl of payFees for semester " + this.getSemester() + " of SemesterRegistration");

		return true;
	}

	public void viewRegisteredCourses() {
		System.out.println("Impl of viewRegisteredCourses of SemesterRegistration");
	}
}
