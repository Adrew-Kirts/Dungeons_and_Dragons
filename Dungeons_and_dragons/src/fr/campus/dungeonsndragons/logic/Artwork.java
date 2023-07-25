package fr.campus.dungeonsndragons.logic;

/**
 * This class represents the artwork for the game Dungeons and Dragons.
 */
public class Artwork {

    /**
     * Displays the opening menu artwork.
     */
    public void openingMenu(){
        System.out.println("___________________________________");
        System.out.println("|       .:.:.:.:.:.:.:.:.:.        |");
        System.out.println("| Welcome to Dungeons and Dragons! |");
        System.out.println("|    _.~\"~._.~\"~._.~\"~._.~\"~._     |");
        System.out.println("------------------------------------\n          Please choose: ");

    }
    /**
     * Displays the win message artwork.
     */
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
                    "          +-------+",
                    "\n          |        |",
                    "\n          |        |",
                    "\n          |        |",
                    "\n          +--------+",
            },
            {
                    "          +-------+",
                    "\n          |        |",
                    "\n          |   o    |",
                    "\n          |        |",
                    "\n          +--------+",
            },
            {
                    "          +-------+",
                    "\n          | o      |",
                    "\n          |        |",
                    "\n          |     o  |",
                    "\n          +--------+",
            },
            {
                    "          +-------+",
                    "\n          | o      |",
                    "\n          |   o    |",
                    "\n          |     o  |",
                    "\n          +--------+",
            },
            {
                    "          +-------+",
                    "\n          | o   o  |",
                    "\n          |        |",
                    "\n          | o   o  |",
                    "\n          +--------+",
            },
            {
                    "          +-------+",
                    "\n          | o   o  |",
                    "\n          |   o    |",
                    "\n          | o   o  |",
                    "\n          +--------+",
            },
            {
                    "          +-------+",
                    "\n          | o   o  |",
                    "\n          | o   o  |",
                    "\n          | o   o  |",
                    "\n          +--------+",
            }
    };

    /**
     * Displays artwork of a dice.
     */
    public void diceArt() {
        System.out.println("       .-------.    ______\n      /   o   /|   /\\     \\ \n     /_______/o|  /o " +
                "\\  o  \\ \n     | o     | | /   o\\_____\\ \n     |   o   |o/ \\o   /o    / \n     |     o |/   " +
                "\\ o/  o  / \n     '-------'     \\/____o/");
    }

    /**
     * Displays artwork of a chest.
     */
    public void showChest(){
        System.out.println("                              ████████████████████████████                              \n" +
                "                            ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██                            \n" +
                "                          ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██                          \n" +
                "                          ████████████████████████████████████                          \n" +
                "                          ██▓▓  ▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓  ▓▓██                          \n" +
                "                          ██▓▓  ▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓  ▓▓██                          \n" +
                "                          ████████████████████████████████████                          \n" +
                "                          ██▓▓  ██▒▒░░░░  ▒▒▒▒  ░░░░▒▒██  ▓▓██                          \n" +
                "                          ██▓▓  ██░░░░░░  ▒▒▒▒  ░░░░░░██  ▓▓██                          \n" +
                "                          ██▓▓  ██░░░░░░        ░░░░░░██  ▓▓██                          \n" +
                "                          ████████████████████████████████████ ");
    }

    /**
     * Displays artwork based on the hero type.
     *
     * @param heroType The type of the hero (e.g., "warrior" or "mage").
     * @param heroName The name of the hero.
     */
    public void showType(String heroType, String heroName) {
        if (heroType.equals("warrior")) {
            System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠤⢴⣾⣿⣿⣿⣯⠘⠳⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⡟⣾⣿⣿⣠⢠⣀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠒⢫⣿⣿⣿⣿⣿⣿⢸⡗⣾⣙⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣧⢮⡯⣷⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⡐⣚⣛⡛⠛⠉⢹⣽⣿⣽⠮⠓⣫⣏⠀⠀⣀⣀⣀⡀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⣴⠟⠋⠩⠉⢩⣷⣾⣿⣽⣷⣿⠤⢋⡥⠚⠳⣾⡏⠉⠉⠙⠻⢦⡀⠀⠀\n" +
                    "⠀⢀⡿⢁⠈⢀⡠⢔⣣⠟⠿⣿⣿⣿⣗⡪⠇⠀⣢⡾⠛⣮⡢⢄⡀⠐⡈⢻⡄⠀\n" +
                    "⢰⣾⠷⠥⠉⠑⡪⣽⠧⠀⠀⠨⡻⣟⣿⠀⣠⠞⡁⠀⠀⠚⣯⣇⡊⠉⠬⠾⣻⡆\n" +
                    "⢨⡿⠤⣆⣒⡬⠞⣿⡑⠀⠀⠀⠀⠈⢳⣞⠁⠀⠀⠀⠀⢁⣿⠳⢥⣒⣨⠤⢿⣅\n" +
                    "⢻⣿⣿⢋⠁⠀⢰⡇⠀⠀⠀⢠⢞⢿⣭⡍⢻⢦⡀⠀⠀⠀⢼⡇⠀⠈⠝⣿⣿⡟\n" +
                    "⠀⣹⡏⢀⣀⣀⣸⣇⣀⣀⣀⣘⣛⣾⢶⠿⠿⣷⣽⡟⠓⢲⠶⠧⢤⣀⡠⢸⣏⠀\n" +
                    "⢠⣿⡟⡿⡝⠀⠐⠀⠁⠈⠈⡽⠁⠀⢸⣓⣚⣿⣿⠧⣤⣄⡀⠀⠀⠈⣽⣧⣿⡀\n" +
                    "⠘⢷⣧⣿⢷⣤⣤⣴⡶⣶⣾⣷⢤⣤⢾⠭⢭⣿⣿⣿⣶⣭⣝⡛⠶⠶⣳⣼⣿⡇\n" +
                    "⠀⠀⠙⠛⠛⠚⠛⠛⣿⣿⣿⣿⣟⣷⡿⠓⠛⠻⠿⢿⠟⢿⠉⠛⠻⠯⠴⠶⠛⠁\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢠⣿⣽⡯⢿⣿⡟⠷⠶⢲⡖⠶⢼⣴⣾⣔⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢀⡾⠁⠈⠛⠷⣾⣧⠀⠀⢸⣶⢾⠛⠉⠔⢿⣂⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⣼⠍⠂⠀⢠⢣⣿⣷⠀⠄⢸⣿⡞⡄⠀⠀⡨⢷⠆⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢸⡣⣄⡀⠀⣎⣿⣿⣿⠀⡀⢺⣿⣿⡸⡀⢀⡰⢝⡧⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠉⠓⠮⠽⣼⠛⠿⠿⠤⠤⠿⠿⠛⢷⠯⠵⠚⠋⠀⠀⠀⠀⠀⠀");
        } else {
            System.out.println("                    ____\n" +
                    "                  .'* *.'\n" +
                    "               __/_*_*(_\n" +
                    "              / _______ \\\n" +
                    "             _\\_)/___\\(_/_\n" +
                    "            / _((\\- -/))_ \\\n" +
                    "            \\ \\())(-)(()/ /\n" +
                    "             ' \\(((()))/ '\n" +
                    "            / ' \\)).))/ ' \\\n" +
                    "           / _ \\ - | - /_  \\\n" +
                    "          (   ( .;''';. .'  )\n" +
                    "          _\\\"__ /    )\\ __\"/_\n" +
                    "            \\/  \\   ' /  \\/\n" +
                    "             .'  '...' ' )\n" +
                    "              / /  |  \\ \\\n" +
                    "             / .   .   . \\\n" +
                    "            /   .     .   \\\n" +
                    "           /   /   |   \\   \\\n" +
                    "         .'   /    b    '.  '.\n" +
                    "     _.-'    /     Bb     '-. '-._\n" +
                    " _.-'       |      BBb       '-.  '-.\n" +
                    "(___________\\____.dBBBb.________)____)");
        }
    }

    public void showUML(){
        System.out.println("        +--UML USE-CASE DIAGRAM:--+\n" +
                "        +-------------------------+\n" +
                "        |         Player          |\n" +
                "        +-------------------------+\n" +
                "        |                         |\n" +
                "        |  - Start Game           |\n" +
                "        |  - Select Hero          |\n" +
                "        |  - View Hero Info       |\n" +
                "        |  - Battle Monster       |\n" +
                "        |  - Use Healing Potion   |\n" +
                "        |  - Open Chest           |\n" +
                "        |  - Win Game             |\n" +
                "        +-------------------------+\n" +
                "         |   |   |   |   |   |   |\n" +
                "         |   |   |   |   |   |   |\n" +
                "         v   v   v   v   v   v   v\n" +
                "  +-----------------------------------+\n" +
                "  |              Game                 |\n" +
                "  +-----------------------------------+\n" +
                "  |                                   |\n" +
                "  |  + Begin Adventure                |\n" +
                "  |  + Choose Hero                    |\n" +
                "  |  + Inspect Hero                   |\n" +
                "  |  + Engage in Battle               |\n" +
                "  |  + Restore Health with Potion     |\n" +
                "  |  + Discover Chest and Contents    |\n" +
                "  |  + Achieve Victory and End Game   |\n" +
                "  +-----------------------------------+\n");
    }

}
