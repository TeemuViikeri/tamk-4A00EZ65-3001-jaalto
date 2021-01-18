import java.lang.Math;

class Formula {
    public double calculateBMI(double weight, double height) {
        double bmi;

        bmi = weight / Math.pow(height, 2);
        bmi = Math.round(bmi * 10.0) / 10.0;

        return bmi;
    }
}
