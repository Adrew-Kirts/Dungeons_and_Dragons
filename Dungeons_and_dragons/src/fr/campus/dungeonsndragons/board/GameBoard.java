package fr.campus.dungeonsndragons.board;

import fr.campus.dungeonsndragons.npc.Dragon;
import fr.campus.dungeonsndragons.npc.Enemy;
import fr.campus.dungeonsndragons.npc.Goblin;
import fr.campus.dungeonsndragons.npc.Giant;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The GameBoard class represents the game board for the Dungeons and Dragons game.
 * It contains an ArrayList of Square objects to represent the squares on the board.
 * The class handles the random placement of enemies on the game board.
 */
public class GameBoard {

    /**
     * The size of the game board.
     */
    private static final int BOARD_SIZE = 64;

    /**
     * The ArrayList to store the squares on the game board.
     */
    private ArrayList<Square> gameboard = new ArrayList<>();

    // GETTERS AND SETTERS
    public ArrayList<Square> getGameboard() {
        return gameboard;
    }

    /**
     * Constructs a GameBoard object and initializes the game board with enemies placed at random positions.
     *
     * @param numEnemies The number of enemies to be placed on the game board.
     */
    public GameBoard(int numEnemies) {
        // Fill gameboard with nothing
        for (int i = 0; i < BOARD_SIZE; i++) {
            gameboard.add(null);
        }

        // Random enemy placement
        ArrayList<Integer> emptyIndices = new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            emptyIndices.add(i);
        }
        Collections.shuffle(emptyIndices);

        int remainingEnemies = Math.min(numEnemies, BOARD_SIZE);

        // Place enemy at random index:
        for (int i = 0; i < remainingEnemies; i++) {
            int index = emptyIndices.get(i);
            if (gameboard.get(index) == null) {

                Enemy enemy = getRandomEnemy();
                gameboard.set(index, new EnemySquare(enemy));
            }
        }
    }

    /**
     * Generates a random enemy based on probability distribution and returns it.
     *
     * @return A randomly selected enemy from the available enemy types.
     */
    private Enemy getRandomEnemy() {
        int random = (int) (Math.random() * 6);
        switch (random) {
            case 3, 4, 5:
                return new Giant();
            case 6:
                return new Dragon();
            default:
                return new Goblin();
        }
    }

}
