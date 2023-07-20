package fr.campus.dungeonsndragons.logic;

import fr.campus.dungeonsndragons.players.Hero;
import fr.campus.dungeonsndragons.players.Warrior;
import fr.campus.dungeonsndragons.players.Wizard;
import java.util.ArrayList;

public class Game {

    //VARIABLES
    private int position = 1;
    private Menu mainMenu;
    private Artwork artwork;
    Object[] array;

    ArrayList<Square> gameboard = new ArrayList<Square>();

    private Hero newhero;

    //GETTERS
    public int getPosition() {
        return this.position;
    }

    public Menu getMainMenu() {
        return mainMenu;
    }

    //SETTERS
    public void setPosition(int position) {
        this.position = position;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public Game() {

        boolean endOfGame = false;
        this.mainMenu = new Menu(this);
        this.artwork = new Artwork();

        boolean doCreateHero = mainMenu.heroCreation();

        if (doCreateHero) {

            String heroName = mainMenu.heroNameInput();
            String heroType = mainMenu.heroTypeInput();

            if (heroType.equals("warrior")) {
                newhero = new Warrior(heroName);
            } else if (heroType.equals("wizard")) {
                newhero = new Wizard(heroName);
            }

            //add a roll for an optional chest somewhere here

            newhero.setType(heroType);
            this.artwork.showType(heroType, heroName);

            System.out.println(newhero.toString());

        }
        boolean doStart = mainMenu.startGame();

        if (doStart) {
            initBoard();
        }
        artwork.diceArt();

        while (!endOfGame) {
            if (mainMenu.movePlayer() && position < array.length) {
                this.position += throwDice();

//                //Insert player into array
//                try {
//                    array[this.position] = this.newhero;
//                } catch (ArrayIndexOutOfBoundsException e){
//                    System.out.println("You fell off the board!! " + e.getMessage());
//                }

                if (position < array.length) {
                    this.mainMenu.givePosition();

                } else {
                    endOfGame = true;
                    artwork.winMessage();

                    //press a key to continue
                    mainMenu.continueGame();

                    //ask to restart game
                    boolean doRestart = mainMenu.restartGame();

                    if (doRestart) {
                        new Game();
                    }
                }
            }
        }
    }

    public void initBoard() {
        this.array = new Object[64];
    }

    public int throwDice() {
        int rolledDice = (int) (Math.random() * 6 + 1);
        mainMenu.showDice(rolledDice);
        return rolledDice;
    }


}
