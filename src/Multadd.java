public class Multadd {
    public static double multadd(double a, double b, double c){
        return a*b+c;
    }
    public static double expSum(double x) {
        double exp = Math.exp(-x);
        double sqrt = Math.sqrt(1 - exp);
        return multadd(x, exp, sqrt);
    }

    public static void main(String[] args) {
        // tests multadd by invoking it with a few simple parameters, like 1.0, 2.0, 3.0.
         double sum1= multadd(1.0,2.0,3.0);
        System.out.println("Result of multadd(1.0, 2.0, 3.0): "+sum1);

        // Calculate the expression: sin(pi/4) + cos(pi/4)/2
        double sinValue = Math.sin(Math.PI / 4);
        double cosValue = Math.cos(Math.PI / 4);
        double sum2 = multadd(1.0, sinValue, cosValue / 2);
        System.out.println("Result of sin(pi/4) + cos(pi/4)/2: " + sum2);

        // Calculate the expression: log10(10) + log10(20)
        double log10_10 = Math.log10(10);
        double log10_20 = Math.log10(20);
        double sum3 = multadd(1.0, log10_10, log10_20);
        System.out.println("Result of log10(10) + log10(20): " + sum3);

        // Calculate expSum for x = 1.0
        double expSumResult = expSum(1.0);
        System.out.println("Result of expSum(1.0): " + expSumResult);
    }
    }


