package fr.campus.dungeonsndragons.attributes;

import fr.campus.dungeonsndragons.players.Hero;
import fr.campus.dungeonsndragons.logic.Game;
import fr.campus.dungeonsndragons.logic.Menu;
import fr.campus.dungeonsndragons.attributes.Weapon;

public class Chest {

    Game game;
    Hero hero;
    Menu menu;

    public void randomChestCreation() {

        int rolledDice = game.throwDice();

        menu.showDice(rolledDice);

        if (hero.getType().equals("warrior") && rolledDice == 6) {
            System.out.println("You're getting an offensive equipment suited for a warrior and a large potion");
            //warrior = weapon + shield
            new Weapon(4, "Lightbringer");
            //potion()
        }
        else if (hero.getType().equals("wizard") && rolledDice == 6){
            System.out.println("You're getting an offensive equipment suited for a wizard and a large potion");
            // wizard = spell + potiond
        }
        else if (rolledDice == 5){
            System.out.println("You're getting a random offensive and a small potion");
            //if 5 random off + def
        }
        else if (rolledDice == 4){
            System.out.println("You're getting a random offensive equipment");
            // 4 random off
        }
        else {
            System.out.println("Sorry, no luck!");
        }
    }
}
