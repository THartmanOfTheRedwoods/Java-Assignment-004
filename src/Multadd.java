public class Multadd {

    public static double multadd(double a, double b, double c){
        return a * b + c;
    }

    public static double expSum(double x) {

        double term1 = multadd(x, Math.exp(-x), 0);

        double term2 = multadd(1, Math.sqrt(1 - Math.exp(-x)), 0);

        return multadd(1, term1, term2);

    }

    public static void main(String[] args){
        //test
        System.out.println(multadd(9.7,2.3,6.4));

        //sin(pi/4) + (cos(pi/4))/2
        System.out.println(multadd(Math.sin(Math.PI / 4), 1 / Math.sqrt(2), Math.cos(Math.PI / 4) / 2));

        //log10(10) + log10(20)
        System.out.println(multadd(1, Math.log10(10), Math.log10(20)));

        //xe^(-x) + sqrt(1 - e^(-x)) where x is 3.6
        System.out.println(expSum(3.6));
    }

}
