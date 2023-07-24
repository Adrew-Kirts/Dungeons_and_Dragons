package fr.campus.dungeonsndragons.players;

/**
 * The Wizard class represents a wizard hero in the Dungeons and Dragons game.
 * Wizards are skilled spellcasters with randomized attack power and life points.
 * They are part of the playable characters (heroes) that the players can choose.
 */
public class Wizard extends Hero {

    /**
     * Constructs a new Wizard object with a specified hero name, and randomized attack power and life points.
     *
     * @param heroName The name of the wizard hero.
     */
    public Wizard(String heroName) {
        super(heroName);
        randAttack();
        randLife();
    }

    /**
     * Sets the Wizard's attack power to a random value between 8 and 20 (inclusive).
     */
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (21 - 8)) + 8;
        setAttackPower(rolledDice);
    }

    /**
     * Sets the Wizard's life points to a random value between 8 and 15 (inclusive).
     */
    public void randLife() {
        int rolledDice = (int) (Math.random() * (16 - 8)) + 8;
        setLifePoints(rolledDice);
    }

}
