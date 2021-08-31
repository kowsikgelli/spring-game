package com.example.game;

public class Mario implements GamingConsole{
    public String name;
    private String license = "license not found";
    public String company;
    public Mario(String name,String company){
        this.name = name;
        this.company = company;
    }
    public Mario(String name,String company,String license){
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
    public void right() {
        System.out.println("Mario Right");
    }

    public void init(){
        System.out.println("Mario game is started");
    }
    public void destroy(){
        System.out.println("Mario game is destroyed");
    }
}
