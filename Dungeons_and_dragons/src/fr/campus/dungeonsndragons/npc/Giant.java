package fr.campus.dungeonsndragons.npc;

/**
 * The Giant class represents a giant enemy in the Dungeons and Dragons game.
 * Giants are creatures with randomized attack power and life points.
 * They are part of the non-playable characters (NPCs) that the players will encounter.
 */
public class Giant extends Enemy {

    /**
     * Constructs a new Giant object with a randomized attack power and life points.
     */
    public Giant() {
        setType("Giant");
        randAttack();
        randLife();
    }

    /**
     * Sets the Giant's attack power to a random value between 3 and 4 (inclusive).
     */
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (4 - 3)) + 3;
        setAttackPower(rolledDice);
    }

    /**
     * Sets the Giant's life points to a random value between 7 and 13 (inclusive).
     */
    public void randLife() {
        int rolledDice = (int) (Math.random() * (21 - 14)) + 14;
        setLifePoints(rolledDice);
    }
}
