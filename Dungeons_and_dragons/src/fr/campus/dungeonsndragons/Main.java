package fr.campus.dungeonsndragons;

import fr.campus.dungeonsndragons.logic.Game;


/**
 * The Main class serves as the entry point to the Dungeons and Dragons game.
 * It creates a new game instance and starts the game by calling the `runGame()` method.
 */
public class Main {

    /**
     * The main method of the application.
     * It creates a new game instance and starts the game by calling the `runGame()` method.
     */
    public static void main(String[] args) {
        // Create a new instance of the Game class.
        Game newGame = new Game();

        // Start the game by calling the runGame() method.
        newGame.runGame();
    }
}
