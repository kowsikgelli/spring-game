package com.example.game;

public class Snowball implements GamingConsole{
    public String name;
    private String license = "license not found";
    public String company;
    public Snowball(String name,String company){
        this.name = name;
        this.company = company;
    }
    public Snowball(String name,String company,String license){
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

    public void init(){
        System.out.println("Snowball game is started");
    }
    public void destroy(){
        System.out.println("Snowball game is destroyed");
    }
}
