package com.zhi.dao.jdbc;

import com.zhi.entity.Student;

import java.sql.*;

/**
 * Created by root on 2015-8-19.
 */
public class StudentDao {
    public Student findStudentById(int id){
        Student student = null;
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "select * from students where student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                student = new Student();
                student.setStudentId(resultSet.getInt("student_id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setDob(resultSet.getDate("dob"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return student;
    }

    public void insert(Student student) {
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "insert into students(name,email,dob) values(?,?,?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,student.getName());
            pstmt.setString(2,student.getEmail());
            pstmt.setDate(3,new java.sql.Date(student.getDob().getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() throws SQLException {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/mybatis";
//            String username = "root";
//            String password = "root";
            Class.forName("oracle.jdbc.driver.OracleDriver");
//            String url = "jdbc:oracle:thin:@l198.222.233.206:1521:orcl";
            String url = "jdbc:oracle:thin:@198.222.233.206:1521:orcl";
            String username = "huang";
            String password = "huang";
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Student student = new Student("tom","123@123.com",new java.util.Date());
//       new StudentDao().insert(student);
        StudentDao dao = new StudentDao();
        Student student = dao.findStudentById(1);
        System.out.println(student);
    }
}
