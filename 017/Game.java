import java.lang.Math;
import java.util.Arrays;

public class Game {
    void play() {
        String[] fruits = { "bar", "cherrie", "grape", "melon", "orange", "pear", "plum" };
        String[] items = new String[3];

        for (int i = 0; i < 3; i++) {
            int rand = (int) ((Math.random() * (6 - 0)) + 0);
            String fruit = fruits[rand];
            items[i] = fruit;
        }

        System.out.println(Arrays.toString(items));

        boolean allItemsAreSame = true;
        String firstItem = items[0];

        for (int i = 1; i < items.length && allItemsAreSame; i++) {
            if (items[i] != firstItem) {
                allItemsAreSame = false;
            }
        }

        if (allItemsAreSame) {
            System.out.println("CONGRATULATIONS, YOU WON !!");
        } else {
            System.out.println("Sorry, no win this time");
        }
    }
}
