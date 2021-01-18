class Shape {
    public void leftL(int height, String symbol) {
        int i = 0;

        while (i < height) {
            if (i != height - 1) {
                String space = " ";
                String spaces = space.repeat(height - 1);
                System.out.print(spaces);
                System.out.println(symbol);
            } else {
                String symbols = symbol.repeat(height);
                System.out.println(symbols);
            }

            i++;
        }
    }
}