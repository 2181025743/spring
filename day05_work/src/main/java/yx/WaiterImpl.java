package yx;

public class WaiterImpl implements Waiter {
    @Override
    public void showMenu() {
        System.out.println("请看一下菜单");
    }

    @Override
    public void pay() {
        System.out.println("请扫码支付");
    }
}