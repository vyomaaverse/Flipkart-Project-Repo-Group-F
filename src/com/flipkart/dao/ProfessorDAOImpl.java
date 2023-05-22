package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.constant.GradeConstant;
import com.flipkart.constant.SQLQueriesConstant;
import com.flipkart.exception.GradeNotAssignedException;
import com.flipkart.exception.ProfNotFoundException;
import com.flipkart.exception.StudentNotFoundException;
import com.flipkart.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Dao class for professor operations
 */
public class ProfessorDaoImpl implements ProfessorDaoInterface{

    private static volatile ProfessorDaoImpl instance = null;

    /**
     * Constructor
     */
    private ProfessorDaoImpl(){}

    /**
     * Singleton pattern to get only one instance of the class
     * @return Instance of the class
     */
    public static ProfessorDaoImpl getInstance() {
        if (instance == null) {
            synchronized (ProfessorDaoOperation.class) {
                instance = new ProfessorDaoImpl();
            }
        }
        return instance;
    }


    /**
     * Return enrolled student list for given course.
     * @param courseID -> ID of course whose students are requested.
     * @return -> List of students enrolled in course.
     * @throws ProfNotFoundException
     * @throws StudentNotFoundException
     */
    @Override
    public List<Student> viewEnrolledStudents(String courseID, int profID) throws ProfNotFoundException, StudentNotFoundException{

        Connection connection = DBInfo.getConnection();

        List<Student> studentList = new ArrayList<Student>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueriesConstant.GET_ENROLLED_STUDENTS);

            preparedStatement.setString(1,courseID);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<String> sid = new ArrayList<String>();

            while (resultSet.next()){
                sid.add(resultSet.getString("sid"));
            }

            String curid = "";
            try {
                UserDaoOperation userDAOOperation = UserDaoOperation.getInstance();
                for(String id:sid){
                    curid = id;
                    Student student = (Student) userDAOOperation.getDetails(id);
                    studentList.add(student);
                }
            }catch (Exception e){
                throw new StudentNotFoundException(curid);
            }

        }catch (Exception e){
            throw new ProfNotFoundException(profID);
        }finally {
            try {
                connection.close();
            }catch (Exception e){
                logger.error(e.getMessage());
            }
        }
        return studentList;
    }

    /**
     * Method to assign grade to student.
     * @param studentID -> ID of student to whom grade will be assigned.
     * @param courseID -> ID of course in which grade is given.
     * @param grade -> Grade given to student.
     * @throws StudentNotFoundException
     * @throws GradeNotAssignedException
     */
    @Override
    public void addGrade(String studentID, int courseID, GradeConstant grade) throws StudentNotFoundException, GradeNotAssignedException{
        Connection connection = DBInfo.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueriesConstant.ADD_GRADE);

            preparedStatement.setInt(1,grade.hasValue());
            preparedStatement.setInt(2,courseID);
            preparedStatement.setString(3,studentID);

            int r = preparedStatement.executeUpdate();

            if(r!=1){
                throw new GradeNotAssignedException(studentID);
            }

        }catch (Exception e){
            throw new StudentNotFoundException(studentID);
        }finally {
            try {
                connection.close();
            }catch (Exception e){
                logger.error(e.getMessage());
            }
        }
    }
}
