package yx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.injection.Boy;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Boy boy = context.getBean(Boy.class);
        boy.findGf(); // 打印出 girl 的信息
    }
}
