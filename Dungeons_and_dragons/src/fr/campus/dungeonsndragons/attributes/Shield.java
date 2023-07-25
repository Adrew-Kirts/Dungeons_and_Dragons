package fr.campus.dungeonsndragons.attributes;

/**
 * The Shield class represents a shield used as a type of defense equipment in the Dungeons and Dragons game.
 * It extends the DefenseEquipment class and inherits its properties and behavior.
 */
public class Shield extends DefenseEquipment {

    /**
     * Constructs a Shield object with the specified attributes.
     *
     * @param defenseType  The type of the shield defense equipment (e.g., shield).
     * @param defenseLevel The level of defense power of the defensive equipment.
     * @param defenseName  The name of the shield defense equipment.
     */
    public Shield(String defenseType, int defenseLevel, String defenseName) {
        super(defenseType, defenseLevel, defenseName);
    }
}
