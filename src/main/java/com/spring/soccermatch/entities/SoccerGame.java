package com.spring.soccermatch.entities;

public class SoccerGame {
    private Team homeTeam;
    private Team awayTeam;
    
	public SoccerGame() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoccerGame(Team homeTeam, Team awayTeam) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public String playGame() {
		return Math.random() < 0.5? getHomeTeam().getName():getAwayTeam().getName();
	}

    public String toString() {
        return String.format("Game between %s and %s", awayTeam.getName(), homeTeam.getName());
    }

    
    

}
