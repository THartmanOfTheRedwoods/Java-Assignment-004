public class Multadd {
    // Performs the MultAdd action
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    // Calculates ExpSum
    public static double expSum(double x) {
        double MinusX = Math.exp(-x);
        double first = multadd(x, MinusX, 0);
        double second = multadd(1, -MinusX, 0);
        return multadd(x, MinusX, Math.sqrt(second));
    }
    public static void main(String[] args) {
        // Testing multadd method
        double result1 = multadd(1.0, 2.0, 3.0);
        System.out.println("Testing multadd method:");
        System.out.println("1.0 * 2.0 + 3.0 = " + result1);
        // Gets the specified values using multadd
        double sincos = multadd(Math.sin(Math.PI / 4), 1 / Math.sqrt(2), 0);
        double logsum = multadd(Math.log10(10), Math.log10(20), 0);
        System.out.println("\nValues computed using multadd:");
        System.out.println("sin(pi/4) + cos(pi/4)/sqrt(2) = " + sincos);
        System.out.println("log10(10) + log10(20) = " + logsum);
        // Calculates expSum
        double expsum = expSum(1.0);
        System.out.println("\nValue of expSum(1.0) = " + expsum);

    }
}
