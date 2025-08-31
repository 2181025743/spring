package yx.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class CouponRecord {
    private int id;
    private String account;
    private Date updateTime;
    private String category;
    private int num;
}
