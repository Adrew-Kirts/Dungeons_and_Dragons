package fr.campus.dungeonsndragons.players;

public abstract class Hero {

    //VARIABLES

    //Hero:
    private String name; //Hero name
    private String type; //Hero type (warrior or wizard)
    private int lifePoints;
    private int attackPower;


    //Equipment:
    private String attackType; //weapon or spell
    private String equipmentName;
    private int equipmentAttackPower;
    private int totalAttackPower = attackPower + equipmentAttackPower;
    private int smallPotionCount = 0;
    private int largePotionCount = 0;

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

    public int getEquipmentAttackPower() {return equipmentAttackPower;}

    public void setEquipmentAttackPower(int equipmentAttackPower) {this.equipmentAttackPower = equipmentAttackPower;}

    public int getSmallPotionCount() {return smallPotionCount;}

    public void setSmallPotionCount(int smallPotionCount) {this.smallPotionCount = smallPotionCount;}

    public int getLargePotionCount() {return largePotionCount;}

    public void setLargePotionCount(int largePotionCount) {this.largePotionCount = largePotionCount;}

    public String getAttackType() {return attackType;}

    public void setAttackType(String attackType) {this.attackType = attackType;}

    public String getEquipmentName() {return equipmentName;}

    public void setEquipmentName(String equipmentName) {this.equipmentName = equipmentName;}

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
        return "Your hero " + name + " has an attack power of " +
                attackPower + " + an additional " + equipmentAttackPower + " points for the equipment you might have" + " and " + lifePoints + " life points.";
    }
}


