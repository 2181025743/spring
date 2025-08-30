package yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TravelService service = ctx.getBean("travelService", TravelService.class);

        System.out.println("\n====== 正常出行案例 ======");
        service.travel(new UserTravelInfo("张三", "beijing", "shanghai"));

        System.out.println("\n====== 出发地为高风险地区 ======");
        service.travel(new UserTravelInfo("李四", "haerbin", "guangzhou"));

        System.out.println("\n====== 目的地为高风险地区 ======");
        service.travel(new UserTravelInfo("王五", "hangzhou", "huhehaote"));
    }
}