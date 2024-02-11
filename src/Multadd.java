public class Multadd {
    public static double multadd(double a, double b, double c){
        return a*b+c;
}
    public static double expsum(double x) {
        double part3 = multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
        return part3;
    }
    public static void main(String[] args){
        System.out.println(multadd(1.0,2.0,3.0));

        double part1 = multadd(Math.sin(Math.PI/4),1.0/2.0,Math.cos(Math.PI/4)/2);
        double part2 = multadd(Math.log10(10),1, Math.log10(20));
        double part3 = expsum(1);
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
    }

    }


