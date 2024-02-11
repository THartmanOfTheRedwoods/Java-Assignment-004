public class Multadd {
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }
public static double expSum(double e){
        return multadd(e, Math.exp(-e), Math.sqrt(1 - Math.exp(-e)));
}
    public static void main (String[] args) {
        double test = multadd(1.0, 2.0, 3.0);
        System.out.println("multadd test: " + test);
        double sinCos = multadd(Math.sin(Math.PI / 4), 1.0, Math.cos(Math.PI / 4) / 2);
        System.out.println("sinCos: " + sinCos);
        double log = multadd(Math.log10(10), 1, Math.log10(20));
        System.out.println("Log: " + log);
        double  expTest = expSum(3.0);
        System.out.println("expSum: " + expTest);
    }
}
