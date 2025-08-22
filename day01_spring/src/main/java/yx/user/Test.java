package yx.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("Spring容器加载完成");

        // UserDao dao = (UserDao) context.getBean("userDao");
        // System.out.println("获取到的对象: " + dao);

        // dao.save();

        Boy dao1 = (Boy) context.getBean("boy");
        System.out.println(dao1);
    }
}