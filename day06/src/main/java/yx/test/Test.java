package yx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.entity.Student;
import yx.service.StudentService;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        StudentService service = context.getBean(StudentService.class);
        Student student = new Student().setName("s1").setAge(18).setGender("男");
        service.save(student);

    }
}
