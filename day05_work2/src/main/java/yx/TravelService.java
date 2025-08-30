package yx;

import org.springframework.stereotype.Component;

@Component
public class TravelService {
    public void travel(UserTravelInfo info) {
        System.out.println("您好，" + info.getUsername()
                + "，欢迎您乘坐从 " + info.getFrom() + " 到 " + info.getTo() + " 的航班");
    }
}