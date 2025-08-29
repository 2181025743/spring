package yx.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        // 1. 初始化 Spring 容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // 2. 获取目标对象（实际是代理对象）
        Waiter waiter = context.getBean(Waiter.class);

        // 3. 调用方法（切面增强将生效）
        waiter.showMenu();
        System.out.println("------------------");
        waiter.pay();
    }
}