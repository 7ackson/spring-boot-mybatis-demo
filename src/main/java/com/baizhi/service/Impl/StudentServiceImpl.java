package com.baizhi.service.Impl;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentSerivce")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}
