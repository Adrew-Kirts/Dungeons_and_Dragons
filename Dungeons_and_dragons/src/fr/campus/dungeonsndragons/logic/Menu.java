package fr.campus.dungeonsndragons.logic;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    Game mainGame;


    public boolean startGame() {
        boolean choiceMade = false;
        Scanner myObj = new Scanner(System.in);
        String choice;

        while (!choiceMade) {
            System.out.println("___________________________________");
            System.out.println("|       .:.:.:.:.:.:.:.:.:.        |");
            System.out.println("| Welcome to Dungeons and Dragons! |");
            System.out.println("|    _.~\"~._.~\"~._.~\"~._.~\"~._     |");
            System.out.println("------------------------------------\n          Please choose: ");
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

    public boolean restartGame() {
        boolean choiceMade = false;
        Scanner myObj = new Scanner(System.in);
        String choice;

        while (!choiceMade) {
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
            System.out.println("___________________________________");
            System.out.println("|       .:.:.:.:.:.:.:.:.:.        |");
            System.out.println("| Welcome to Dungeons and Dragons! |");
            System.out.println("|    _.~\"~._.~\"~._.~\"~._.~\"~._     |");
            System.out.println("------------------------------------\n          Please choose: ");
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

    public void showType(String heroType, String heroName) {
        if (heroType.equals("warrior")) {
            System.out.print("  / \\\n" +
                    "  | |\n" +
                    "  |.|\n" +
                    "  |.|\n" +
                    "  |:|      __\n" +
                    ",_|:|_,   /  )\n" +
                    "  (Oo    / _I_\n" +
                    "   +\\ \\  || __|\n" +
                    "      \\ \\||___|\n" +
                    "        \\ /.:.\\-\\\n" +
                    "         |.:. /-----\\\n" +
                    "         |___|::oOo::|\n" +
                    "         /   |:<_T_>:|\n" +
                    "        |_____\\ ::: /\n" +
                    "         | |  \\ \\:/\n" +
                    "         | |   | |\n" +
                    "         \\ /   | \\___\n" +
                    "         / |   \\_____\\\n" +
                    "         `-'" +
                    "");
        } else {
            System.out.println("              _,-'|\n" +
                    "           ,-'._  |\n" +
                    " .||,      |####\\ |\n" +
                    "\\.`',/     \\####| |\n" +
                    "= ,. =      |###| |\n" +
                    "/ || \\    ,-'\\#/,'`.\n" +
                    "  ||     ,'   `,,. `.\n" +
                    "  ,|____,' , ,;' \\| |\n" +
                    " (3|\\    _/|/'   _| |\n" +
                    "  ||/,-''  | >-'' _,\\\\\n" +
                    "  ||'      ==\\ ,-'  ,'\n" +
                    "  ||       |  V \\ ,|\n" +
                    "  ||       |    |   \\\n" +
                    "  ||       |    \\    \\\n" +
                    "  ||       |     |    \\\n" +
                    "  ||       |      \\_,-'\n" +
                    "  ||       |___,,--\")_\\\n" +
                    "  ||         |_|   ccc/\n" +
                    "  ||        ccc/\n" +
                    "  ||                   ");
        }
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


        System.out.println("\nThrow the dice? [y or n]");
        choice = myObj.nextLine().toLowerCase();
        if (choice.equals("y")) {
            return true;
        } else if (choice.equals("n")) {
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
            System.out.println("Please type in \"y\" or \"n\"\n");
        }

        return false;
    }

    public void givePosition() {
        System.out.println("|   Player is on square " + this.mainGame.getPosition() + " out of " + this.mainGame.array.length + "   |");
        System.out.println("--------------------------------------");

    }

    public void showDice(int rolledDice) {
        System.out.println(Arrays.toString(diceArray[rolledDice]));
        System.out.println("--------------------------------------");
        System.out.println("|   You rolled a: " + rolledDice + "                   |");

    }

    public void diceArt() {
        System.out.println("       .-------.    ______\n      /   o   /|   /\\     \\ \n     /_______/o|  /o " +
                "\\  o  \\ \n     | o     | | /   o\\_____\\ \n     |   o   |o/ \\o   /o    / \n     |     o |/   " +
                "\\ o/  o  / \n     '-------'     \\/____o/");
    }

    public void winMessage() {
        System.out.println(
                "WWWWWWWW                           WWWWWWWWIIIIIIIIIINNNNNNNN        NNNNNNNNNNNNNNNN        NNNNNNNNEEEEEEEEEEEEEEEEEEEEEERRRRRRRRRRRRRRRRR   \n" +
                        "W::::::W                           W::::::WI::::::::IN:::::::N       N::::::NN:::::::N       N::::::NE::::::::::::::::::::ER::::::::::::::::R  \n" +
                        "W::::::W                           W::::::WI::::::::IN::::::::N      N::::::NN::::::::N      N::::::NE::::::::::::::::::::ER::::::RRRRRR:::::R \n" +
                        "W::::::W                           W::::::WII::::::IIN:::::::::N     N::::::NN:::::::::N     N::::::NEE::::::EEEEEEEEE::::ERR:::::R     R:::::R\n" +
                        " W:::::W           WWWWW           W:::::W   I::::I  N::::::::::N    N::::::NN::::::::::N    N::::::N  E:::::E       EEEEEE  R::::R     R:::::R\n" +
                        "  W:::::W         W:::::W         W:::::W    I::::I  N:::::::::::N   N::::::NN:::::::::::N   N::::::N  E:::::E               R::::R     R:::::R\n" +
                        "   W:::::W       W:::::::W       W:::::W     I::::I  N:::::::N::::N  N::::::NN:::::::N::::N  N::::::N  E::::::EEEEEEEEEE     R::::RRRRRR:::::R \n" +
                        "    W:::::W     W:::::::::W     W:::::W      I::::I  N::::::N N::::N N::::::NN::::::N N::::N N::::::N  E:::::::::::::::E     R:::::::::::::RR  \n" +
                        "     W:::::W   W:::::W:::::W   W:::::W       I::::I  N::::::N  N::::N:::::::NN::::::N  N::::N:::::::N  E:::::::::::::::E     R::::RRRRRR:::::R \n" +
                        "      W:::::W W:::::W W:::::W W:::::W        I::::I  N::::::N   N:::::::::::NN::::::N   N:::::::::::N  E::::::EEEEEEEEEE     R::::R     R:::::R\n" +
                        "       W:::::W:::::W   W:::::W:::::W         I::::I  N::::::N    N::::::::::NN::::::N    N::::::::::N  E:::::E               R::::R     R:::::R\n" +
                        "        W:::::::::W     W:::::::::W          I::::I  N::::::N     N:::::::::NN::::::N     N:::::::::N  E:::::E       EEEEEE  R::::R     R:::::R\n" +
                        "         W:::::::W       W:::::::W         II::::::IIN::::::N      N::::::::NN::::::N      N::::::::NEE::::::EEEEEEEE:::::ERR:::::R     R:::::R\n" +
                        "          W:::::W         W:::::W          I::::::::IN::::::N       N:::::::NN::::::N       N:::::::NE::::::::::::::::::::ER::::::R     R:::::R\n" +
                        "           W:::W           W:::W           I::::::::IN::::::N        N::::::NN::::::N        N::::::NE::::::::::::::::::::ER::::::R     R:::::R\n" +
                        "            WWW             WWW            IIIIIIIIIINNNNNNNN         NNNNNNNNNNNNNNN         NNNNNNNEEEEEEEEEEEEEEEEEEEEEERRRRRRRR     RRRRRRR");
    }

    String[][] diceArray = new String[][]{
            {
                    "+-------+",
                    "\n|        |",
                    "\n|        |",
                    "\n|        |",
                    "\n+--------+",
            },
            {
                    "+-------+",
                    "\n|        |",
                    "\n|   o    |",
                    "\n|        |",
                    "\n+--------+",
            },
            {
                    "+-------+",
                    "\n| o      |",
                    "\n|        |",
                    "\n|     o  |",
                    "\n+--------+",
            },
            {
                    "+-------+",
                    "\n| o      |",
                    "\n|   o    |",
                    "\n|     o  |",
                    "\n+--------+",
            },
            {
                    "+-------+",
                    "\n| o   o  |",
                    "\n|        |",
                    "\n| o   o  |",
                    "\n+--------+",
            },
            {
                    "+-------+",
                    "\n| o   o  |",
                    "\n|   o    |",
                    "\n| o   o  |",
                    "\n+--------+",
            },
            {
                    "+-------+",
                    "\n| o   o  |",
                    "\n| o   o  |",
                    "\n| o   o  |",
                    "\n+--------+",
            }
    };

    public Menu(Game game) {
        this.mainGame = game;
    }

}
