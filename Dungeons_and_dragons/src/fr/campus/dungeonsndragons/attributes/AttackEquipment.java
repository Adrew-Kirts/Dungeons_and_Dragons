package fr.campus.dungeonsndragons.attributes;


public abstract class AttackEquipment {

    private String type;
    private int level;
    private String name;


    public int getLevel() {
        return level;
    }

    public AttackEquipment(String attackType, int attackLevel, String attackName){
        this.type = attackType;
        this.level = attackLevel;
        this.name = attackName;
    }

    public String toString() {

    return "a " + type + " of " + level + " ATK named " + name;
    }

}
