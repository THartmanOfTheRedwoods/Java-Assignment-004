// import java.util.Scanner;
import java.lang.Math;

public class Multadd {
    public static double multadd(double a, double b, double c) {
        double result = a * b + c;
        return result;
    }
    public static double expSum(double x) {
        //$$xe^{-x} + \sqrt{1 - e^{-x}}$$
        double term1 = multadd(x, Math.exp(-x), 0);
        double term2 = Math.sqrt(1 - Math.exp(-x));
        double result4 = term1 + term2;
        return result4;
    }
    public static void main(String[] args) {
        double result1 = multadd(5.0, 2.0, 7.0);
        //$$\sin\left(\frac{\pi}{4}\right) + \frac{\cos\left(\frac{\pi}{4}\right)}{2}$$
        //$$\log_{10}(10) + \log_{10}(20)$$
        //Math.sin(Math.PI / {4}) + {Math.cos(Math.PI}{4})}{2}
        //Math.log {10}(10) + Math.log {10}(20)
        double result2 = Math.sin(Math.PI / 4.0) + Math.cos(Math.PI / 4.0) / 2.0;
        double result3 = Math.log10(10) + Math.log10(20);
        double result4 = expSum(2.0);
        System.out.println("Answer for result1 is " + result1);
        System.out.println("Answer for result2 is " + result2);
        System.out.println("Answer for result3 is " + result3);
        System.out.println("Answer for result4 is " + result4);
    }

}
