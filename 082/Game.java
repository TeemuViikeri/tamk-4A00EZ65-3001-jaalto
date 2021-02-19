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

    private class ColorPalette {
        String red() {
            return "\033[1;31m";
        }

        String green() {
            return "\033[1;32m";
        }

        String yellow() {
            return "\033[1;33m";
        }

        String blue() {
            return "\033[1;34m"; 
        }
    }

    private class GamePrints {
        ColorPalette palette = new ColorPalette();

        void printStart() {
            System.out.println(palette.blue() + "Let's play Fruits Slots!");
        }

        void printResult(boolean result) {
            String print = (result == true) ? palette.yellow() + "CONGRATULATIONS, YOU WON !!" : palette.red() + "Sorry, no win this time";
            System.out.println(print);
        }

        void printEnd() {
            System.out.println(palette.blue() + "See you soon!");
        }
    }

    void pullLever() {
        for (int i = 0; i < 3; i++) {
            int rand = (int) ((Math.random() * (6 - 0)) + 0);
            String fruit = fruits[rand];
            slots[i] = fruit;
        }

        ColorPalette palette = new ColorPalette() {
            @Override
            String green() {
                return "\033[0;32m";
            };
        };

        String color = palette.green();
        displaySlots(color);
    }

    void displaySlots(String color) {
        System.out.println(color + Arrays.toString(slots));
    }

    void play() {
        WinningConditions wc = new WinningConditions();
        GamePrints gp = new GamePrints();

        gp.printStart();
        pullLever();
        boolean result = wc.checkIfWon();
        gp.printResult(result);
    }

    void playUntilWins() {
        WinningConditions wc = new WinningConditions();

        GamePrints gp = new GamePrints() {
            ColorPalette palette = new ColorPalette();

            @Override
            void printStart() {
                System.out.println(palette.blue() + "Let's play Fruits Slots until you win!");
            };
            
            @Override
            void printEnd() {
                System.out.println(palette.blue()+ "Welcome back to win next time!");
            }
        };

        gp.printStart();
        boolean gameIsOn = true;

        while (gameIsOn) {
            pullLever();
            boolean result = wc.checkIfWon();

            if (result) {
                gameIsOn = false;
            }

            gp.printResult(result);
        }

        gp.printEnd();
    }
}
