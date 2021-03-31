/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class MenuOptionException extends Exception {

    /**
     * Auto-generated serial version UID for serialization/deserialization.
     */
    private static final long serialVersionUID = 3575268706828682245L;

    /**
     * Thrown when user's menu input isn't what was asked.
     * 
     * @param message exception message shown
     */
    public MenuOptionException(String message) {
        super(message);
    }
}
