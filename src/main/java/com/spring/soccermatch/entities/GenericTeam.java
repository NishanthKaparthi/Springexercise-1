package com.spring.soccermatch.entities;

public class GenericTeam implements Team {

	String name;

	public GenericTeam() {

	}

	public GenericTeam(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
