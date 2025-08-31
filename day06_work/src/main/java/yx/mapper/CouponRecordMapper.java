package yx.mapper;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import yx.entity.CouponRecord;

@Repository
public interface CouponRecordMapper {

    @Insert("INSERT INTO coupon_record (account, updateTime, category, num) " +
            "VALUES (#{account}, #{updateTime}, #{category}, #{num})")
    int insert(CouponRecord record);
}