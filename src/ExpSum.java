public class ExpSum {

    public static double expSum(double x) {
        double eX = Math.exp(-x);
        double radical = Math.sqrt(1 - eX);
        return multadd(x * eX, radical, 0);
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static void main(String[] args) {
        double result = expSum(1.0);
        System.out.println("The result is: " + result);
    }
}
