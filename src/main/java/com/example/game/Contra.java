package com.example.game;

public class Contra implements GamingConsole{
    public String name;
    private String license = "license not found";
    public String company;
    public Contra(String name,String company){
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

    public void init(){
        System.out.println("Contra game is started");
    }
    public void destroy(){
        System.out.println("Contra game is destroyed");
    }
}
