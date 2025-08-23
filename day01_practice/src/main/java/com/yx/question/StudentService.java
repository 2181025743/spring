package com.yx.question;

public class StudentService {
    private StudentDao studentDao;

    // Setter 方法 - Spring 用来注入依赖
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    // 模拟业务操作
    public void save(Student student) {
        studentDao.save(student);
    }
}