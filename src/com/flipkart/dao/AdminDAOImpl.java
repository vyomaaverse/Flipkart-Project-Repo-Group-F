package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.RegisteredCourse;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
//import com.flipkart.client.CRSApplication;
import com.flipkart.constant.GenderConstant;
import com.flipkart.constant.GradeConstant;
import com.flipkart.constant.RoleConstant;
import com.flipkart.constant.SQLQueriesConstant;
//import com.flipkart.utils.DBUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class AdminDAOImpl{

    private static volatile AdminDAOImpl instance = null;
    private static PreparedStatement statement = null;
    public static void addCourse(Course course)  {
        statement = null;
        Connection conn = DBInfo.getConn();
        try {
            String sql = SQLQueriesConstant.ADD_COURSE_QUERY;
            statement = conn.prepareStatement(sql);
            statement.setString(1, course.getCourseCode());
            statement.setString(2, course.getName());
            statement.setBoolean(3, true);
            statement.setInt(4, 1234);
            int row = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

//    public void removeCourse(int courseID) {
//        statement = null;
//        Connection conn = DBInfo.getConn();
//        try{
//            String sql = SQLQueriesConstant.DELETE_COURSE_QUERY;
//            statement = conn.prepareStatement(sql);
//            statement.setInt(1, courseID);
//            int row = statement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                conn.close();
//            }
//            catch(SQLException ex){
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public void addUser(User user) {
//        statement = null;
//        Connection conn = DBInfo.getConn();
//        try {
//
//            String sql = SQLQueriesConstant.ADD_USER_QUERY;
//            statement = conn.prepareStatement(sql);
//
//            statement.setString(1, user.getId());
//            statement.setString(2, user.getPassword());
//            statement.setString(3, user.getName());
//            statement.setInt(4, GenderConstant.genderToInt(user.getGender()));
//            statement.setInt(5, RoleConstant.roleToInt(user.getRole()));
//            statement.setString(6, user.getAddress());
//            statement.setString(7, user.getUsername());
//            statement.setDate(8, new Date(user.getDoB().getTime()));
//            int row = statement.executeUpdate();
//
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                conn.close();
//            }
//            catch(SQLException ex){
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public void addProf(Professor professor) {
//        try {
//
//            this.addUser(professor);
//
//        }catch (Exception e) {
//
//            e.printStackTrace();
//        }
//
//        statement = null;
//        Connection conn = DBInfo.getConn();
//        try {
//
//            String sql = SQLQueriesConstant.ADD_PROFESSOR_QUERY;
//            statement = conn.prepareStatement(sql);
//
//            statement.setString(1, professor.getId());
//            statement.setString(2, professor.getDepartment());
//            statement.setString(3, professor.getQualification());
//            statement.setDate(4, new Date(professor.getDateOfJoining().getTime()));
//            int row = statement.executeUpdate();
//
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                conn.close();
//            }
//            catch(SQLException ex){
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public void approveStudent(String studentId) {
//        statement = null;
//        Connection conn = DBInfo.getConn();
//
//        try {
//            String sql = SQLQueriesConstant.APPROVE_STUDENT_QUERY;
//            statement = conn.prepareStatement(sql);
//
//            statement.setString(1,studentId);
//            int row = statement.executeUpdate();
//
//        }catch(SQLException ex) {
//            ex.printStackTrace();
//        }
//
//    }
//
//    public void generateReportCard(String studentID) {
//        statement = null;
//        Connection conn = DBInfo.getConn();
//        try {
//            String sql = SQLQueriesConstant.GET_STUDENT_GRADES;
//            statement = conn.prepareStatement(sql);
//            statement.setString(1,studentID);
//
//            ResultSet resultSet = statement.executeQuery();
//
//            HashMap<Integer,Integer> reportCard = new HashMap<Integer, Integer>();
//
//            while (resultSet.next()){
//                reportCard.put(resultSet.getInt("cid"),resultSet.getInt("grade"));
//            }
//
//            Iterator<Map.Entry<Integer,Integer>> it = reportCard.entrySet().iterator();
//
//            float cpi = 0;
//            int courses = 0;
//
////            logger.info("CourseID\t\tGrade");
//
//            while (it.hasNext()){
//                Map.Entry<Integer,Integer> entry = it.next();
//                courses+=1;cpi+=entry.getValue();
////                logger.info(entry.getKey()+"\t\t\t"+entry.getValue());
//            }
//
//            cpi = cpi/(float) courses;
//
////            logger.info("CPI :" + cpi);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                conn.close();
//            }
//            catch(SQLException ex){
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public void assignCourse(String profID, int courseID) {
//        statement = null;
//        Connection conn = DBInfo.getConn();
//        try {
//
//            String sql = SQLQueriesConstant.ASSIGN_COURSE_QUERY;
//            statement = conn.prepareStatement(sql);
//
//            statement.setString(1, profID);
//            statement.setInt(2, courseID);
//            int row = statement.executeUpdate();
//
//        }catch(SQLException se) {
//
//            se.printStackTrace();
//        }
//        finally {
//            try {
//                conn.close();
//            }
//            catch(SQLException ex){
//                ex.printStackTrace();
//            }
//        }
    }





