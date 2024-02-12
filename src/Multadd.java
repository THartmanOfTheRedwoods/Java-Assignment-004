public class Multadd {
    public static void  multadd(double a, double b, double c){
        double trig, logarithm,answer;
        answer=(a*b+c);
        System.out.println("The result of a*b+c is: "+ answer); //Computes the value of multadd
        trig=(Math.sin(Math.PI/4.0)+ (Math.cos(Math.PI/4.0))/2); //computed the value of the trigonometric equation
        logarithm=Math.log10(10.0)+Math.log10(20.0); //Computes the value of the logarithmic equation
        System.out.println("The result of the trigonometric equation sin(pi/4) + (cos(pi/4))/2 is: " + trig);
        System.out.println("The result of the logarithmic equation log(10)+log(20) is: "+logarithm);

    }
    public static void expSum(double x){
        double result;
       result=x*Math.exp(-x)+Math.sqrt(1-Math.exp(-x));
        System.out.println("The result of the exponential equation is: " +result); //computes the value of the exponential equation called from main
    }
    public static void main(String[] args) {
        multadd(1.0,2.0,3.0);
        expSum(1.0);

    }
}
