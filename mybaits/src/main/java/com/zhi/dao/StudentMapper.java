package com.zhi.dao;

import com.zhi.entity.Student;

/**
 * Created by root on 2015-8-19.
 */
public interface StudentMapper {
    Student findStudentById(Integer id);
}
