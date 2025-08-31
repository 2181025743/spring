package yx.mapper;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import yx.entity.GameAccount;

@Repository
public interface GameAccountMapper {
    @Insert("insert into game_account values (null,#{account},#{password},#{coupon});")
    int insert(GameAccount gameAccount);
}
