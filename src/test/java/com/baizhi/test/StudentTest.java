package com.baizhi.test;

import com.baizhi.SpringbootMybatisApplication;
import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


public class StudentTest extends StudentExtends {
    @Autowired
    private StudentService studentService;

    @Test
    public void selectTest(){
        List<Student> list  = studentService.selectAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
