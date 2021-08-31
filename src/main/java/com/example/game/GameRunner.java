package com.example.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;
    }
    public GamingConsole getGame() {
        return game;
    }

    public void run(){
        game.jump();
        game.fall();
        game.left();
        game.right();
    }
}
