public class Multadd {
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }
    public static double expSum(double x) {
        double term1 = multadd(x, Math.exp(-x), 0);
        double term2 = multadd(1 - Math.exp(-x), 1, 0);
        return multadd(term1, term2, 0);
    }
    public static void main(String[] args){
        double answer = multadd(1.0,2.0,3.0);
        System.out.println(answer);
        double expression1 = multadd(Math.sin(Math.PI / 4), 1.0 / Math.sqrt(2), Math.cos(Math.PI / 4) / 2);
        double expression2 = multadd(Math.log10(10), 1, Math.log10(20));
        System.out.println(expression1);
        System.out.println(expression2);
    }
}



