package com.snakeandladdergame;

public class SnakeAndLadderSimulator {

	final static int No_PLAY = 0;
	final static int LADDER = 1;
	final static int SNAKE = 2;
	final static int WIN_POSITION = 100;

	public int snakeAndLadderGame(int player, int playerPosition) {

		int prevPosition = playerPosition;

		System.out.println("now player " + player + " turn");

		int dieRoll = (int) (Math.random() * 10) % 6 + 1; // using random to get random number
		System.out.println("number got from throwing die= " + dieRoll);

		playerPosition += dieRoll;
		if (playerPosition > WIN_POSITION) {
			playerPosition -= dieRoll;
		}
		if (playerPosition == WIN_POSITION) {
			return playerPosition;
		}

		int option = (int) (Math.random() * 10) % 3;

		switch (option) {

		case LADDER:
			System.out.println("player entered the ladder position");
			playerPosition += dieRoll;
			if (playerPosition > WIN_POSITION) {
				playerPosition = prevPosition;
			}
			System.out.println("player get another chance to roll dice ");
			SnakeAndLadderSimulator game = new SnakeAndLadderSimulator();
			playerPosition = game.snakeAndLadderGame(player, playerPosition);
			return playerPosition;

		case SNAKE:
			System.out.println("player entered the snake position");
			playerPosition -= dieRoll;
			if (playerPosition < 0) {
				playerPosition = prevPosition;
			}

			break;
		default:
			System.out.println("player entered the no play position");
			break;

		}
		System.out.println("player" + player + " position= " + playerPosition);
		return playerPosition;

	}

	public static void main(String[] args) {

		int player1Position = 0, player2Position = 0, player1 = 1, player2 = 2;

		SnakeAndLadderSimulator game = new SnakeAndLadderSimulator();

		while (true) {

			player1Position = game.snakeAndLadderGame(player1, player1Position);
			if (player1Position == WIN_POSITION) {
				System.out.println("Hurray player 1 won the game");
				break;
			}

			player2Position = game.snakeAndLadderGame(player2, player2Position);
			if (player2Position == WIN_POSITION) {
				System.out.println("Hurray player 2 won the game");
				break;
			}

		}

		System.out.println("player 1 position= " + player1Position);
		System.out.println("player 2 position= " + player2Position);

	}

}