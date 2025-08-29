package yx;

import java.lang.reflect.InvocationHandler;

public class Test {
    public static void main(String[] args) {
        // 被代理对象
        UserService target = new UserServiceImpl();
        AccountServiceImpl accountService = new AccountServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(accountService);
        AccountService proxy1 = (AccountService) ProxyUtil.getProxy(accountService, myInvocationHandler);
        proxy1.payAccount();
        System.out.println("==========================");
        
        proxy1.saveAccount();
        // 代理处理器（传入目标对象）
        InvocationHandler handler = new MyInvocationHandler(target);

        // 创建代理对象
        UserService proxy = (UserService) ProxyUtil.getProxy(target, handler);

        // 调用方法：注意这是 proxy，不是 target
        proxy.save();
        System.out.println("==========================");
        proxy.delete();
    }
}