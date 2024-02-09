/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 8, 2024
 *
 */
public class Multadd {
public static double multadd(double a, double b, double c){
    return a*b+c;
}
public static double expsum(double x){
    double exp1 = Math.exp(-x);
    double exp2 = Math.sqrt(1.0 - exp1);
    return multadd(x,exp1,exp2);
    }
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double sum = multadd(a,b,c);
        System.out.println(sum);
        // To test the multadd method with simple parameters.

        double sin = Math.sin(Math.PI/4);
        double cos = Math.cos(Math.PI/4)/2;
        double sumV2 = multadd(a,sin,cos);
        System.out.println(sumV2);
        // To compute sin(PI/4) + cos(Pi/4)/2

        double log1 = Math.log10(10);
        double log2 = Math.log10(20);
        double sumV3 = multadd(a,log1,log2);
        System.out.println(sumV3);
        // To compute log_10(10) + log_10(20)

        double x = 1.0;
        double expSum = expsum(x);
        System.out.println(expSum);
        // To compute xe^-x + sqrt 1-e^-x when x = 1.0


    }
}
