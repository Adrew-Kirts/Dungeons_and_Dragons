package fr.campus.dungeonsndragons.equipment;

public class AttackEquipment {

    String type;
    int level;
    String name;

    public AttackEquipment(String attackType, int attackLevel, String attackName){
        this.type = attackType;
        this.level = attackLevel;
        this.name = attackName;
    }

}
