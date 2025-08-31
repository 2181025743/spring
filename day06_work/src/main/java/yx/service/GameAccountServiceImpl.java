package yx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import yx.entity.CouponRecord;
import yx.entity.GameAccount;
import yx.mapper.CouponRecordMapper;
import yx.mapper.GameAccountMapper;

import java.util.Date;
import java.util.List;

@Service
public class GameAccountServiceImpl implements GameAccountService {
    @Autowired
    private GameAccountMapper gameAccountMapper;

    @Autowired
    private CouponRecordMapper couponRecordMapper;

    @Transactional
    @Override
    public void register(GameAccount gameAccount) {
        gameAccountMapper.insert(gameAccount);
    }

    @Override
    public List<GameAccount> selectList() {
        return gameAccountMapper.selectList();
    }

    @Override
    public GameAccount login(String account, String password) {
        return gameAccountMapper.login(account, password);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, timeout = 5, rollbackFor = Exception.class)
    public int updateCoupon(String account, int num) {
        // 充值操作：增加点券
        int result = gameAccountMapper.updateCoupon(account, num);

        if (result > 0) {
            // 记录充值记录
            CouponRecord record = new CouponRecord()
                    .setAccount(account)
                    .setUpdateTime(new Date())
                    .setCategory("充值")
                    .setNum(num);
            couponRecordMapper.insert(record);
        }

        return result;
    }

    /**
     * 消费点券（核心方法）
     *
     * @param account 用户账号
     * @param amount  消费金额
     * @param reason  消费原因/类型
     * @return 是否消费成功
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean consumeCoupon(String account, int amount, String reason) {
        // 1. 先查询用户当前点券余额
        GameAccount gameAccount = gameAccountMapper.selectByAccount(account);

        if (gameAccount == null) {
            System.out.println("用户不存在！");
            return false;
        }

        if (gameAccount.getCoupon() < amount) {
            System.out.println("点券余额不足！当前余额：" + gameAccount.getCoupon());
            return false;
        }

        // 2. 扣减点券
        int updateResult = gameAccountMapper.deductCoupon(account, amount);

        if (updateResult > 0) {
            // 3. 记录消费记录
            CouponRecord record = new CouponRecord()
                    .setAccount(account)
                    .setUpdateTime(new Date())
                    .setCategory(reason != null ? reason : "消费")
                    .setNum(-amount); // 消费记录用负数表示

            couponRecordMapper.insert(record);

            System.out.println("消费成功！扣除 " + amount + " 点券");
            System.out.println("剩余点券：" + (gameAccount.getCoupon() - amount));
            return true;
        }

        return false;
    }
}