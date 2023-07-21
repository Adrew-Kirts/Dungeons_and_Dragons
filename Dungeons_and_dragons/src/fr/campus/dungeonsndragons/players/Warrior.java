package fr.campus.dungeonsndragons.players;

import fr.campus.dungeonsndragons.db.DatabaseConnection;

public class Warrior extends Hero {

    public Warrior(String heroName) {
        super(heroName);
        randAttack();
        randLife();
    }
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (15 - 5)) + 5;
        setAttackPower(rolledDice);
    }
    public void randLife() {
        int rolledDice = (int) (Math.random() * (19 - 10)) + 10;
        setLifePoints(rolledDice);
    }

    public void insertIntoDB(){
        DatabaseConnection.insertHero("Hero1", "Wizard", 15, 10);
    }

}