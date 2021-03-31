import java.lang.Math;
import java.util.Arrays;

/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class FruitSlots extends Game {

    /**
     * Symbols which will appear on the slot matchine in the game.
     */
    private String[] fruits = { "bar", "cherrie", "grape", "melon", "orange", "pear", "plum" };

    /**
     * Slot machine that will include the symbols.
     */
    private String[] slots = new String[3];

    /**
     * Inner class object that will handle checking if game was won.
     */
    private WinningConditions wc = new WinningConditions();

    /**
     * Default print handler for terminal text coloring and default prints.
     */
    private GamePrints gp = new GamePrints();

    /**
     * Constructor for giving a name to FruitSlots.
     * 
     * @param name name given to the game
     */
    public FruitSlots(String name) {
        setName(name);
    }

    /**
     * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
     * @version 2021.0331
     * @since 1.8
     */
    private class WinningConditions {
        /**
         * Checks if game was won by looking if all the symbols are all same in slots.
         * 
         * @return boolean value if the symbols were all same or not
         */
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

    /**
     * Randomly chooses three symbols to go in the slots.
     */
    void pullLever() {
        for (int i = 0; i < 3; i++) {
            int rand = (int) ((Math.random() * (6 - 0)) + 0);
            String fruit = fruits[rand];
            slots[i] = fruit;
        }

        try {
            printSlots(slots);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void play() {
        gp.printStart(this);
        pullLever();
        boolean result = wc.checkIfWon();
        gp.printResult(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void playUntilWins() {
        GamePrints prints = new GamePrints() {
            @Override
            void printStart(Game game) {
                System.out.println(blue() + "Let's play " + game + " until you win!");
            };

            @Override
            void printEnd() {
                System.out.println(blue() + "Welcome back to win next time!");
            }
        };

        prints.printStart(this);

        boolean hasNotWon = true;

        while (hasNotWon) {
            pullLever();
            boolean result = wc.checkIfWon();

            if (result) {
                hasNotWon = false;
            }

            prints.printResult(result);
        }

        prints.printEnd();
    }

    /**
     * Prints slots array with its symbols to console.
     * 
     * @param slots slots array which include game symbols
     * @throws IllegalArgumentException exception is thrown if array isn't size of
     *                                  three
     */
    void printSlots(String[] slots) throws IllegalArgumentException {
        if (slots.length != 3) {
            throw new IllegalArgumentException("Array should be size of three.");
        }

        System.out.println(gp.greener() + Arrays.toString(slots));
    }
}
