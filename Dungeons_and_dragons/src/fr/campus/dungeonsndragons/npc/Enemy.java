package fr.campus.dungeonsndragons.npc;

public abstract class Enemy {

    //VARIABLES
    private String type;
    private int lifePoints;
    private int attackPower;


    //GETTERS AND SETTERS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Enemy(){

    }

}

