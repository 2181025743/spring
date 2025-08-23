package com.yx.question;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Object teacher1 = context.getBean("teacher1");
        System.out.println(teacher1);
    }
}
