/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.User;

/**
 * @author sai.krishnajupally
 *
 */
public class UserBusiness extends User {
	public boolean updateDetails() {
		System.out.println("Impl of updateDetails of UserBusiness");

		return true;
	}

	public boolean updatePassword(String newPassword) {
		System.out.println("Impl of updatePassword of UserBusiness");

		return true;
	}
}
