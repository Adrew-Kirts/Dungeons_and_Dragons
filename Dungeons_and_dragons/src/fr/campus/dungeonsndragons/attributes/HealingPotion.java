package fr.campus.dungeonsndragons.attributes;

/**
 * The HealingPotion class represents a healing potion used in the Dungeons and Dragons game.
 * It provides a method to generate a healing potion with a specified size (small or large).
 */
public class HealingPotion {

    /**
     * The size of the healing potion (small or large).
     */
    public String size;

    /**
     * Constructs a HealingPotion object with the specified size.
     *
     * @param size The size of the healing potion (small or large).
     */
    public HealingPotion(String size) {
        this.size = size;
    }

    /**
     * Generates a string representation of the HealingPotion.
     *
     * @return A string describing the healing potion with its size.
     */
    public String toString() {
        return "a " + size + " sized potion";
    }
}
