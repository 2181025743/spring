package yx.user;

public class UserDaoMybatisImpl implements UserDao {

    public UserDaoMybatisImpl() {
        System.out.println("MyBatis类的构造方法");
    }

    @Override
    public void save() {
        System.out.println("使用MyBatis技术保存数据");
    }
}