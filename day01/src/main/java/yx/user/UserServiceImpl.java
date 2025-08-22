package yx.user;

import java.lang.reflect.InvocationTargetException;

public class UserServiceImpl implements UserService {
    @Override
    public void save() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UserDao userDao = BeanFactory.getDaoImpl("userDao");
        userDao.save();
    }
}
