/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public interface TerminalInterface {

	/**
	 * Ask user's input again from the interface. 
	 */
	public String askAgain();

	/**
	 * Starts the interface.
	 */
	public void run();
}
