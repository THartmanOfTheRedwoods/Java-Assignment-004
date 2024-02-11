public class Multadd {
    public static double multadd (double a, double b,double c) {
        return a * b + c;
    }

    public static double expSum (double x){
        //use multadd to calculate xe^(-x) + sqrt(1 - e^(-x))
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }
    public static void main(String[] args) {
        // test multadd by passing arguments a: 1.0, b: 2.0, c: 3.0
        System.out.println(multadd(1.0, 2.0, 3.0));

        //Calculate sin(pi/4) + cos(pi/4)/2 using multadd
        System.out.println(multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4)));

        //Calculate log10(10) + log10(20) using multadd
        System.out.println(multadd(1, Math.log10(10), Math.log10(20)));

        //Calculate xe^(-x) + sqrt(1 - e^(-x)) where x = 2.5
        System.out.println(expSum(2.5));
    }
}