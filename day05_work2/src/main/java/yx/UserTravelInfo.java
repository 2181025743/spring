package yx;

public class UserTravelInfo {
    private String username;
    private String from;
    private String to;

    // 构造器、getter/setter 略写
    public UserTravelInfo(String username, String from, String to) {
        this.username = username;
        this.from = from;
        this.to = to;
    }

    public String getUsername() {
        return username;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "用户：" + username + " 从 " + from + " 去往 " + to;
    }
}