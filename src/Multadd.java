public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static void main(String[] args) {

        double result1 = multadd(1.0, 2.0, 3.0);
        System.out.println("Result of multadd(1.0, 2.0, 3.0): " + result1);

        double pi = Math.PI;
        double sinTerm = Math.sin(pi / 4);
        double cosTerm = Math.cos(pi / 4);
        double result2 = multadd(1.0, sinTerm, cosTerm / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2: " + result2);

        double logTerm1 = Math.log10(10);
        double logTerm2 = Math.log10(20);
        double result3 = multadd(1.0, logTerm1, logTerm2);
        System.out.println("log10(10) + log10(20): " + result3);

        double x = 1.0;
        double expTerm = Math.exp(-x);
        double result4 = expSum(x, expTerm);
        System.out.println("Result of expSum(1.0): " + result4);
    }

    public static double expSum(double x, double expTerm) {
        double term1 = multadd(x, expTerm, 0);
        double term2 = Math.sqrt(1 - expTerm);
        return multadd(term1, term2, 0);
    }
}
