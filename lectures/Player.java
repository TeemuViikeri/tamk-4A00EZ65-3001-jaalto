public class Player extends Coordinate {
    private String name;

    Player(String name, int x, int y) {
        super(x, y);
        this.name = name;
        initiate(x, y, name);
    }

    private void initiate(int x, int y, String name) {
        System.out.println("Initiating player '" + toString() + "' to coordinates " + getX() + ", " + getY() + "...");
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    } 

    @Override
    public String toString() {
        return this.getName();
    }
}