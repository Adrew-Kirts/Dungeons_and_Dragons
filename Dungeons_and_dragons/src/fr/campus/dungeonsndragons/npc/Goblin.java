package fr.campus.dungeonsndragons.npc;

public class Goblin extends Enemy {

    public Goblin() {
        setType("Goblin");
        randAttack();
        randLife();
    }

    public void randAttack() {
        int rolledDice = (int) (Math.random() * (3 - 1)) + 1;
        setAttackPower(rolledDice);
    }

    public void randLife() {
        int rolledDice = (int) (Math.random() * (8 - 6)) + 6;
        setLifePoints(rolledDice);
    }
}