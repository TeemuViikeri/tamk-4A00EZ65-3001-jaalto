import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = 0;

        do {
            System.out.print("How many objects would you like to create? ");

            amount = sc.nextInt();
            sc.nextLine();

            if (amount <= 0) {
                System.out.println("You should create more than zero objects");
            }
        } while (amount <= 0);
        System.out.println(amount);

        String names[] = new String[amount];
        Coordinate locations[] = new Coordinate[amount];

        for (int i = 0; i < amount; i++) {
            System.out.printf("----- Object #%d -----\n", i + 1);

            System.out.printf("Give me a name for Object #%d: ", i  + 1);
            names[i] = sc.nextLine();
            System.out.printf("Give me coordinates for %s...\n", names[i]);

            int[] objCoordinates = new int[3];

            for (int j = 0; j < objCoordinates.length; j++) {
                int coordinate = 0;
                do {
                    switch (j) {
                        case 0:
                            System.out.print("x: ");
                            break;
                        case 1:
                            System.out.print("y: ");
                            break;
                        case 2:
                            System.out.print("z: ");
                            break;
                    }

                    coordinate = sc.nextInt();
                    sc.nextLine();

                    if (coordinate < 0 || coordinate > 100) {
                        System.out.println("Coordinate should be between 0..100");
                    }

                    objCoordinates[j] = coordinate;
                } while (coordinate < 0 || coordinate > 100);
            }
            
            int x = objCoordinates[0];
            int y = objCoordinates[1];
            int z = objCoordinates[2];
            
            locations[i] = new Coordinate(x, y, z);
            
        }

        for (int i = 0; i < amount; i++) {
            System.out.printf("Location of %s at %s\n", names[i], locations[i]);
        }

        sc.close();
    }
}
