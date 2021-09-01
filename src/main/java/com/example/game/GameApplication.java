package com.example.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class GameApplication {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		GameRunner obj = (GameRunner)context.getBean("gameRunner");
		obj.run();
//		GamingConsole game = obj.getGame();
//		HashMap<Integer,String> mp = game.getUsers();
//		for(Map.Entry<Integer,String> i : mp.entrySet()){
//			System.out.println(i.getKey()+" "+i.getValue());
//		}
//		System.out.println(game.getLicense());
//		System.out.println(game.getCompany());
		context.registerShutdownHook();
	}
}
