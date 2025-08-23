package com.yx.question;

public class StudentDaoMybatisImpl implements StudentDao {
    @Override
    public void save(Student student) {
        System.out.println("[Mybatis] 保存学生: " + student);
    }
}