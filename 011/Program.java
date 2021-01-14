public class Program {
    public static void main(String[] args) {
        int height = 5;
        int i = 0;

        while (i < height) {
            for (int j = 0; j < i; j++) {
              System.out.print(" ");
            }
            
            System.out.println("*");
            i++;
        }
    }
}