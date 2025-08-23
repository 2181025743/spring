package yx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.injection.Student;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        Student boy = context.getBean(Student.class);
        System.out.println(boy);
    }
}
