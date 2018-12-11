package com.vijay.java8;

public class Game {

	private String name;
	private int ranking;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Game(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

}
