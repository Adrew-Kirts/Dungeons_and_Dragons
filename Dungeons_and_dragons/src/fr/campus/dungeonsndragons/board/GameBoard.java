package fr.campus.dungeonsndragons.board;

import fr.campus.dungeonsndragons.npc.Dragon;
import fr.campus.dungeonsndragons.npc.Enemy;
import fr.campus.dungeonsndragons.npc.Goblin;
import fr.campus.dungeonsndragons.npc.Giant;

import java.util.ArrayList;
import java.util.Collections;

public class GameBoard {
    private static final int BOARD_SIZE = 64;
    private ArrayList<Square> gameboard = new ArrayList<>();

    //GETTERS AND SETTERS
    public ArrayList<Square> getGameboard() {
        return gameboard;
    }

    public GameBoard(int numEnemies) {
        //Fill gameboard with nothing
        for (int i = 0; i < BOARD_SIZE; i++) {
            gameboard.add(null);
        }

        //Random enemy placement
        ArrayList<Integer> emptyIndices = new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            emptyIndices.add(i);
        }
        Collections.shuffle(emptyIndices);

        int remainingEnemies = Math.min(numEnemies, BOARD_SIZE);

        //Place enemy at random index:
        for (int i = 0; i < remainingEnemies; i++) {
            int index = emptyIndices.get(i);
            if (gameboard.get(index) == null) {

                Enemy enemy = getRandomEnemy();
                gameboard.set(index, new EnemySquare(enemy));
            }
        }
    }

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
