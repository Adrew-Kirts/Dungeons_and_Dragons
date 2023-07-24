package fr.campus.dungeonsndragons.npc;

/**
 * The Goblin class represents a goblin enemy in the Dungeons and Dragons game.
 * Goblins are small creatures with randomized attack power and life points.
 * They are part of the non-playable characters (NPCs) that the players will encounter.
 */
public class Goblin extends Enemy {

    /**
     * Constructs a new Goblin object with a randomized attack power and life points.
     */
    public Goblin() {
        setType("Goblin");
        randAttack();
        randLife();
    }

    /**
     * Sets the Goblin's attack power to a random value between 1 and 3 (inclusive).
     */
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (3 - 1)) + 1;
        setAttackPower(rolledDice);
    }

    /**
     * Sets the Goblin's life points to a random value between 6 and 12 (inclusive).
     */
    public void randLife() {
        int rolledDice = (int) (Math.random() * (12 - 8)) + 6;
        setLifePoints(rolledDice);
    }
}
