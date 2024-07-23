package com.techlabs.model;

public class PigGame {
	private int dice_roll;
	private int total_score;
	private int score;
	private int turns;
	
	
	
	public PigGame() {
		dice_roll = 1;
		total_score = 0;
		score = 0;
		turns = 1;
	}
	public int getDice_roll() {
		return dice_roll;
	}
	public void setDice_roll(int dice_roll) {
		this.dice_roll = dice_roll;
	}
	public int getTotal_score() {
		return total_score;
	}
	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTurns() {
		return turns;
	}
	public void setTurns(int turns) {
		this.turns = turns;
	}
	
	
	
}
