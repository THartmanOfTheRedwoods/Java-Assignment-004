public class Multadd {

    public static double multAdd(double a, double b, double c) {

        return a * b + c;
    }

    public static double expSum(double x) {
        double exp1 = Math.exp(x);
        double exp2 = Math.exp(x);

        return multadd2(1.0, exp1, exp2);
    }

    private static double multadd2(double v, double exp1, double exp2) {
        return v;
    }

    public static void main(String[] args) {
        System.out.println(multAdd(1.0, 2.0, 3.0));
        double v = computeExpression1();
        System.out.println(v);
        double w = computeExpression2();
        System.out.println(w);
        double x = expSum(5);
        System.out.println(x);

    }

    //Had trouble implementing: $$\sin\left(\frac{\pi}{4}\right) + \frac{\cos\left(\frac{\pi}{4}\right)}{2}$$
    public static double computeExpression1() {
        double pi = Math.PI;
        double angle = pi / 4;

        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);

        double expressionValue = sinValue + (cosValue / 2);

        return expressionValue;
    }

    public static double computeExpression2() {
        double log10_10 = Math.log10(10);
        double log10_20 = Math.log10(20);

        double expressionValue = log10_10 + log10_20;

        return expressionValue;
    }

}
