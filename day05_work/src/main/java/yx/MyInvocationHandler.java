package yx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if ("selectGoods".equals(methodName) || "showMenu".equals(methodName)) {
            System.out.println("您好，欢迎光临！");
        }
        Object result = method.invoke(target, args);
        if ("pay".equals(methodName) && target instanceof SalePerson) {
            System.out.println("慢走，欢迎再来！");
        } else if ("pay".equals(methodName) && target instanceof Waiter) {
            System.out.println("请带好您的随身物品，慢走，欢迎再来！");
        }

        return result;

    }
}