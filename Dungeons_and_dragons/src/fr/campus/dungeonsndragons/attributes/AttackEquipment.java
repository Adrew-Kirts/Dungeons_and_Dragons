package fr.campus.dungeonsndragons.attributes;
import fr.campus.dungeonsndragons.players.Hero;

public abstract class AttackEquipment {

    private String type;
    private int level;
    private String name;
    private Hero hero;

    public AttackEquipment(String attackType, int attackLevel, String attackName){
        this.type = attackType;
        this.level = attackLevel;
        this.name = attackName;

        hero.setAttackType(type);
        hero.setAttackPower(level);
        hero.setEquipmentName(name);
        
    }

}
