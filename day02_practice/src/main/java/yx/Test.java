package yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.model.PoolManager;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        PoolManager manager = context.getBean(PoolManager.class);
        manager.checkAccess();
    }
}
