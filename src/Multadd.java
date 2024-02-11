public class Multadd {

    public static double multadd(double a, double b, double c){
        return a*b+c;
    }

    public static void main(String[] args) {
        double result = multadd(1.0, 2.0, 3.0);
        System.out.println("Result of Multadd (1.0, 2.0, 3.0): " + result);

        double sinCosValue = multadd(Math.sin(Math.PI / 4), 1 / Math.sqrt(2), 0);
        double logValue = multadd(Math.log10(10), 1, Math.log10(20));


        System.out.println("sin(π/4) + cos(π/4/2) = " + sinCosValue);
        System.out.println("log10(10) + log10(20) = " + logValue);
        double expSumValue = expSum(1.0);
        System.out.println("expSum(1.0) = " + expSumValue);
    }

    public static double expSum(double x) {
        double expPart = x * Math.exp(-x);
        double sqrtPart = Math.sqrt(1- Math.exp(-x));
    return multadd(x, Math.exp(-x), sqrtPart);
    }
}

