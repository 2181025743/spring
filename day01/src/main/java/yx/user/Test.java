package yx.user;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
