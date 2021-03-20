package com.ccjx.springboot.web;

import com.ccjx.springboot.model.Student;
import com.ccjx.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public Object GetStudentInfo(Integer id)
    {
        Student stu = studentService.queryStudentById(id);
        return stu;
    }
}
