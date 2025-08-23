package com.yx.question;

import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.yx.question.Teacher");
        Object teacherObj = clazz.getDeclaredConstructor().newInstance();
        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(teacherObj, "赵老师");
        Method setAddr = clazz.getMethod("setAddr", String.class);
        setAddr.invoke(teacherObj, "广州市天河区");
        System.out.println(teacherObj);
    }
}