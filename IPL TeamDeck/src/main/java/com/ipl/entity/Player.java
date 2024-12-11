package com.ipl.entity;

public class Player {
	private int jersy_no;
	private String name;
	private int runs;
	private int wickets;
	private String team;
	
	
	public Player() {
		super();
		
	}

	public Player(int jersy_no, String name, int runs, int wickets, String team) {
		super();
		this.jersy_no = jersy_no;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
	}

	public int getJersy_no() {
		return jersy_no;
	}

	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}

	public String getname() {
		return name;
	}

	public void setPname(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTname() {
		return team;
	}

	public void setTname(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [jersy_no=" + jersy_no + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets
				+ ", team=" + team + "]";
	}
	
	
	

}