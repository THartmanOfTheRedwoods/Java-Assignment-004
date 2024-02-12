public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double term = multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
        return term;
    }

    public static void main(String[] args) {
        double resultone = multadd(1.0, 2.0, 3.0);
        System.out.println("Result of multadd(1.0, 2.0, 3.0): " + resultone);

        double angle = Math.PI / 4;
        double resulttwo = multadd(Math.sin(angle), 1 / Math.sqrt(2), Math.cos(angle) / 2);
        System.out.println("Result of sin(π/4) + cos(π/4)/(2): " + resulttwo);

        double resultthree = multadd(Math.log10(10), 1, Math.log10(20));
        System.out.println("Result of logbase10(10) + logbase10(20): " + resultthree);

        double resultfour = expSum(1.0);
        System.out.println("Result of expSum(1.0): " + resultfour);
    }
}
