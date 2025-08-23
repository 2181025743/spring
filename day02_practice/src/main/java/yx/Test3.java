package yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.model.GradeManager;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("grade.xml");
        GradeManager gm = context.getBean("gradeManager", GradeManager.class);

        gm.printTotal();
        gm.adjustFailGrades();
        gm.printAverage();

    }
}
