package fr.campus.dungeonsndragons.npc;

/**
 * The Dragon class represents a dragon enemy in the Dungeons and Dragons game.
 * Dragons are (the most) powerful creatures in the game with randomized attack power and life points.
 * They are part of the non-playable characters (NPCs) that the players will encounter.
 */
public class Dragon extends Enemy {

    /**
     * Constructs a new Dragon object with a randomized attack power and life points.
     */
    public Dragon() {
        setType("Dragon");
        randAttack();
        randLife();
    }

    /**
     * Sets the Dragon's attack power to a random value between 3 and 6 (inclusive).
     */
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (6 - 3)) + 3;
        setAttackPower(rolledDice);
    }

    /**
     * Sets the Dragon's life points to a random value between 13 and 18 (inclusive).
     */
    public void randLife() {
        int rolledDice = (int) (Math.random() * (18 - 14)) + 13;
        setLifePoints(rolledDice);
    }
}
