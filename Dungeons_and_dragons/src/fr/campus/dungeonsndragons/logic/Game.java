package fr.campus.dungeonsndragons.logic;

import fr.campus.dungeonsndragons.attributes.Chest;
import fr.campus.dungeonsndragons.attributes.HealingPotion;
import fr.campus.dungeonsndragons.attributes.Spell;
import fr.campus.dungeonsndragons.attributes.Weapon;
import fr.campus.dungeonsndragons.board.GameBoard;
import fr.campus.dungeonsndragons.db.DatabaseConnection;
import fr.campus.dungeonsndragons.players.Hero;
import fr.campus.dungeonsndragons.players.Warrior;
import fr.campus.dungeonsndragons.players.Wizard;

/**
 * The Game class represents the Dungeons and Dragons game logic. It manages player creation,
 * game board initialization, player movement, battles, and other game-related actions.
 */
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

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    //SETTERS
    public void setPosition(int position) {
        this.position = position;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }

    /**
     * Creates a new Game instance.
     */
    public Game() {

    }

    /**
     * Runs the Dungeons and Dragons game.
     */
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

            newhero.setAttackEquipment(new Weapon(0, "Wooden stick"));

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


        } else {
            //Make a new instance of a Hero
            newhero = new Wizard("placeholder");
            mainMenu.hero = newhero;
            newhero.setAttackEquipment(new Weapon(0, "Wooden stick"));
            newhero.setType("wizard");
            //And update it with the characteristics of a saved hero
            mainMenu.selectHero();
        }

        boolean doChest = mainMenu.randomChestChoice();
        if (doChest) {
            chest.randomChestCreation(newhero, this);
        }
        System.out.println(newhero);

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

    /**
     * Initializes the game board with an array of objects.
     */
    public void initBoard() {
        this.array = new Object[64];
    }

    /**
     * Simulates rolling a dice and returns the rolled value.
     *
     * @return The value rolled on the dice (1 to 6).
     */
    public int throwDice() {
        int rolledDice = (int) (Math.random() * 6 + 1);
        mainMenu.showDice(rolledDice);
        return rolledDice;
    }

    /**
     * Simulates rolling of a two-sided dice and returns the rolled value.
     *
     * @return The value rolled on the dice (1 to 2).
     */
    public int randomOneOrTwo() {
        int rolledDice = (int) (Math.random() * 2 + 1);
        return rolledDice;
    }

    /**
     * Generates random attack equipment for the hero (either a spell or a weapon).
     */
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
                    newhero.setAttackEquipment(new Weapon(2, "Morning Star"));
                } else {
                    newhero.setAttackEquipment(new Weapon(4, "Lightbringer"));
                }

                break;
        }
    }

    /**
     * Generates a random healing potion.
     *
     * @return A randomly generated healing potion (either "small" or "large")..
     */
    public HealingPotion randomHealingPotion() {
        switch (randomOneOrTwo()) {
            case 1:
                return new HealingPotion("small");
            case 2:
                return new HealingPotion("large");
        }
        return null;
    }

    /**
     * Uses a healing potion to restore the hero's life points.
     *
     * @param size The size of the healing potion (either "small" or "large").
     */
    public void useHealingPotion(String size) {
        if (size.equals("large")) {
            //Uses a large potion that restores 5 life points
            newhero.setLifePoints(5);
        } else {
            //Uses a small potion that restores 3 life points
            newhero.setLifePoints(3);
        }
    }


}
