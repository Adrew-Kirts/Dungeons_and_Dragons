package fr.campus.dungeonsndragons.logic;

public class Artwork {

    public void openingMenu(){
        System.out.println("___________________________________");
        System.out.println("|       .:.:.:.:.:.:.:.:.:.        |");
        System.out.println("| Welcome to Dungeons and Dragons! |");
        System.out.println("|    _.~\"~._.~\"~._.~\"~._.~\"~._     |");
        System.out.println("------------------------------------\n          Please choose: ");

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

    public void diceArt() {
        System.out.println("       .-------.    ______\n      /   o   /|   /\\     \\ \n     /_______/o|  /o " +
                "\\  o  \\ \n     | o     | | /   o\\_____\\ \n     |   o   |o/ \\o   /o    / \n     |     o |/   " +
                "\\ o/  o  / \n     '-------'     \\/____o/");
    }

    public void showType(String heroType, String heroName) {
        if (heroType.equals("warrior")) {
            System.out.print("  /\\\n" +
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

}
