package yx;

public class SalePersonImpl implements SalePerson {
    @Override
    public void selectGoods() {
        System.out.println("问客户：购买什么商品");
    }

    @Override
    public void pay() {
        System.out.println("请扫码支付");
    }
}
