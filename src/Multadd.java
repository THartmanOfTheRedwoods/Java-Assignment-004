public class Multadd {

    public static void main(String[] args) {

        System.out.println("Testing multadd with simple parameters:");
        System.out.println("1.0 * 2.0 + 3.0 = " + multadd(1.0, 2.0, 3.0));

        double result1 = multadd(1.0, Math.sin(Math.PI/4), Math.cos(Math.PI/4)/2);
        double result2 = multadd(1.0, Math.log10(10), Math.log10(20));

        System.out.println("\nComputing specific expressions using multadd:");
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);
        System.out.println("log10(10) + log10(20) = " + result2);

        System.out.println("\nComputing using expSum method:");
        System.out.println("expSum(2.0) = " + expSum(2.0));
    }
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }
}
