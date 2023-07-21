package fr.campus.dungeonsndragons.npc;

public class Dragon extends Enemy{
    public Dragon() {
        setType("Dragon");
        randAttack();
        randLife();
    }

    public void randAttack() {
        int rolledDice = (int) (Math.random() * (6 - 3)) + 3;
        setAttackPower(rolledDice);
    }

    public void randLife() {
        int rolledDice = (int) (Math.random() * (16 - 13)) + 13;
        setLifePoints(rolledDice);
    }
}
