/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @version 1.0
 * @date 2-11-24
 */
public class Multadd {
    public static double multadd(double a, double b, double c) {
        return (a * b + c);
    }
    public static double expSum(double d) {
        return multadd (d, Math.exp(-d), Math.sqrt(1 - Math.exp(-d)));
    }
    public static void main(String[] args) {
        System.out.println (multadd(1.0, 2.0, 3.0));
        System.out.println (multadd(Math.sin(Math.PI / 4), 0.5, Math.cos(Math.PI / 4)));
        System.out.println (multadd(Math.log10(10), 1, Math.log10(20)));
        System.out.println (expSum(5.0));
    }
}