package com.snakeandladdergame;

public class SnakeAndLadderSimulator {

	final static int No_PLAY = 0;
	final static int LADDER = 1;
	final static int SNAKE = 2;
	final static int WIN_POSITION = 100;

	public static void main(String[] args) {

		int playerPosition = 0;
		int prevPosition = 0;
		int dieCount=0;

		while (true) {

			int dieRoll = (int) (Math.random() * 10) % 6 + 1; // using random to get random number
			System.out.println("number got from throwing die= " + dieRoll);

			int option = (int) (Math.random() * 10) % 3;

			switch (option) {

			case LADDER:
				System.out.println("player entered the ladder position");
				playerPosition += dieRoll;
				if (playerPosition > WIN_POSITION) {
					playerPosition = prevPosition;
				}
				System.out.println("player position=" + playerPosition);
				if (playerPosition==WIN_POSITION) {
					System.out.println("Hurray the player has won the game");
				}
				break;
			case SNAKE:
				System.out.println("player entered the snake position");
				playerPosition -= dieRoll;
				if (playerPosition < 0) {
					playerPosition = prevPosition;
				}
				System.out.println("player position=" + playerPosition);
				break;
			default:
				System.out.println("player entered the no play position");
				System.out.println("player position=" + playerPosition);
				break;

			}
			prevPosition = playerPosition;
			dieCount++;
			if (playerPosition >= WIN_POSITION) {
				break;
			}
		}
		System.out.println("the die was rolled "+dieCount+" times to win the game");
	}

}