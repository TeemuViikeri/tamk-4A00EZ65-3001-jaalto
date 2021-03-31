import java.util.ArrayList;
import java.util.List;

/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class Program {
    
    /** 
     * Main method. Initializes games and runs menu with them.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        FruitSlots fruitSlots = new FruitSlots("Fruit Slots");
        CoinFlipper coinFlipper = new CoinFlipper("Flip-A-Coin");

        List<Game> games = new ArrayList<>();
        games.add(fruitSlots);
        games.add(coinFlipper);

        MenuInterface menu = new MenuInterface(games); 

        menu.run();
    }
}
