package fr.campus.dungeonsndragons.logic;

import fr.campus.dungeonsndragons.hero.Hero;
import fr.campus.dungeonsndragons.hero.Warrior;
import fr.campus.dungeonsndragons.hero.Wizard;

public class Game {

    //VARIABLES
    private int position = 1;
    private Menu mainMenu;
    private Artwork artwork;
    Object[] array;

    Hero newhero;

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
                //Insert player into array:
                array[this.position] = this.newhero;

                if (position < array.length) {
                    this.mainMenu.givePosition();

                    //temp:
//                    System.out.println(array[this.position]);
                } else {
                    endOfGame = true;
                    artwork.winMessage();

                    //press a key to continue
                    mainMenu.continueGame();

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
