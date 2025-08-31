package yx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import yx.entity.GameAccount;
import yx.mapper.GameAccountMapper;

import java.util.List;

@Service
public class GameAccountServiceImpl implements GameAccountService {
    @Autowired
    private GameAccountMapper gameAccountMapper;

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
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return gameAccountMapper.updateCoupon(account, num);
    }
}
