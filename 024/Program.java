public class Program {
    public static void main(String[] args) {
        Coordinate player = new Coordinate();
        Coordinate enemy = new Coordinate();

        int min = 0;
        int max = 100;

        player.setRandomPosition(min, max);
        enemy.setRandomPosition(min, max);
        System.out.println(player);
        System.out.println(enemy);

        player.origo();
        System.out.println(player);

        player.up(player.randomizeNumberInRange(min, max));
        player.right(player.randomizeNumberInRange(min, max));
        enemy.down(player.randomizeNumberInRange(min, max));
        enemy.left(player.randomizeNumberInRange(min, max));
        System.out.println(player);
        System.out.println(enemy);
    }
}
