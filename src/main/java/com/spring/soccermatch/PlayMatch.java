package com.spring.soccermatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.soccermatch.entities.GenericTeam;
import com.spring.soccermatch.entities.SoccerGame;
import com.spring.soccermatch.entities.Team;

public class PlayMatch {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
		SoccerGame game = context.getBean("game", SoccerGame.class);
		GenericTeam realMadrid = context.getBean("realmadrid", GenericTeam.class);
		Team juventus = context.getBean("juventus", Team.class);
		
		game.setHomeTeam(realMadrid);
		game.setAwayTeam(juventus);
        System.out.println(game.toString());
        System.out.println("The winner is "+game.playGame());        

	}

}
