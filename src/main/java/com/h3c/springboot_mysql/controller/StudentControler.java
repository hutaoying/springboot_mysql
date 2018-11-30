package com.h3c.springboot_mysql.controller;

import com.h3c.springboot_mysql.mapper.StudentMapper;
import com.h3c.springboot_mysql.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentControler {
    @Autowired
    StudentMapper studentMapper;
    @PostMapping("/")
    public void add(Student stu){
        studentMapper.insertStu(stu);

    }
}
