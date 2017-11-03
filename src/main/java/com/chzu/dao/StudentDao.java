package com.chzu.dao;

import com.chzu.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author yanxing on 2015/1/28.
 *         student数据操作
 */
public interface StudentDao extends BaseDao<Student> {


    @Delete("delete from student where student_id=#{id}")
    @Override
    public void delete(Integer id);

    @Insert("insert into student(number,name,sex,birthday) values(#{number},#{name},#{sex},#{birthday})")
    @Override
    public void save(Student object);

    @Update("update student set number=#{number},name=#{name},sex=#{sex},birthday=#{birthday} where student_id=#{id}")
    @Override
    public void update(Student object);

    @Override
    public Student get(Integer id);

    public List<Student> findAll();

    public Student findByNum(String number);//按学号查询
}
