package com.flipped.java.base.study.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射小例子
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-02-07 22:38:55
 */
public class ReflexDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 获取 User 类的 Class 对象并且创建 User 类实例
        Class<?> userClass = Class.forName("com.first.flipped.reflex.User");
        User user = (User) userClass.getDeclaredConstructor().newInstance();

        // 获取所有方法
        Method[] methods = userClass.getMethods();
        Arrays.stream(methods).forEach(item -> System.out.println(item.getName()));

        // 获取指定参数并对参数进行修改
        Field gender = userClass.getDeclaredField("gender");
        gender.setAccessible(true);
        gender.set(user, "男");

        // 获取指定方法并调用
        Method setName = userClass.getDeclaredMethod("setName", String.class);
        setName.invoke(user, "张三");
        Method setAge = userClass.getDeclaredMethod("setAge", Integer.class);
        setAge.invoke(user, 18);

        Method getAge = userClass.getDeclaredMethod("getUserInfo");
        getAge.invoke(user);
    }

}
