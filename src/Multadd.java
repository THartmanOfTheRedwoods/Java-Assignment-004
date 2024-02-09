/*
Quinn McKay
2/9/2024
Java Assignment 04
 */


public class Multadd {

    public static void multadd(double a, double b, double c, double pi4, double s, double co, double L10, double L20){

        System.out.println(a * b + c);
        System.out.println();
        System.out.println(s + co);
        System.out.println();
        System.out.println(L10 + L20);
        System.out.println();

        double x = 5.0;
        double g = Math.pow(x*Math.E, -x);
        double h = Math.sqrt(1 - Math.pow(Math.E, -x)); //I use 5.0 as my double for x
        expSum(x,g,h);
    }

    public static void expSum(double x, double g, double h){

        System.out.println(g + h);
    }


    public static void main(String[] args){

        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        double pi4 = (Math.PI / 4);
        double s = Math.sin(pi4);
        double co = (Math.cos(pi4) / 2);

        double L10 = Math.exp(Math.log10(10));
        double L20 = Math.exp(Math.log10(20));


        System.out.println("My answers for the equations listed are: ");
        System.out.println();
        multadd(a,b,c,pi4,s,co,L10,L20);






    }
}
