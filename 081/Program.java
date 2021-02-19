// 8.1 Nested class

// Write One Armed Bandit fruit slot game[1] which uses inner
// classes. Use following fruits and BAR. You're free to choose
// winning results.

//     lemon
//     cherry
//     banana
//     melon
//     orange
//     plume
//     bar

// [1] https://www.johnnybet.com/one-armed-bandit-games-1

public class Program {
    public static void main(String[] args) {
        Game game = new Game();
        // game.play(); // Plays only one round
        game.playUntilWins();
    }
}
