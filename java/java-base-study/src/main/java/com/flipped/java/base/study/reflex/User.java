package com.flipped.java.base.study.reflex;

/**
 * 用户实体
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-01-29 16:51:54
 */
public class User {

    private String name;

    private String gender;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void getUserInfo() {
        System.out.println("我叫" + this.name + "，我今年" + this.age + "岁了，俺是一个" + gender + "孩子");
    }

}
