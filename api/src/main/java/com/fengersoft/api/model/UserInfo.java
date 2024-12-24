package com.fengersoft.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    private int id;
    private String name;
    private int age;

    public UserInfo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
