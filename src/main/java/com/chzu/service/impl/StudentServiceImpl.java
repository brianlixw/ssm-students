package com.chzu.service.impl;

import com.chzu.dao.StudentDao;
import com.chzu.model.Student;
import com.chzu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * @author yanxing on 2015/1/28.
 */

//@Service
@Named
public class StudentServiceImpl implements StudentService {


    //@Autowired
    //@Resource(name = "studentDao")
    @Inject
    private StudentDao studentDao;

    /**
     * 获取所有的学生
     */
    @Override
    public List<Student> getAllStudent() {
        return studentDao.findAll();
    }

    /**
     * 删除学生
     */
    @Override
    public void deleteStudent(Integer id) {
        studentDao.delete(id);
    }

    @Override
    public Student getStudent(Integer id) {
        return studentDao.get(id);
    }

    /**
     * 更新学生
     */
    @Override
    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    /**
     * 添加学生
     */
    @Override
    public void addStudent(Student student) {
        studentDao.save(student);
    }

    /**
     * 按学号查询
     */
    @Override
    public Student getStudent(String number) {
        return studentDao.findByNum(number);
    }


}
