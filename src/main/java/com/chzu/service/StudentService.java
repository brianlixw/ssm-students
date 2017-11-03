package com.chzu.service;

import com.chzu.model.Student;

import java.util.List;

/**
 * @author yanxing on 2015/1/28.
 */
public interface StudentService {

   public List<Student> getAllStudent();

   public void deleteStudent(Integer id);

   public Student getStudent(Integer id);

   public void updateStudent(Student student);

   public void addStudent(Student student);

   public Student getStudent(String number);
}
