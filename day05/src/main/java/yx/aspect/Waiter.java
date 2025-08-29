package yx.aspect;

import org.springframework.stereotype.Component;

@Component  // 注册为容器中的 bean
public class Waiter {

    public void showMenu() {
        System.out.println("请点菜~");
    }

    public void pay() {
        System.out.println("请付款~");
    }
}