
public class Multadd {

    public static void multadd(double a, double b, double c) {
        double result = a*b + c;
        System.out.println (result);
    }

    public static void main(String[] args) {

        System.out.print ("The result of 1.0, 2.0, and 3.0 is: ");
        multadd(1.0, 2.0, 3.0);
        System.out.println();

        double a1 = Math.cos(Math.PI/4.0);
        double b1 = 1.0/2.0;
        double c1 = Math.sin(Math.PI/4.0);
        System.out.print ("sin(pi/4) + cos(pi/4)/2 = ");
        multadd (a1, b1, c1);
        System.out.println();

        double a2 = 1.0;
        double b2 = Math.log(10);
        double c2 = Math.log(20);
        System.out.print("log(10) + log(20) = ");
        multadd(a2, b2, c2);
        System.out.println();
    }

    public static void expSum(double x) {

        //
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1.0 - b);
        multadd(a, b, c);
        System.out.print("xe^(-x) + sqrt (1 - e^(-x) = ");
        System.out.println();
    }
}