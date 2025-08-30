package yx;

public class Test {
    public static void main(String[] args) {
        SalePerson salePerson = new SalePersonImpl();
        SalePerson proxySalePerson = (SalePerson) ProxyUtil.getProxy(salePerson);

        System.out.println("========== 售货员 ==========");
        proxySalePerson.selectGoods();
        proxySalePerson.pay();

        Waiter waiter = new WaiterImpl();
        Waiter proxyWaiter = (Waiter) ProxyUtil.getProxy(waiter);
        System.out.println();

        System.out.println("========== 服务员 ==========");
        proxyWaiter.showMenu();
        proxyWaiter.pay();
    }
}
