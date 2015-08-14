package com.zhi.entity;

import java.io.Serializable;

/**
 * Created by root on 2015-8-14.
 */
public class Gangster implements Serializable {
    private String name;
    private int age;
    private String description;
    private boolean bustedBefore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBustedBefore() {
        return bustedBefore;
    }

    public void setBustedBefore(boolean bustedBefore) {
        this.bustedBefore = bustedBefore;
    }

    @Override
    public String toString() {
        return "Gangster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", bustedBefore=" + bustedBefore +
                '}';
    }
}
