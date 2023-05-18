/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.RegisteredCourse;

/**
 * @author sai.krishnajupally
 *
 */
public class RegisteredCourseBusiness extends RegisteredCourse {
	public void viewGrade() {
		System.out.println("Impl of viewGrade of RegisteredCourseBusiness");
	}

	public boolean dropCourse() {
		System.out.println("Impl of dropCourse on " + this.getCourseCode() + " of RegisteredCourseBusiness");

		return true;
	}
}
