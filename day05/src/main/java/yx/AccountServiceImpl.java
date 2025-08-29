package yx;

public class AccountServiceImpl implements AccountService {
    @Override
    public void saveAccount() {
        System.out.println("【银行保存财务业务】");
    }

    @Override
    public void payAccount() {
        System.out.println("【银行完成支付业务】");
    }
}
