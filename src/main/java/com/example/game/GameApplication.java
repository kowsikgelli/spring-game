package com.example.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		GameRunner obj = (GameRunner)context.getBean("gameRunner");
		obj.run();
		GamingConsole game = obj.getGame();
		System.out.println(game.getLicense());
		System.out.println(game.getCompany());
		context.registerShutdownHook();
	}
}
