package fr.campus.dungeonsndragons.attributes;

import fr.campus.dungeonsndragons.players.Hero;
import fr.campus.dungeonsndragons.logic.Game;
import fr.campus.dungeonsndragons.logic.Menu

public class Chest {


    Game game;
    Hero hero;

    Menu menu;

    public void createChest() {

        int rolledDice = game.throwDice();

        //showdice menu
        menu.showDice(rolledDice);

        switch (rolledDice) {
            case 1:
                //pas de chance
                break;
            case 2:
                // something
                break;
            case 3:
                //something
                break;
            case 4:
                //pas de chance
                break;
            case 5:
                // something
                break;
            case 6:
                //something
                break;
        }


        if (hero.getType().equals("warrior")) {

        }
    }
}
