package yx.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.entity.GameAccount;
import yx.service.GameAccountService;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        GameAccountService service = context.getBean(GameAccountService.class);
        GameAccount newAccount = new GameAccount()
                .setAccount("player003")
                .setPassword("pwd123")
                .setCoupon(0);
        service.register(newAccount);
        System.out.println("注册成功！");
        context.close();
    }
}
