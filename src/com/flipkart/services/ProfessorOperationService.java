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
	public List<Student> viewEnrolledStudents(String courseCode, int profID) throws ProfNotFoundException, StudentNotFoundException{
		List<Student> enrolledStudents = new ArrayList<Student>();

		try {
			enrolledStudents = professorDaoOperation.viewStudent(courseID,profID);
		}catch (Exception e){
			throw e;
		}

		return enrolledStudents;
	}

	@Override
	public void assignGrade( int studentID, String courseCode, String grade) {
		try{
			professorDaoOperation.assignGrade(studentID,courseID,grade);
		}catch (Exception e){
			throw e;
		}
	}
}
