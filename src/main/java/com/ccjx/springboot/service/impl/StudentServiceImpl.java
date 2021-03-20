package com.ccjx.springboot.service.impl;

import com.ccjx.springboot.mapper.StudentMapper;
import com.ccjx.springboot.model.Student;
import com.ccjx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper stdMapper;
    @Override
    public Student queryStudentById(Integer id) {
        Student std = stdMapper.selectByPrimaryKey(id);
        return std;
    }
}
