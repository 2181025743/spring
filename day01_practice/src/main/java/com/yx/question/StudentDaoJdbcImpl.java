package com.yx.question;

public class StudentDaoJdbcImpl implements StudentDao {
    @Override
    public void save(Student student) {
        System.out.println("[JDBC] 保存学生: " + student);
    }
}