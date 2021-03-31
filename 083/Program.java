import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = -5; i <= 5; i++) {
            list.add(i);
        }

        Comparable positive = (a) -> {
            if (a > 0) {
                System.out.println(a + " is positive");
            }
        };
        Comparable negative = (a) -> {
            if (a < 0) {
                System.out.println(a + " is negative");
            }
        };

        print(list, positive);
        print(list, negative);
    }

    @FunctionalInterface
    interface Comparable {
        void compare(int a);
    }

    public static void print(List<Integer> list, Comparable comparable) {
        for (Integer integer : list) {
            comparable.compare(integer);
        }
    }
}
