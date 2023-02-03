package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.learnspringframework.game.GameRunner;

@SpringBootApplication
@ComponentScan("com.in28minutes.learnspringframework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame,GameRunner
		GameRunner runner = context.getBean(GameRunner.class);
		
		
//		MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		
//		GameRunner runner = new GameRunner(game);
		
		runner.runGame();
	}

}
