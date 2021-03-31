import java.util.List;
import java.util.Scanner;

/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class MenuInterface implements TerminalInterface {

	/**
	 * Games given to MenuInterface in main().
	 */
	private List<Game> games;

	/**
	 * Default print handler for terminal text coloring and default prints.
	 */
	private GamePrints prints = new GamePrints();

	/**
	 * Scanner object for user input.
	 */
	private Scanner sc = new Scanner(System.in);

	/**
	 * Game object that will be possibly chosen later.
	 */
	private Game chosenGame = null;

	/**
	 * Constructor for game interface.
	 * 
	 * @param games games to be shown on the menu
	 */
	public MenuInterface(List<Game> games) {
		this.games = games;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run() {
		System.out.println(prints.blue() + "Welcome to Game Hall!");
		System.out.println(prints.blue() + "We have following games for you to play:");

		games.forEach((game) -> {
			System.out.println(prints.green() + game);
		});

		askWhatGameToPlay();

		if (chosenGame == null) {
			return;
		}

		startGame();
	}

	/**
	 * Starts the chosen game with the game interface.
	 */
	private void startGame() {
		GameInterface gameInterface = new GameInterface(chosenGame);
		gameInterface.run();
	}

	/**
	 * Asks user what game they want to play.
	 */
	private void askWhatGameToPlay() {
		System.out.println(prints.white() + "Which game would you like to play? Enter game name.");
		String input = sc.nextLine();

		for (Game game : games) {
			if (input.equals(game.toString())) {
				chosenGame = game;
			}
		}

		if (chosenGame == null) {
			System.out.println(prints.white() + "Sorry, but you didn't choose an existing game.");

			String againInput = this.askAgain();

			try {
				if (againInput.equals("y")) {
					askWhatGameToPlay();
				} else if (againInput.equals("n")) {
					System.out.println(prints.blue() + "Closing down...");
				} else {
					throw new MenuOptionException(prints.white() + "Menu option was invalid: enter \"Y\" or \"N\"");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	/** 
	 * {@inheritDoc}
	 */
	@Override
	public String askAgain() {
		System.out.println(prints.white() + "Would you still like to choose a game [Y/N]?");
		String againInput = sc.nextLine();
		againInput = againInput.trim().toLowerCase();
		return againInput;
	}
}