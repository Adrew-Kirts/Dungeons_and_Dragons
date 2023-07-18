package fr.campus.dungeonsndragons.attributes;

public abstract class AttackEquipment {

    private String type;
    private int level;
    private String name;

    public AttackEquipment(String attackType, int attackLevel, String attackName){
        this.type = attackType;
        this.level = attackLevel;
        this.name = attackName;


    }

}
