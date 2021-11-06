package com.snakeandladdergame;

public class SnakeAndLadderSimulator {
	public static void main(String[] args) {
		
		int playerPosition=0;
		
		int dieRoll=(int)(Math.random()*10)%6+1; //using random to get random number
		System.out.println(dieRoll);
	}

}