public class Multadd {
    public static void main(String[] args) {
        double a = 1.0;
        double b =2.0;
        double c = 3.0;
        double Mresult = multadd(a, b, c);
        System.out.println("1.Value=" + Mresult);
        double sin = Math.sin(Math.PI / 4);
        double placeHolder = 1.0;
        //used to keep take place/nullify of b in order to just add a and c
                double cos = Math.cos(Math.PI / 4) / 2.0;
               double value1 = multadd(sin, placeHolder, cos);
               System.out.println("2.Value=" + value1);
double logTerm1 = Math.log10(10);
        double logTerm2 = Math.log10(20);
        double value2 = multadd(logTerm1, placeHolder, logTerm2);
        System.out.println("3.Value=" + value2);
        double x = 6.0;
        //assigned number to x can be changed in order to calculate a different value
        double value3 = expSum(x);
        System.out.println("4.Value=" + value3);
    }
    public static double multadd(double a, double b, double c) {
        return a * b + c;
        // initial format
    }
    public static double expSum(double x) {
double two = Math.exp(-x);
double three = Math.sqrt(1 - Math.exp(-x));
return multadd(x, two, three);
    }
}
