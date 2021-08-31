package com.example.game;

import java.util.HashMap;

public class Mario implements GamingConsole{
    public String name;
    private String license = "license not found";
    public String company;
    HashMap<Integer,String> users = new HashMap<>();
    public Mario(String name,String company){
        this.name = name;
        this.company = company;
    }

    public void setUsers(HashMap<Integer, String> users) {
        this.users = users;
    }

    public Mario(String name, String company, String license){
        this.name = name;
        this.license = license;
        this.company = company;
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
        System.out.println("Mario Jump");
    }

    @Override
    public void fall() {
        System.out.println("Mario Fall");
    }

    @Override
    public void left() {
        System.out.println("Mario Left");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void right() {
        System.out.println("Mario Right");
    }

}
