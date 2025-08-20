import java.util.Scanner;

public class ex5_l2
{
    public static void main(String args[]){
    
        double prod;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe seu custo de producao do produto: ");
        prod = in.nextDouble ();
        
        if(prod < 10)prod += (prod * 0.7);
        if(prod >= 10 && prod < 30)prod += (prod * 0.5);
        if(prod >= 30 && prod < 50)prod += (prod * 0.4);
        if(prod > 50)prod += (prod * 0.3);
        
        System.out.println("Valor do produto: " +prod);

        
    }
}