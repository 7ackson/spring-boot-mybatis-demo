package com.baizhi.controller;

import com.baizhi.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("student/selectAll")
    public String selectAll(Map map){
        map.put("list",studentService.selectAll());
        return "index";
    }

}
