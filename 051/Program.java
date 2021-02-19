public class Program {
    public static void main(String[] args) throws IllegalArgumentException {
        IntegerFixedStack ifs = new IntegerFixedStack(2);
        IntegerDynamicStack dfs = new IntegerDynamicStack(2);

        try {
            // IntegerFixedStack
            ifs.push(3);
            ifs.push(2);
            // ifs.push(1); // Throws an error
            ifs.pop();
            // IntegerDynamicStack
            dfs.push(3);
            dfs.push(2);
            dfs.push(1);
            ifs.pop();
            ifs.pop();
            ifs.pop();
            ifs.pop(); // Throws an error
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hi");
    }
}
