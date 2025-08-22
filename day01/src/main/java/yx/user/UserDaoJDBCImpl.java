package yx.user;

public class UserDaoJDBCImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("使用JDBC技术实现");
    }
}
