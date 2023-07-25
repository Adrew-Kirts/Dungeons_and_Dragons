package fr.campus.dungeonsndragons.board;

import fr.campus.dungeonsndragons.npc.Enemy;

/**
 * The EnemySquare class represents a square on the game board that contains an enemy in the Dungeons and Dragons game.
 * It implements the Square interface and provides a method to retrieve the enemy associated with the square.
 */
public class EnemySquare implements Square {

    /**
     * The enemy present on the square.
     */
    private Enemy enemy;

    /**
     * Constructs an EnemySquare object with the specified enemy.
     *
     * @param enemy The enemy to be associated with the square.
     */
    public EnemySquare(Enemy enemy) {
        this.enemy = enemy;
    }

    /**
     * Retrieves the enemy associated with the square.
     *
     * @return The enemy present on the square.
     */
    public Enemy getEnemy() {
        return enemy;
    }
}
