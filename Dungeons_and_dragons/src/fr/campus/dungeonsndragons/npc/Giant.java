package fr.campus.dungeonsndragons.npc;

public class Giant extends Enemy{
    public Giant() {
        setType("Giant");
        randAttack();
        randLife();
    }

    public void randAttack() {
        int rolledDice = (int) (Math.random() * (4 - 3)) + 3;
        setAttackPower(rolledDice);
    }

    public void randLife() {
        int rolledDice = (int) (Math.random() * (9 - 7)) + 7;
        setLifePoints(rolledDice);
    }
}
