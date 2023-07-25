package fr.campus.dungeonsndragons.attributes;

/**
 * The AttackEquipment class represents the abstract concept of an attack equipment used in the Dungeons and Dragons game.
 * It serves as a base class for different types of attack equipment, such as weapons and spells.
 */
public abstract class AttackEquipment {

    /**
     * The type of attack equipment (e.g., weapon, spell).
     */
    private String type;

    /**
     * The level of attack power of the equipment.
     */
    private int level;

    /**
     * The name of the attack equipment.
     */

    private String name;

    /**
     * Gets the level of attack power of the equipment.
     *
     * @return The level of attack power.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Constructs an AttackEquipment object with the specified attributes.
     *
     * @param attackType  The type of the attack equipment (e.g., weapon, spell).
     * @param attackLevel The level of attack power of the equipment.
     * @param attackName  The name of the attack equipment.
     */
    public AttackEquipment(String attackType, int attackLevel, String attackName) {
        this.type = attackType;
        this.level = attackLevel;
        this.name = attackName;
    }

    /**
     * Generates a string representation of the AttackEquipment.
     *
     * @return A string describing the AttackEquipment, including its type, level of attack power, and name.
     */
    public String toString() {

        return "a " + type + " of " + level + " ATK named " + name;
    }

}
