# Tic-Tac-Toe Game

This repository contains a Java implementation of the classic Tic-Tac-Toe game where a player competes against a computer. The game provides an interactive and engaging experience, allowing players to test their strategic skills against an intelligent opponent.

## Features

- Interactive grid display showing the current state of the game.
- Player input to make moves by selecting empty cells on the grid.
- Computer opponent with smart logic for making strategic moves.
- Win condition detection to determine the winner.
- Tie condition detection when all moves have been made without a winner.

## How to Play

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Compile and run the `TicTacToe.java` file.
4. The game will display an empty 3x3 grid.
5. The player takes the first turn by entering a number corresponding to an empty cell on the grid.
6. The computer responds with its move.
7. The game continues until a winner is determined or the game ends in a tie.
8. The winner (player or computer) is displayed at the end of the game.

## Code Structure

The code is structured into multiple functions to handle different aspects of the game:

- `grid`: Displays the game board and current state of the grid.
- `player`: Handles the player's move by accepting input and updating the grid accordingly.
- `computer`: Implements the logic for the computer's move based on intelligent decision-making.
- `hasWon`: Checks for a winning condition by examining rows, columns, and diagonals of the grid.
- `game`: Orchestrates the flow of the game, alternating between player and computer moves, updating the grid, and checking for a winner.

## Contribution

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please feel free to submit a pull request or open an issue.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify the code for personal or commercial purposes.

## Credits

The Tic-Tac-Toe game implementation in this repository is created by Eesh Gharat.