package yx.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GameAccount {
    private int id;
    private String account;
    private String password;
    private int coupon;
}
