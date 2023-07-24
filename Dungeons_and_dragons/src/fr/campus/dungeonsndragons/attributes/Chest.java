package fr.campus.dungeonsndragons.attributes;

import fr.campus.dungeonsndragons.players.Hero;
import fr.campus.dungeonsndragons.logic.Game;

public class Chest {


    public void randomChestCreation(Hero hero, Game game) {

        int rolledDice = game.throwDice();
        System.out.println(" --------------------------------------\n");

        if (hero.getType().equals("warrior") && rolledDice == 6) {
            System.out.println("You're getting an offensive equipment suited for a warrior and a large potion!");
            hero.setAttackEquipment(new Weapon(4, "Lightbringer"));
            hero.setHealingPotions(new HealingPotion("large"));
        }
        else if (hero.getType().equals("wizard") && rolledDice == 6){
            System.out.println("You're getting an offensive equipment suited for a wizard and a large potion!");
            hero.setAttackEquipment(new Spell(5, "Fireball"));
            hero.setHealingPotions(new HealingPotion("large"));
        }
        else if (rolledDice == 5){
            System.out.println("You're getting a random offensive equipment and a small potion!");
            game.randomAttackEquipment();
            hero.setHealingPotions(new HealingPotion("large"));
        }
        else if (rolledDice == 4){
            System.out.println("You're getting a random offensive equipment!");
            game.randomAttackEquipment();
        }
        else if (rolledDice == 3){
            System.out.println("You're getting a random healing potion!");
            hero.setHealingPotions(game.randomHealingPotion());
        }
        else {
            hero.setAttackEquipment(new Weapon(0, "Wooden stick"));
            System.out.println("Sorry, no luck!");
        }
    }
}
