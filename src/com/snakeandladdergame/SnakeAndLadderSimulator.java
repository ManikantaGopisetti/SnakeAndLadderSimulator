package com.snakeandladdergame;

public class SnakeAndLadderSimulator {

	final static int No_PLAY = 0;
	final static int LADDER = 1;
	final static int SNAKE = 2;

	public static void main(String[] args) {

		int playerPosition = 0;

		int dieRoll = (int) (Math.random() * 10) % 6 + 1; // using random to get random number
		System.out.println(dieRoll);

		int option = (int) (Math.random() * 10) % 3;

		switch (option) {

		case LADDER:
			System.out.println("player entered the ladder position");
			playerPosition += dieRoll;
			System.out.println("player position="+playerPosition);
			break;
		case SNAKE:
			System.out.println("player entered the snake position");
			playerPosition -= dieRoll;
			System.out.println("player position="+playerPosition);
			break;
		default:
			System.out.println("player entered the no play position");
			System.out.println("player position="+playerPosition);
			break;

		}
	}

}