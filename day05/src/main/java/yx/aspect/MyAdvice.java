package yx.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect               // 声明这是一个切面类
@Component            // 注册为 Spring 管理的 Bean
public class MyAdvice {

    // 前置通知：在 showMenu() 执行之前
    @Before("execution(* yx.aspect.Waiter.showMenu(..))")
    public void doBefore() {
        System.out.println("欢迎光临本餐厅！");
        System.out.println("很高兴为您服务~");
        System.out.println("——————");
    }

    // 后置通知：在 pay() 执行之后
    @After("execution(* yx.aspect.Waiter.pay(..))")
    public void doAfter() {
        System.out.println("请慢走，欢迎下次光临！");
    }
}