package com.example.game;

import java.util.HashMap;

public interface GamingConsole {
    void jump();
    void fall();
    void left();
    void right();
    String getLicense();
    String getCompany();
    HashMap<Integer, String> getUsers();
    String getName();
}
