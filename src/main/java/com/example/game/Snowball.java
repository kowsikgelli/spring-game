package com.example.game;

import java.util.HashMap;

public class Snowball implements GamingConsole{
    public String name;
    private String license = "license not found";
    public String company;
    HashMap<Integer,String> users = new HashMap<>();

    public Snowball(String name,String company){
        this.name = name;
        this.company = company;
    }
    public Snowball(String name,String company,String license){
        this.name = name;
        this.license = license;
        this.company = company;
    }


    public void setUsers(HashMap<Integer, String> users) {
        this.users = users;
    }


    @Override
    public String getName() {
        return name;
    }
    public String getLicense() {
        return license;
    }
    public String getCompany(){
        return company;
    }

    @Override
    public HashMap<Integer, String> getUsers() {
        return users;
    }

    @Override
    public void jump() {
        System.out.println("Snowball Jump");
    }

    @Override
    public void fall() {
        System.out.println("Snowball Fall");
    }

    @Override
    public void left() {
        System.out.println("Snowball Left");
    }

    @Override
    public void right() {
        System.out.println("Snowball Right");
    }

}
