package com.ccjx.springboot.service;

import com.ccjx.springboot.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
    Student queryStudentById(Integer id);
}
