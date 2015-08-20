package com.zhi.dao.mybatis;

import com.zhi.dao.StudentMapper;
import com.zhi.entity.Student;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by root on 2015-8-19.
 */
public class StudentDaoImp  {

    public Student findStudent(Integer id) {
        SqlSession sqlSession = MyUtiles.getSession();
        StudentMapper studentDao = sqlSession.getMapper(StudentMapper.class);

        Student student = studentDao.findStudentById(id);
        return student;
    }
//    public Student findStudentById(Integer id){
//        SqlSession sqlSession = null;
//        sqlSession = MyUtiles.getSession();
//        Studen
//
//    }

    public static void main(String[] args) {
        Student student = new StudentDaoImp().findStudent(1);
        System.out.println(student);
    }
}
