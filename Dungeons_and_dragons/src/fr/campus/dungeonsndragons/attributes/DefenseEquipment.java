package fr.campus.dungeonsndragons.attributes;

public abstract class DefenseEquipment {

    String type;
    int level;
    String name;

    public DefenseEquipment(String defenseType, int defenseLevel, String defenseName) {
        this.type = defenseType;
        this.level = defenseLevel;
        this.name = defenseName;
    }

}
