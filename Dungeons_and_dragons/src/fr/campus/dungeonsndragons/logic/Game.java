package fr.campus.dungeonsndragons.logic;

import fr.campus.dungeonsndragons.attributes.Chest;
import fr.campus.dungeonsndragons.attributes.HealingPotion;
import fr.campus.dungeonsndragons.attributes.Spell;
import fr.campus.dungeonsndragons.attributes.Weapon;
import fr.campus.dungeonsndragons.board.GameBoard;
import fr.campus.dungeonsndragons.board.Square;
import fr.campus.dungeonsndragons.db.DatabaseConnection;
import fr.campus.dungeonsndragons.players.Hero;
import fr.campus.dungeonsndragons.players.Warrior;
import fr.campus.dungeonsndragons.players.Wizard;

import java.util.ArrayList;

public class Game {

    //VARIABLES
    private int position = 1;
    private Menu mainMenu;
    private Artwork artwork;
    private Chest chest = new Chest();
    private GameBoard gameBoard;
    private HealingPotion healingPotion;
    private DatabaseConnection dbconnect = new DatabaseConnection();
    Object[] array;
    private Hero newhero;

    //GETTERS
    public int getPosition() {
        return this.position;
    }

    public Menu getMainMenu() {
        return mainMenu;
    }
    public GameBoard getGameBoard() {return gameBoard;}

    //SETTERS
    public void setPosition(int position) {
        this.position = position;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public Game() {

    }

    public void runGame() {

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
            mainMenu.hero = newhero;

            newhero.setType(heroType);
            this.artwork.showType(heroType, heroName);
            System.out.println(newhero);

            //insert new hero into db
            this.dbconnect.insertHero(newhero);

            //TODO:
            //TODELETE after verifying:
            dbconnect.getLastHero();

            //TODO
            //add menu continue or quit or restart game

            boolean doChest = mainMenu.randomChestChoice();
            if (doChest) {
                chest.randomChestCreation(newhero, this);
            }
            System.out.println(newhero);
        }

        boolean doStart = mainMenu.startGame();

        if (doStart) {
            initBoard();
            //choice of number of enemies
            int numberOfEnemies = mainMenu.enemyCountChoice();
            //new gameboard with choice
            gameBoard = new GameBoard(numberOfEnemies);

        }
        artwork.diceArt();

        while (!endOfGame) {
            if (mainMenu.movePlayer() && position < array.length) {
                this.position += throwDice();

                if (position < array.length) {
                    this.mainMenu.givePosition();

                } else {
                    endOfGame = true;
                    artwork.winMessage();

                    //press a key to continue
                    mainMenu.continueGame();

                    //ask to restart game
                    if (mainMenu.restartGame()) {
                        runGame();
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

    public int randomOneOrTwo() {
        int rolledDice = (int) (Math.random() * 2 + 1);
        return rolledDice;
    }

    public void randomAttackEquipment() {
        int oneOrTwo = randomOneOrTwo();
        switch (randomOneOrTwo()) {
            case 1:
                if (oneOrTwo == 1) {
                    newhero.setAttackEquipment(new Spell(2, "lightning bolt"));
                } else {
                    newhero.setAttackEquipment(new Spell(5, "fireball"));
                }
                break;

            case 2:
                if (oneOrTwo == 1) {
                    newhero.setAttackEquipment(new Weapon(2, "morning star"));
                } else {
                    newhero.setAttackEquipment(new Weapon(4, "lightbringer"));
                }

                break;
        }
    }

    public HealingPotion randomHealingPotion() {
        switch (randomOneOrTwo()) {
            case 1:
                return new HealingPotion("small");
            case 2:
                return new HealingPotion("large");
        }
        return null;
    }

}
