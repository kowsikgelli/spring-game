package com.example.game;

import java.util.HashMap;

public class Contra implements GamingConsole{
    public String name;
    private String license = "license not found";
    public String company;
    HashMap<Integer,String> users = new HashMap<>();

    public String getName() {
        return name;
    }

    public HashMap<Integer, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, String> users) {
        this.users = users;
    }

    public Contra(String name, String company){
        this.name = name;
        this.company = company;
    }
    public Contra(String name,String company,String license){
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
    public void jump() {
        System.out.println("Contra Jump");
    }

    @Override
    public void fall() {
        System.out.println("Contra Fall");
    }

    @Override
    public void left() {
        System.out.println("Contra Left");
    }

    @Override
    public void right() {
        System.out.println("Contra Right");
    }

}
