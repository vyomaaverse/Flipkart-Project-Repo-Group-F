//package com.flipkart.dao;
//
//import com.flipkart.bean.Course;
//import com.flipkart.bean.Professor;
//import com.flipkart.bean.RegisteredCourse;
//import com.flipkart.bean.Student;
//import com.flipkart.bean.User;
//import com.flipkart.client.CRSApplication;
//import com.flipkart.constant.GenderConstant;
//import com.flipkart.constant.GradeConstant;
//import com.flipkart.constant.RoleConstant;
//import com.flipkart.constant.SQLQueriesConstant;
////import com.flipkart.utils.DBUtil;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.*;
//
//public class AdminDAOImpl{
//
//    private static volatile AdminDAOImpl instance = null;
//    private PreparedStatement statement = null;
//    public void addCourse(Course course) throws CourseFoundException {
//        statement = null;
//        Connection conn = DBInfo.getConn();
//        try {
//            String sql = SQLQueriesConstant.ADD_COURSE_QUERY;
//            statement = conn.prepareStatement(sql);
//            statement.setInt(1, course.getCourseId());
//            statement.setString(2, course.getCourseName());
//            statement.setString(3, course.getInstructorId());
//            statement.setBoolean(4, true);
//            statement.setInt(5, 0);
//            int row = statement.executeUpdate();
//
//            logger.info(row + " course added");
//            if (row == 0) {
//                logger.info("Course with courseCode: " + course.getCourseId() + "not added to catalog.");
//                throw new CourseFoundException(course.getCourseId());
//            }
//
//            logger.info("Course with courseCode : " + course.getCourseId() + " is added to catalog.");
//
//        } catch (SQLException e) {
//            logger.error(e.getMessage());
//            throw new CourseFoundException(course.getCourseId());
//        }
//        finally {
//            try {
//                conn.close();
//            }
//            catch(SQLException ex){
//                logger.info(ex.getMessage());
//                try {
//                    throw new DatabaseException();
//                } catch (DatabaseException e) {
//                    // TODO Auto-generated catch block
//                    logger.error(e.getMessage());
//                }
//            }
//        }
//    }
//
//}
