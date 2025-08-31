package yx.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import yx.entity.GameAccount;

import java.util.List;

@Repository
public interface GameAccountMapper {
    @Insert("insert into game_account values (null,#{account},#{password},#{coupon});")
    int insert(GameAccount gameAccount);

    @Select("select * from game_account;")
    List<GameAccount> selectList();

    @Select("select * from game_account where account =#{account} and password=#{password} limit 1;")
    GameAccount login(@Param("account") String account, @Param("password") String password);

    @Update("UPDATE game_account SET coupon = coupon + #{num} WHERE account = #{account}")
    int updateCoupon(@Param("account") String account, @Param("num") int num);// 在现有的基础上添加这些方法

    @Select("SELECT * FROM game_account WHERE account = #{account}")
    GameAccount selectByAccount(@Param("account") String account);

    @Update("UPDATE game_account SET coupon = coupon - #{num} WHERE account = #{account} AND coupon >= #{num}")
    int deductCoupon(@Param("account") String account, @Param("num") int num);
}
