package com.example.d1mys1klapo4ka.studentholder.model;

import java.io.Serializable;

/**
 * Created by d1mys1klapo4ka on 15.05.2017.
 */

public class StudentHolder implements Serializable {

    private int id;

    private String name;
    private String age;

    public StudentHolder(String name, String age){

        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
