import java.lang.Math;
import java.util.Arrays;

public class Game {
    String[] fruits = { "bar", "cherrie", "grape", "melon", "orange", "pear", "plum" };
    String[] slots = new String[3];

    private class WinningConditions {
        boolean checkIfWon() {
            boolean allItemsAreSame = true;
            String firstItem = slots[0];

            for (int i = 1; i < slots.length && allItemsAreSame; i++) {
                if (slots[i] != firstItem) {
                    allItemsAreSame = false;
                }
            }

            return allItemsAreSame;
        }
    }
    
    private class GamePrints {
        public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
        public static final String RED_BOLD = "\033[1;31m";    // RED
        public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
        public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
        public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
        public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
        public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
        public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

        void printResult(boolean result) {
            String print = (result == true) ? YELLOW_BOLD + "CONGRATULATIONS, YOU WON !!" : RED_BOLD + "Sorry, no win this time";
            System.out.println(print);
        }
    }

    void pullLever() {
        for (int i = 0; i < 3; i++) {
            int rand = (int) ((Math.random() * (6 - 0)) + 0);
            String fruit = fruits[rand];
            slots[i] = fruit;
        }

        System.out.println(GamePrints.GREEN_BOLD + Arrays.toString(slots));
    }

    void play() {
        pullLever();
        WinningConditions wc = new WinningConditions();
        GamePrints gp = new GamePrints();
        boolean result = wc.checkIfWon();
        gp.printResult(result);
    }

    void playUntilWins() {
        boolean gameIsOn = true;
        WinningConditions wc = new WinningConditions();
        GamePrints gp = new GamePrints();

        while (gameIsOn) {
            pullLever();
            boolean result = wc.checkIfWon();

            if (result) {
                gameIsOn = false;
            }

            gp.printResult(result);
        }
    }
}
