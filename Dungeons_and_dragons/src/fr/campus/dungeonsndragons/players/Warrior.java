package fr.campus.dungeonsndragons.players;

/**
 * The Warrior class represents a warrior hero in the Dungeons and Dragons game.
 * Warriors are skilled fighters with randomized attack power and life points.
 * They are part of the playable characters (heroes) that the players can choose.
 */
public class Warrior extends Hero {

    /**
     * Constructs a new Warrior object with a specified hero name, and randomized attack power and life points.
     *
     * @param heroName The name of the warrior hero.
     */
    public Warrior(String heroName) {
        super(heroName);
        randAttack();
        randLife();
    }

    /**
     * Sets the Warrior's attack power to a random value between 5 and 14 (inclusive).
     */
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (15 - 5)) + 5;
        setAttackPower(rolledDice);
    }

    /**
     * Sets the Warrior's life points to a random value between 10 and 18 (inclusive).
     */
    public void randLife() {
        int rolledDice = (int) (Math.random() * (19 - 10)) + 10;
        setLifePoints(rolledDice);
    }

}
