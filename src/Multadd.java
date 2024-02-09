import static java.lang.Math.*;


public class Multadd {
    public static void main(String[] args) {
        //  multadd with doubles a, b, and c
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double result1 = multadd(a, b, c);
        System.out.println(result1);

        // sin(pi/4) + cos(pi/4)/2

        double radians = PI / 4.0;
        double sinNum = sin(radians);
        double cosNum = cos(radians);
        double result2 = multadd(sinNum, 1.0, cosNum / 2.0);
        System.out.println(result2);

        //log10(10) + log10(20)
        double result3 = multadd(log10(10), 1.0,  log10(20));
        System.out.println(result3);

        //expSum
        double y = 2.0;
        double result4 = expSum(y);
        System.out.println(result4);

    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;

    }

    public static double expSum(double y) {
        double exp = exp(-y);
        double sqrt = sqrt(1 - exp);
        return multadd(y, exp, sqrt);
    }
}

