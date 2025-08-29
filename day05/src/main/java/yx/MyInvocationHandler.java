package yx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target; // 目标对象（被代理）
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        if (name.equalsIgnoreCase("payAccount")) {
            // 1. 前置增强：安全日志 & 性能监控开始
            System.out.println("当前时间：" + LocalDate.now());
            long start = System.currentTimeMillis();
            System.out.println("开启监控系统");

            Thread.sleep((long) (Math.random() * 1000));
            // 2. 执行业务逻辑（通过反射）
            Object result = method.invoke(target, args);

            // 3. 后置增强：监控结束
            System.out.println("结束监控系统，耗时：" + (System.currentTimeMillis() - start));

            return result;
        } else {
            // 其他方法：只做业务调用，不增强
            return method.invoke(target, args);
        }
    }
}
