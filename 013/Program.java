class Program {
    public static void main(String[] args) {
        Formula f = new Formula();

        double weight = 81;
        double height = 1.77;

        double bmi = f.calculateBMI(weight, height);
        System.out.println(bmi);
    }
}
