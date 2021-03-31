public abstract class Game {

	/**
	 * Name of the game.
	 */
	protected String name;

	/**
	 * Flag to keep check if game is on.
	 */
	private boolean gameIsOn = false;

	/**
	 * Getter for name.
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name.
	 * 
	 * @param name name for game
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for flag.
	 * 
	 * @return boolean
	 */
	public boolean isGameIsOn() {
		return gameIsOn;
	}

	/**
	 * "Setter" that toggles flag.
	 */
	public void toggleGameIsOn() {
		this.gameIsOn = !this.gameIsOn;
	}

	/**
	 * Play a single game.
	 */
	public abstract void play();

	/**
	 * Play the game until game is won.
	 */
	public abstract void playUntilWins();

	/**
	 * Returns game's name as string representation of the object.
	 * 
	 * @return String name of the game
	 */
	@Override
	public String toString() {
		return name;
	}
}
