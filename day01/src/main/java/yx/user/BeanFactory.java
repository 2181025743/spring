package yx.user;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class BeanFactory {
    public static <T> T getDaoImpl(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ResourceBundle bundle = ResourceBundle.getBundle("bean");
        String userDao = bundle.getString(className);
        Class aClass = Class.forName(userDao);
        return (T) aClass.getConstructor().newInstance();
    }
}
