package com.lcwd.orm.learn_spring_orm.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int id;

    @Column(name = "USER_NAME", unique = true, length = 100)
    private String name;

    @Column(name = "USER_CITY", length = 50)
    private String city;

    @Column(name = "USER_AGE", length = 2)
    private int age;

    public User(int age, String city, int id, String name) {
        this.age = age;
        this.city = city;
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
}