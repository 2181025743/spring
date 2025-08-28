package yx;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("增加用户信息");
    }

    @Override
    public void delete() {
        System.out.println("删除用户信息");
    }
}
