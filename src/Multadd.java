public class Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    public static double expSum(double x) {
        double eX = Math.exp(-x);
        double radical = Math.sqrt(1 - eX);
        return multadd(x * eX, radical, 0);
    }

    public static void main(String[] args) {
        double result = multadd(1.0, 2.0, 3.0);
        System.out.println("The result is: " + result);

            double result1 = multadd(Math.sin(Math.PI / 4), Math.cos(Math.PI / 4) / 2, 0);
            double result2 = multadd(Math.log10(10), Math.log10(20), 0);
            System.out.println("Let's do some logarithmic equations");
            System.out.println("The result of sin(pi/4) + cos(pi/4)/2 is: " + result1);
            System.out.println("The result of log10(10) + log10(20) is: " + result2);


            double result3 = expSum(1.0);
            System.out.println("The result of the using the expSum method is: " + result3);
        }
    }

