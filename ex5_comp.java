import java.util.Scanner;
import java.lang.Math;


public class ex5_comp 
{
    public static void main(String args[]){
    
        int Tcost = 0, Nseats = 0;
        int pro =  0, MinOcup = 0;
        int show = 0;
        
        
        Scanner in = new Scanner (System.in);
        
        
        System.out.println("Custo total do show: ");
        Tcost = in.nextInt();
        
        System.out.println("Numero de poltronas no teatro: ");
        Nseats = in.nextInt();

        System.out.println("Percentual de lucro desejado: ");
        pro = in.nextInt();
        
        System.out.println("Percentual minimo de ocupacao esperado: ");
        MinOcup = in.nextInt();
        
        System.out.println("Quantidade de espetaculos que serao realizados: ");
        show = in.nextInt();
    }
}
