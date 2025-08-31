package yx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yx.entity.GameAccount;
import yx.mapper.GameAccountMapper;

@Service
public class GameAccountServiceImpl implements GameAccountService {
    @Autowired
    private GameAccountMapper gameAccountMapper;

    @Transactional
    @Override
    public void register(GameAccount gameAccount) {
        gameAccountMapper.insert(gameAccount);
    }
}
