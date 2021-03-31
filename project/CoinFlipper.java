import java.util.Random;
import java.util.Scanner;

/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class CoinFlipper extends Game {

	/**
	 * Default print handler for terminal text coloring and default prints.
	 */
	GamePrints gp = new GamePrints();

	/**
	 * Random number generator for coin flipping.
	 */
	Random random = new Random();

	/**
	 * Scanner object for user input.
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * Constructor for giving a name to CoinFlipper.
	 * 
	 * @param name name given to the game
	 */
	public CoinFlipper(String name) {
		setName(name);
	}

	/**
	 * Asks user for an input to choose Heads or Tails
	 * 
	 * @return String user's choice
	 */
	private String headsOrTails() {
		System.out.println(gp.blue() + "Heads or Tails?");
		String choice = sc.nextLine().trim();
		choice = choice.substring(0, 1).toUpperCase() + choice.substring(1).toLowerCase();

		return choice;
	}

	/**
	 * Demonstrates flipping a coin which results in Heads or Tails.
	 * 
	 * @param choice user's choice done beforehand this method
	 * @return String randomly flipped Heads or Tails
	 */
	private String flipCoin(String choice) {
		try {
			System.out.println(gp.green() + "You chose " + choice);
			Thread.sleep(500);
			System.out.println(gp.blue() + "The flip resulted in...");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int value = random.nextInt(2);
		String flip = (value == 0) ? "Heads" : "Tails";
		System.out.println(gp.blue() + flip + "!");
		return flip;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void play() {
		gp.printStart(this);
		String choice = headsOrTails();

		if (choice.equals("Heads") || choice.equals("Tails")) {
			String flip = flipCoin(choice);
			if (choice.equals(flip)) {
				gp.printResult(true);
			} else {
				gp.printResult(false);
			}
		} else {
			System.out.println(gp.white() + "You didn't choose \"Heads\" or \"Tails\". Choose either one.");
			play();
		}
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
				System.out.println(blue() + "Remember that you are always welcome to flip some coins again!");
			}
		};

		prints.printStart(this);

		boolean hasNotWon = true;

		String choice = headsOrTails();

		while (hasNotWon) {
			boolean result = false;

			if (choice.equals("Heads") || choice.equals("Tails")) {
				String flip = flipCoin(choice);
				if (choice.equals(flip)) {
					result = true;
				}
			} else {
				System.out.println(gp.white() + "You didn't choose \"Heads\" or \"Tails\". Choose either one.");
				play();
			}

			if (result) {
				hasNotWon = false;
			}

			prints.printResult(result);
		}

		prints.printEnd();
	}
}