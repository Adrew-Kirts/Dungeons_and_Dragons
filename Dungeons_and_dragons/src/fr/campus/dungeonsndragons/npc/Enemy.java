package fr.campus.dungeonsndragons.npc;

/**
 * The Enemy class is an abstract class representing an enemy in the Dungeons and Dragons game.
 * Enemies are non-playable characters (NPCs) that the players will encounter during the game.
 * This class provides common attributes and methods for all enemy types.
 */
public abstract class Enemy {

    // VARIABLES

    private String type;
    private int lifePoints;
    private int attackPower;

    // GETTERS AND SETTERS

    /**
     * Gets the type of the enemy.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the enemy.
     *
     * @param type The type of the enemy.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the life points of the enemy.
     *
     * @return The life points of the enemy.
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * Sets the life points of the enemy.
     *
     * @param lifePoints The life points of the enemy.
     */
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    /**
     * Gets the attack power of the enemy.
     *
     * @return The attack power of the enemy.
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * Sets the attack power of the enemy.
     *
     * @param attackPower The attack power of the enemy.
     */
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // CONSTRUCTOR
    /**
     * Constructs a new Enemy object.
     * This is a default constructor provided for subclasses.
     */
    public Enemy() {
    }

}
