public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a*b+c;
    }

    public static double expsum(double x){
        double b = Math.exp(-x);
        double c = Math.sqrt(1-Math.exp(-x));
        return multadd(x,b,c);
    }

    public static void main(String[] args){
        //trig calculation
        double a1 = 1.0;
        double b1 = Math.sin(Math.PI/4);
        double c1 = (Math.cos(Math.PI/4))/2;
        double result1 = multadd(a1, b1, c1);
        System.out.println("result1 = " + result1);

        //log calculation
        double a2 = 1.0;
        double b2 = Math.log10(10);
        double c2 = Math.log10(20);
        double result2 = multadd(a2, b2, c2);
        System.out.println("result2 = " + result2);

        //exp calculation
        System.out.println(expsum(2.3));
    }
}
