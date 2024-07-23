package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.PigGame;

public class PigGameTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		PigGame piggame=new PigGame();		
		System.out.println("\tWELCOME TO PIG GAME \n\tACHIEVE 20 SCORE");
		
		startGame(piggame,scanner);
		
		System.out.println("\n\nYOU FINISHED IN "+piggame.getTurns()+" TURNS.\nTOTAL SCORE : "+piggame.getTotal_score());
		System.out.println("=====================================YOU WON ============================================");
		scanner.close();
	}
	
	
	
	
	
	private static char readChoice(Scanner scanner,PigGame piggame)
	{
		int turn=piggame.getTurns();
		System.out.println("--------------------- -- TURN "+turn+" ---------------------- ");
		System.out.println("Roll or hold ?(r/h): ");
		String choice=scanner.next();
		return choice.charAt(0);
	}
	
	private static void startGame(PigGame piggame,Scanner scanner)
	{
		while(piggame.getTotal_score()<20)
		{
			char choice=readChoice(scanner,piggame);
			roll(piggame,scanner,choice);
		}
	}
	
	private static void roll(PigGame piggame,Scanner scanner,int choice)
	{
		if(choice=='r')
		{
			piggame.setDice_roll(diceRoll());
			int dice=piggame.getDice_roll();
			System.out.println(dice);
		
			rollsConditonTester(dice,piggame);
			return;
		}
		hold(piggame,choice);	
	}
	
	private static void rollsConditonTester(int dice,PigGame piggame)
	{
		if(dice==1)
		{
			int turns=piggame.getTurns();
			turns++;
			piggame.setTurns(turns);
			piggame.setScore(0);
			System.out.println("TURN OVER, NO SCORE");
			return;	
		}
		int score=piggame.getScore();
		score=score+dice;
		piggame.setScore(score);
		System.out.println("SCORE: "+piggame.getScore());
		piggame.setTotal_score(score);
		
	}
	
	private static void hold(PigGame piggame,int choice)
	{
		if(choice=='h')
		{
			int turns=piggame.getTurns();
			turns++;
			piggame.setTurns(turns);
			System.out.println("SCORE FOR TURN "+turns+" : "+piggame.getScore());
			System.out.println("TOTAL SCORE : "+piggame.getTotal_score());
		}
	}
	
	private static int diceRoll()
	{
		int rand;
		while(true) 
		{
			rand=(int) (Math.random()*7);
			if(rand!=0)
				break;
		}
			return rand;
	}

}
