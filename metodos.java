import java.util.Scanner;

public class metodos {

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



    
}
