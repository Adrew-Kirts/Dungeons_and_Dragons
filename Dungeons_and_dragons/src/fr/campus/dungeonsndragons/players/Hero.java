package fr.campus.dungeonsndragons.players;

public abstract class Hero {

    //VARIABLES
    private String name;
    private String type;
    private int lifePoints;
    private int attackPower;


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

    //CONSTRUCTORS

    public Hero(){
    }

    public Hero(String heroName){

        name = heroName;
//        this.lifePoints = lifePoints;
//        this.attackPower = attackPower;
    }


    public Hero(String heroName, String heroType){
        this.name = heroName;
        this.type = heroType;

    }

    public String toString(){
        return "Your hero " + name + " has an attack power of " +
                attackPower + " and " + lifePoints + " life points.";
    }
}


