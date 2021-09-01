package com.example.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    private GamingConsole game;

    public void setGame(GamingConsole game) {
        this.game = game;
    }
//
//    public GameRunner(GamingConsole game){
//        this.game = game;
//    }
    public GamingConsole getGame() {
        return game;
    }

    public void run(){
        game.jump();
        game.fall();
        game.left();
        game.right();
    }

    public void init(){
        System.out.println(game.getName()+" game is started");
    }
    public void destroy(){
        System.out.println(game.getName()+" game is destroyed");
    }
}
