package yx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.injection.TeacherService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // System.out.println(context.getBean("teacherService"));
        TeacherService service =
                (TeacherService) context.getBean("teacherService");
        System.out.println(service);
    }
}
