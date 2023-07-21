package fr.campus.dungeonsndragons.board;

import fr.campus.dungeonsndragons.npc.Enemy;

public class EnemySquare implements Square {
    private Enemy enemy;

    public EnemySquare(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
