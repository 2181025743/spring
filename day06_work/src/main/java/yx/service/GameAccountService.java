package yx.service;

import yx.entity.GameAccount;

import java.util.List;

public interface GameAccountService {
    void register(GameAccount gameAccount);

    List<GameAccount> selectList();

    GameAccount login(String account, String password);

    int updateCoupon(String account, int num);

    // 新增消费点券方法
    boolean consumeCoupon(String account, int amount, String reason);
}