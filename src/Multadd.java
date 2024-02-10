// Austin Barnett
// 9/10/2018
// Version 1.0

public class Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));

        System.out.println(multadd(Math.sin(Math.PI / 4), 0.5, Math.cos(Math.PI / 4)));

        System.out.println(multadd(Math.log10(10), 1, Math.log10(20)));

        System.out.println(expSum(1.0));
    }
}
