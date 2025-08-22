package yx.user;

import java.lang.reflect.InvocationTargetException;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        try {
            UserDao userDao = BeanFactory.getDaoImpl("userDao");
            userDao.save();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
