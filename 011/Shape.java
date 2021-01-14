public class Shape {
    public void fallingLines(int height, String symbol) {
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