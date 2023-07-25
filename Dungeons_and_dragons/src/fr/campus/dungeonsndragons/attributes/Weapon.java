package fr.campus.dungeonsndragons.attributes;

/**
 * The Weapon class represents a weapon used as a type of attack equipment in the Dungeons and Dragons game.
 * It extends the AttackEquipment class and inherits its properties and behavior.
 */
public class Weapon extends AttackEquipment {

    /**
     * Constructs a Weapon object with the specified attributes.
     *
     * @param attackLevel The level of attack power of the weapon.
     * @param attackName  The name of the attack equipment.
     */
    public Weapon(int attackLevel, String attackName) {
        super("weapon", attackLevel, attackName);
    }
}
