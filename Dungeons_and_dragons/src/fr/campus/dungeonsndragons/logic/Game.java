package fr.campus.dungeonsndragons.logic;

import fr.campus.dungeonsndragons.hero.Hero;

public class Game {

    //VARIABLES
    private int position = 1;
    private Menu mainMenu;
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

        boolean doCreateHero = mainMenu.heroCreation();
        ;

        if (doCreateHero) {
            String heroName = mainMenu.heroNameInput();
            String heroType = mainMenu.heroTypeInput();

            this.newhero = new Hero(heroName, heroType);

            //set attack
            this.newhero.setAttackPower(randAttributes(heroType, "attack"));

            //set life points
            this.newhero.setLifePoints(randAttributes(heroType, "life"));
            ////
            mainMenu.showType(heroType, heroName);

            System.out.println(newhero.toString());
        }

        boolean doStart = mainMenu.startGame();

        if (doStart) {
            initBoard();
        }
        mainMenu.diceArt();

        while (!endOfGame) {
            if (mainMenu.movePlayer() && position < array.length) {
                this.position += throwDice();
                if (position < array.length) {
                    this.mainMenu.givePosition();
                } else {
                    endOfGame = true;
                    mainMenu.winMessage();

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

    public int randAttributes(String heroType, String attribute) {
        if (heroType.equals("wizard") && attribute.equals("attack")) {
            int rolledDice = (int) (Math.random() * (16 - 8)) + 8;
            return rolledDice;
        } else if (heroType.equals("wizard") && attribute.equals("life")) {
            int rolledDice = (int) (Math.random() * (7 - 3)) + 3;
            return rolledDice;
        } else {
            int rolledDice = (int) (Math.random() * (11 - 5)) + 5;
            return rolledDice;
        }

    }

}
