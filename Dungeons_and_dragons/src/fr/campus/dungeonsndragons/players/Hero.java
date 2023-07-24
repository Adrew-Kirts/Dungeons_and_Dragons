package fr.campus.dungeonsndragons.players;

import fr.campus.dungeonsndragons.attributes.AttackEquipment;
import fr.campus.dungeonsndragons.attributes.DefenseEquipment;
import fr.campus.dungeonsndragons.attributes.HealingPotion;

public abstract class Hero {

    //VARIABLES

    //Hero:
    private String name; //Hero name
    private String type; //Hero type (warrior or wizard)
    private int lifePoints;
    private int attackPower;


    //Equipment:
    private AttackEquipment attackEquipment;
    private DefenseEquipment defenseEquipment;
    private HealingPotion healingPotions;


    //GETTERS and SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifeLevel) {
        this.lifePoints = lifeLevel;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public HealingPotion getHealingPotions() {
        return healingPotions;
    }

    public void setHealingPotions(HealingPotion healingPotions) {
        this.healingPotions = healingPotions;
    }

    public AttackEquipment getAttackEquipment() {
        return attackEquipment;
    }

    public void setAttackEquipment(AttackEquipment attackEquipment) {
        this.attackEquipment = attackEquipment;
    }

    public DefenseEquipment getDefenseEquipment() {
        return defenseEquipment;
    }

    public void setDefenseEquipment(DefenseEquipment defenseEquipment) {
        this.defenseEquipment = defenseEquipment;
    }

    //CONSTRUCTORS
    public Hero() {
    }

    public Hero(String heroName) {
        this.name = heroName;
    }

    public Hero(String heroName, String heroType) {
        this.name = heroName;
        this.type = heroType;
    }

    public String toString() {

        if (healingPotions == null && attackEquipment == null) {
            return "\nYour hero " + name + " has " + lifePoints + " HP and " +
                    attackPower + " ATK";
        } else if (healingPotions == null) {
            return "\nYour hero " + name + " has " + lifePoints + " HP and " +
                    attackPower + " ATK, " + attackEquipment;
        } else if (attackEquipment == null) {
            return "\nYour hero " + name + " has " + lifePoints + " HP and " +
                    attackPower + " ATK, " + healingPotions;
        } else {
            return "\nYour hero " + name + " has " + lifePoints + " HP and " +
                    attackPower + " ATK, " + attackEquipment + " and " + healingPotions;
        }

    }

}


