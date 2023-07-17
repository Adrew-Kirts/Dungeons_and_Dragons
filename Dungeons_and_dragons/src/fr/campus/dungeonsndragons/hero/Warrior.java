package fr.campus.dungeonsndragons.hero;

public class Warrior extends Hero {

    public Warrior(String heroName) {
        super(heroName);
        randAttack();
        randLife();
    }
    public void randAttack() {
        int rolledDice = (int) (Math.random() * (11 - 5)) + 5;
        setAttackPower(rolledDice);
    }
    public void randLife() {
        int rolledDice = (int) (Math.random() * (11 - 5)) + 5;
        setLifePoints(rolledDice);
    }
}