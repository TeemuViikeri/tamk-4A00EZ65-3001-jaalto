import java.lang.Math;

public class Coordinate {
    private double x;
    private double y;
    private double z;

    Coordinate() {
        x = 0;
        y = 0;
        z = 0;
    }

    Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
        z = 0;
    }

    Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int randomizeNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    void setRandomPosition(int min, int max) {
        setX(randomizeNumberInRange(min, max));
        setY(randomizeNumberInRange(min, max));
        setZ(randomizeNumberInRange(min, max));
    }

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    double getZ() {
        return z;
    }

    void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return getX() + ", " + getY() + ", " + getZ();
    }
}
