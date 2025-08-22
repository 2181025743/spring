package yx.user;

import java.lang.reflect.InvocationTargetException;

public interface UserService {
    public void save() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
}
