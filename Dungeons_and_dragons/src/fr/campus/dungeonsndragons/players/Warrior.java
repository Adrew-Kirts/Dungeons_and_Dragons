package fr.campus.dungeonsndragons.players;

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
        int rolledDice = (int) (Math.random() * (19 - 10)) + 5;
        setLifePoints(rolledDice);
    }
}