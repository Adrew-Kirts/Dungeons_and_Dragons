package fr.campus.dungeonsndragons.attributes;

/**
 * The Spell class represents a spell used as a type of attack equipment in the Dungeons and Dragons game.
 * It extends the AttackEquipment class and inherits its properties and behavior.
 */
public class Spell extends AttackEquipment {

    /**
     * Constructs a Spell object with the specified attributes.
     *
     * @param attackLevel The level of attack power of the spell.
     * @param attackName  The name of the spell attack equipment.
     */
    public Spell(int attackLevel, String attackName) {
        super("spell", attackLevel, attackName);
    }
}
