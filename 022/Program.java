public class Program {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setType("led");

        Pen pen2 = new Pen();
        pen2.setType("led");

        // Outputs "pen1 equals pen2"

        if (pen1.equals(pen2)) {
            System.out.println("pen1 equals pen2");
        }
    }
}
