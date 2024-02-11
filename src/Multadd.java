public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static void main(String[] args) {
        // This next line isn't necessary, but I'm given to understand from googling it, that adding this as a constant helps with clarity and reliability.
        final double PI = Math.PI;
        double result1 = multadd(2.0, 4.0, 6.0);
        System.out.println("multadd(2.0, 4.0, 6.0) = " + result1);
        double result2 = multadd(1.5, 3.14, -2.7);
        System.out.println("multadd(1.5, 3.14, -2.7) = " + result2);
        double result3 = multadd(0.0, 10.0, 0.0);
        System.out.println("multadd(0.0, 10.0, 0.0) = " + result3);

        double sinPi4 = Math.sin(PI / 4);
        double cosPi4 = Math.cos(PI / 4);
        double log10_10 = Math.log10(10);
        double log10_20 = Math.log10(20);
        double formula1 = multadd(sinPi4, cosPi4 / 2, 0);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + formula1);
        double formula2 = multadd(log10_10, log10_20, 0);
        System.out.println("log10(10) + log10(20) = " + formula2);
        double x = 1.23;
        double expSumResult = expSum(x);
        System.out.println("expSum(" + x + ") = " + expSumResult);
    }

    public static double expSum(double x) {
        double expX = Math.exp(-x);
        double sqrtTerm = Math.sqrt(1 - expX);
        return multadd(x, expX, sqrtTerm);
    }
}