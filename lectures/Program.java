import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // Circle c = new Circle();
        // double area = c.area(2);

        // System.out.println(area);
        ArrayList<Player> players = new ArrayList<>();

        Player player = new Player("Teemu", 100, 100);
        players.add(player);
        System.out.println(players);
    }
}
