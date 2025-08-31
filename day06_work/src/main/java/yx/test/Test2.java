package yx.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import yx.service.GameAccountService;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        GameAccountService service = context.getBean(GameAccountService.class);

        // 测试场景
        String testAccount = "player003";

        // 1. 先充值500点券
        System.out.println("===== 充值测试 =====");
        service.updateCoupon(testAccount, 500);
        System.out.println("充值500点券成功！");

        // 2. 查询当前余额
        System.out.println("\n===== 查询余额 =====");
        service.selectList().stream()
                .filter(acc -> acc.getAccount().equals(testAccount))
                .forEach(acc -> System.out.println("当前余额：" + acc.getCoupon()));

        // 3. 消费300点券
        System.out.println("\n===== 消费测试 =====");
        boolean consumeResult = service.consumeCoupon(testAccount, 300, "购买游戏道具");

        if (consumeResult) {
            System.out.println("消费成功！");
        } else {
            System.out.println("消费失败！");
        }

        // 4. 再次查询余额
        System.out.println("\n===== 消费后余额 =====");
        service.selectList().stream()
                .filter(acc -> acc.getAccount().equals(testAccount))
                .forEach(acc -> System.out.println("消费后余额：" + acc.getCoupon()));

        // 5. 测试余额不足的情况
        System.out.println("\n===== 测试余额不足 =====");
        boolean failResult = service.consumeCoupon(testAccount, 1000, "大额消费");

        context.close();
    }
}