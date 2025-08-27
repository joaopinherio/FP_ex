package metodos;
import java.util.Scanner;

public class metodos {

    public static void main(String args[]) {
        
        double a = 40, b = 20;

        double result =  a_recta(a, b);

        System.out.println(+ result);
        
    }

    
    public static double extract_val(double a){
        Scanner in = new Scanner (System.in);

        int b = (int)a;
        System.out.println("Insira o valor de numero " +b);
        a = in.nextDouble();

        return a;
    }
    
    public static double lesser (double n1, double n2, double n3, double n4, double n5){
        double L = n1;
        
        if(n2 < L)L = n2;
        if(n3 < L)L = n3;
        if(n4 < L)L = n4;
        if(n5 < L)L = n5;

        return L;
    }
    
    public static double greater (double n1, double n2, double n3, double n4, double n5){
        double G = n1;
        
        if(n2 > G)G = n2;
        if(n3 > G)G = n3;
        if(n4 > G)G = n4;
        if(n5 > G)G = n5;

        return G;
    }

    public static double a_tri (double b, double h){
        return (b * h)/2;
    }

    public static double a_recta(double b, double h){
        return b * h;
    }

    public static double a_cir(double r){
        return Math.PI * Math.sqrt(r); // r * r
    }

    public static double v_recta(double l, double h, double w){
        return l * h * w;
    }

    public static double v_pyramid(double a_b, double h){
        return (1/3) * a_b * h ; 
    }

    public static double v_circle(double r){
        return 4 * Math.PI * Math.pow (r, 3);
    }

    public static double v_cilindro(double r, double h){
        double a_b = Math.PI * Math.sqrt(r);
        return a_b * h;
    }

    public static double sup_parale(double b, double w, double h){
        double a_b = b * w;
        return a_b * h;
    }

    public static double sup_pyramid(double b, double h){ // considerei que a base eh um quadrado
        double a_b = b * b;
        double a_l = (b * h) / 2;

        return a_b + (a_l * 4);
    }






    
}
