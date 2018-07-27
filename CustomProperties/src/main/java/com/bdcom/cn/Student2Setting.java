package com.bdcom.cn;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "Student2")
public class Student2Setting {
    public String name;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String gender;
    public int age;
}
