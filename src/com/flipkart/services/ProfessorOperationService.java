//package com.flipkart.services;
//
//import com.flipkart.bean.Professor;
//
//public class ProfessorOperationService extends Professor implements ProfessorServiceInterface{
//
//	public void addGrade(int studentId, String courseCode, String grade) ;{
//		System.out.println(
//				"Adding grade for student " + studentId + " of semester " + semester + " for course " + courseCode);
//	}
//
//	public List<Student> viewEnrolledStudents(int profID) {
//		System.out.println("Viewing enrolled students of course " + courseCode);
//	}
//
//
//
//}
package com.flipkart.service;

		import com.flipkart.bean.Course;
		import com.flipkart.constant.GradeConstant;
		import com.flipkart.dao.ProfessorDaoOperation;
		import com.flipkart.exception.GradeNotAssignedException;
		import com.flipkart.exception.ProfNotFoundException;
		import com.flipkart.exception.StudentNotFoundException;
		import com.flipkart.bean.Student;

		import java.util.ArrayList;
		import java.util.List;

public class ProfessorOperation implements ProfessorServiceInterface{

	private static volatile ProfessorOperation instance = null;
	ProfessorDaoImpl professorDaoOperation = ProfessorDaoImpl.getInstance();

	private ProfessorOperation(){}

	public static ProfessorOperation getInstance() {
		if (instance == null) {
			synchronized (ProfessorOperation.class) {
				instance = new ProfessorOperation();
			}
		}
		return instance;
	}


	@Override
	public List<Student> viewStudent(int courseID, String profID) throws ProfNotFoundException, StudentNotFoundException{
		List<Student> enrolledStudents = new ArrayList<Student>();

		try {
			enrolledStudents = professorDaoOperation.viewStudent(courseID,profID);
		}catch (Exception e){
			throw e;
		}

		return enrolledStudents;
	}

	@Override
	public void assignGrade( String studentID, int courseID, GradeConstant grade) throws GradeNotAssignedException, StudentNotFoundException {
		try{
			professorDaoOperation.assignGrade(studentID,courseID,grade);
		}catch (Exception e){
			throw e;
		}
	}
}
