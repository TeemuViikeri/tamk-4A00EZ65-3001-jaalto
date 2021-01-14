public class Program {
    public static void main(String[] args) {
        int height = 5;
        shape(height, "*");
    }

    public static void shape(int height, String symbol) {
        int i = 0;

        while (i < height) {
            String space = " ";
            String spaces = space.repeat(i);
            System.out.print(spaces);

            System.out.println(symbol);
            i++;
        }
    }
}