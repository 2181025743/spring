package com.yx.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取 Service 和 Student 对象
        StudentService studentService = (StudentService) context.getBean("studentService");
        Student student = (Student) context.getBean("student1");

        // 调用保存方法
        studentService.save(student);
    }
}