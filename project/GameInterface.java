import java.util.Scanner;

/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class GameInterface implements TerminalInterface {

	/**
	 * The game interface is showing to the user.
	 */
	Game game;

	/**
	 * Default print handler for terminal text coloring and default prints.
	 */
	GamePrints prints = new GamePrints();

	/**
	 * Scanner object for user input.
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * Constructor for game interface.
	 * 
	 * @param game game using this interface
	 */
	public GameInterface(Game game) {
		this.game = game;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run() {
		game.toggleGameIsOn();
		String input = this.askToPlay();

		while (game.isGameIsOn()) {
			try {
				if (input.equals("y")) {
					String playInput = this.askToPlaySingleOrLoop();

					try {
						if (playInput.equals("single")) {
							game.play();
						} else if (playInput.equals("loop")) {
							game.playUntilWins();
						} else {
							throw new PlayOptionException(
									prints.white() + "Play option was invalid: enter \"Single\" or \"Loop\"");
						}

						String againInput = this.askAgain();

						try {
							if (againInput.equals("y")) {
								continue;
							} else if (againInput.equals("n")) {
								this.closeInterface();
							} else {
								throw new PlayOptionException(
										prints.white() + "Play option was invalid: enter \"Y\" or \"N\"");
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (input.equals("n")) {
					this.closeInterface();
				} else {
					throw new PlayOptionException(prints.white() + "Play option was invalid: enter \"Y\" or \"N\"");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Asks user if they want to play the game.
	 * 
	 * @return String user's answer
	 */
	private String askToPlay() {
		System.out.println(prints.white() + "Would you like to play a game of " + game + " [Y/N]?");
		String input = sc.nextLine();
		input = input.trim().toLowerCase();
		return input;
	}

	/**
	 * Asks user if they want to a single game or loop until the game is won.
	 * 
	 * @return String user's answer
	 */
	private String askToPlaySingleOrLoop() {
		System.out.println(prints.white() + "Would you like to play a single game or loop until a game is won?");
		System.out.println(prints.white() + "Enter \"Single\" or \"Loop\"");
		String playInput = sc.nextLine();
		playInput = playInput.trim().toLowerCase();
		return playInput;
	}

	/**
	 * Asks user if they want to play again.
	 * 
	 * @return String user's answer
	 */
	public String askAgain() {
		System.out.println(prints.white() + "Would you like to play again [Y/N]?");
		String againInput = sc.nextLine();
		againInput = againInput.trim().toLowerCase();
		return againInput;
	}

	/**
	 * Closes the interface turns game off.
	 */
	private void closeInterface() {
		System.out.println(prints.white() + "Closing down...");
		game.toggleGameIsOn();
	}
}
