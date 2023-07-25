package fr.campus.dungeonsndragons.attributes;

/**
 * The DefenseEquipment class represents the abstract concept of a defense equipment used in the Dungeons and Dragons game.
 * It serves as a base class for different types of defense equipment, such as armor and shields.
 */
public abstract class DefenseEquipment {

    /**
     * The type of defense equipment (e.g., armor, shield).
     */
    String type;

    /**
     * The level of defense power of the equipment.
     */
    int level;

    /**
     * The name of the defense equipment.
     */
    String name;

    /**
     * Constructs a DefenseEquipment object with the specified attributes.
     *
     * @param defenseType  The type of the defense equipment (e.g., armor, shield).
     * @param defenseLevel The level of defense power of the equipment.
     * @param defenseName  The name of the defense equipment.
     */
    public DefenseEquipment(String defenseType, int defenseLevel, String defenseName) {
        this.type = defenseType;
        this.level = defenseLevel;
        this.name = defenseName;
    }
}
