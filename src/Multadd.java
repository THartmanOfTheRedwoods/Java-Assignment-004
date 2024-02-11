import java.lang.Math;

public class Multadd {
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }
    public static double expSum(double x) {
        return multadd (x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        System.out.println(multadd(1.0,2.0,3.0));

        System.out.println(multadd(Math.sin(Math.PI/4), 1/2.0, Math.cos(Math.PI/4)));

        System.out.println(multadd(Math.log10(10), 1.0, Math.log10(20)));

        System.out.println(expSum(1.0));

    }
}
