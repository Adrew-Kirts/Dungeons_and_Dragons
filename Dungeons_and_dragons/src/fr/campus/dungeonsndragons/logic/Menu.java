package fr.campus.dungeonsndragons.logic;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Game mainGame;
    Artwork artwork = new Artwork();

    public boolean startGame() {
        boolean choiceMade = false;
        Scanner myObj = new Scanner(System.in);
        String choice;

        while (!choiceMade) {
            System.out.println("          1. Start game");
            System.out.println("            2. Quit");
            choice = myObj.nextLine().toLowerCase();
            if (choice.equals("1")) {
                return true;
            } else if (choice.equals("2")) {
                System.out.println("Maybe next time!");
                System.exit(0);
                return false;
            } else {
                System.out.println("Please give a valid choice\n");
            }
        }
        return false;
    }

    public boolean continueGame() {
        System.out.println("\nPress enter to continue...");
        Scanner myObj = new Scanner(System.in);
        String choice;
        choice = myObj.nextLine().toLowerCase();
        if (choice.equals("")) {
            return true;
        }
        return false;
    }

    public boolean restartGame() {
        boolean choiceMade = false;
        Scanner myObj = new Scanner(System.in);
        String choice;

        while (!choiceMade) {
            artwork.openingMenu();
            System.out.println("\nWhat would you like to do now?");
            System.out.println("     1. Start a new game");
            System.out.println("          2. Quit");
            choice = myObj.nextLine().toLowerCase();
            if (choice.equals("1")) {
                return true;
            } else if (choice.equals("2")) {
                System.out.println("See you next time!");
                System.exit(0);
                return false;
            } else {
                System.out.println("Please give a valid choice\n");
            }
        }
        return false;
    }

    public boolean heroCreation() {
        boolean choiceMade = false;
        Scanner myObj = new Scanner(System.in);
        String choice;

        while (!choiceMade) {
            artwork.openingMenu();
            System.out.println("       1. Create character");
            System.out.println("            2. Quit");

            choice = myObj.nextLine().toLowerCase();
            if (choice.equals("1")) {
                return true;
            } else if (choice.equals("2")) {
                System.out.println("Maybe next time!");
                System.exit(0);
                return false;
            } else {
                System.out.println("Please give a valid choice\n");
            }
        }
        return false;
    }

    public String heroNameInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the name of your hero: ");
        String heroName = myObj.nextLine();

        return heroName;
    }

    public String heroTypeInput() {

        Scanner myObj = new Scanner(System.in);

        System.out.println("What type is your hero? [\"warrior\" or \"wizard\"]\n(or press \"q\" to quit)");
        boolean choiceMade = false;
        String heroType = null;

        heroType = myObj.nextLine().toLowerCase();
        if (heroType.equals("warrior")) {
            choiceMade = true;
            return heroType;
        } else if (heroType.equals("wizard")) {
            choiceMade = true;
            return heroType;
        } else if (heroType.equals("q")) {
            System.out.println("See you next time!");
            System.exit(0);
        } else {
            System.out.println("Please give a valid choice\n");
            heroTypeInput();
        }
        return heroType;
    }

    public boolean movePlayer() {
        Scanner myObj = new Scanner(System.in);
        String choice;
        String coward;
        boolean stop = false;

        System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x     Throw dice [d]     x");
        System.out.println("x Show player status [s] x");
        System.out.println("x     Quit game [q]      x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        choice = myObj.nextLine().toLowerCase();
        if (choice.equals("d")) {
            return true;
        }
        else if (choice.equals("s")){
            System.out.println(mainGame.newhero);
            return false;
        }

        else if (choice.equals("q")) {
            System.out.println("Frightened little one...");
            System.out.println("Do you want to quit the dungeon");
            System.out.println("[y or n]");
            coward = myObj.nextLine().toLowerCase();
            if (coward.equals("y")) {
                System.out.println("You get killed while leaving the dungeon");
                System.exit(0);
            } else if (coward.equals("n")) {
                return false;
            }
        } else {
            System.out.println("Please type in \"d\", \"s\", or \"q\"\n");
        }

        return false;
    }

    public void givePosition() {
        System.out.println("|   Player is on square " + this.mainGame.getPosition() + " out of " + this.mainGame.array.length + "   |");
        System.out.println(" --------------------------------------");

    }

    public void showDice(int rolledDice) {
        System.out.println(Arrays.toString(artwork.diceArray[rolledDice]));
        System.out.println(" --------------------------------------");
        System.out.println("|   You rolled a: " + rolledDice + "                    |");

    }



    public Menu(Game game) {
        this.mainGame = game;
    }


}
