/**
 * @author Teemu Viikeri <teemu.viikeri@tuni.fi>
 * @version 2021.0331
 * @since 1.8
 */
public class GamePrints {
    
    /** 
     * Shell coloring: display text in red. 
     * 
     * @return String red color.
     */
    String red() {
        return "\033[1;31m";
    }

    
   /** 
     * Shell coloring: display text in green. 
     * 
     * @return String green color.
     */
    String greener() {
        return "\033[0;32m";
    };

    
    /** 
     * Shell coloring: display text in bold green. 
     * 
     * @return String bold green color.
     */
    String green() {
        return "\033[1;32m";
    }

    
    /** 
     * Shell coloring: display text in yellow. 
     * 
     * @return String yellow color.
     */
    String yellow() {
        return "\033[1;33m";
    }

    
    /** 
     * Shell coloring: display text in blue. 
     * 
     * @return String blue color.
     */
    String blue() {
        return "\033[1;34m";
    }

    
    /** 
     * Shell coloring: display text in white. 
     * 
     * @return String white color.
     */
    String white() {
        return "\033[0;37m";
    }

    
    /** 
     * Displays starting text to console.
     * 
     * @param game game currently playing
     */
    void printStart(Game game) {
        System.out.println(blue() + "Let's play " + game + "!");
    }

    
    /** 
     * Displays game result text to console.
     * 
     * @param result was game won or not
     */
    void printResult(boolean result) {
        String print = (result == true) ? yellow() + "CONGRATULATIONS, YOU WON !!" : red() + "Sorry, no win this time";
        System.out.println(print);
    }

    /** 
     * Displays ending text to console.
     */
    void printEnd() {
        System.out.println(blue() + "See you soon!");
    }
}
