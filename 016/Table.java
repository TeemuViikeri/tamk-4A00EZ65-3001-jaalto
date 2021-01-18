class Table {
    void multiplicationTable(int size) {
        System.out.print(" * |");

        for (int i = 1; i <= size; i++) {
            System.out.format("%3d", i);
        }

        System.out.println();
        System.out.println("-".repeat(3 + 1 + 3 * size));

        for (int i = 1; i <= size; i++) {
            System.out.format(" %d |", i);

            for (int j = 1; j <= size; j++) {
                System.out.format("%3d", i * j);
            }

            System.out.println();
        }
    }
}
