public class Multadd {
    public static double Multadd(double a, double b, double c) {
        return a*b+c;
    }

    public static double ExpSum(double x){
        double Exp1 = Math.exp(-x);
        double Exp2 = Math.sqrt(1.0 - Exp1);
        return Multadd(x, Exp1, Exp2);

    }

    public static void main(String[] args) {
        double result = Multadd(1.0, 2.0, 3.0);
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        System.out.println("result of multadd(1.0, 2.0, 3.0):" + result);

        double sinV = Math.sin(Math.PI/ 4);
        double cosV = Math.cos(Math.PI/ 4);
        double sum1 = Multadd(a,sinV,cosV / 2);
        System.out.println("result of sinV + cosV/2 : " + sum1);

        double log_10 = Math.log10(10);
        double log_20 = Math.log10(20);
        double sum2 = Multadd(1.0, log_10, log_20);
        System.out.println("result of log_10{10} + Log_10{20}: " + sum2);

        double x = 1.0;
        double ExpSum = ExpSum(x);
        System.out.println("result of ExpSum(x):" + ExpSum);
    }

}

