package fr.campus.dungeonsndragons.players;

public class Wizard extends Hero {

    public Wizard(String heroName) {
        super(heroName);
        randAttack();
        randLife();
    }

    public void randAttack() {
        int rolledDice = (int) (Math.random() * (21 - 8)) + 8;
        setAttackPower(rolledDice);
    }

    public void randLife() {
        int rolledDice = (int) (Math.random() * (16 - 8)) + 8;
        setLifePoints(rolledDice);
    }

}


