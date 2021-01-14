public class Program {
    public static void main(String[] args) {
        int height = 5;
        int i = 0;

        while (i < height) {
            String space = " ";
            String spaces = space.repeat(i);
            System.out.print(spaces);

            System.out.println("*");
            i++;
        }
    }
}