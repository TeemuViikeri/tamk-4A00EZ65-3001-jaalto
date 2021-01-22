public class Program {
    public static void main(String[] args) {
        Coordinate player = new Coordinate();
        Coordinate enemy = new Coordinate();
        System.out.println(player);
        System.out.println(enemy);

        int min = 0;
        int max = 100;

        player.setRandomPosition(min, max);
        enemy.setRandomPosition(min, max);
        System.out.println(player);
        System.out.println(enemy);
    }
}
