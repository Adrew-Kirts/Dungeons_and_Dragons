package fr.campus.dungeonsndragons.attributes;

/**
 * The Potion class represents a potion used as a type of defense equipment in the Dungeons and Dragons game.
 * It extends the DefenseEquipment class and inherits its properties and behavior.
 */
public class Potion extends DefenseEquipment {

    /**
     * Constructs a Potion object with the specified attributes.
     *
     * @param defenseType  The type of the potion defense equipment (e.g., potion).
     * @param defenseLevel The level of defense power of the potion.
     * @param defenseName  The name of the potion defense equipment.
     */
    public Potion(String defenseType, int defenseLevel, String defenseName) {
        super(defenseType, defenseLevel, defenseName);
    }
}
