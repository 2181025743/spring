package yx.user;

public class UserDaoJdbcImpl implements UserDao {

    public UserDaoJdbcImpl() {
        System.out.println("JDBC类的构造方法");
    }

    @Override
    public void save() {
        System.out.println("使用JDBC技术保存数据");
    }
}