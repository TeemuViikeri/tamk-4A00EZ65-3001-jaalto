import java.lang.Math;

public class Circle {
    double area(int r) {
        return Math.round(Math.PI * Math.pow(r, 2) * 100.0) / 100.0;
    }
}
