import java.util.Scanner;
import java.lang.Math;


public class ex5_comp 
{
    public static void main(String args[]){
    
        double Tcost = 0, Nseats = 0;
        double pro = 0, MinOcup = 0;
        
        int show = 0;
        
        double ticket = 0;
        
        double costpro = 0, Useats = 0;
        
        Scanner in = new Scanner (System.in);


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
        
        System.out.println("Quantidade de espetaculos que serao realizados: ");
        show = in.nextInt();

        int aux = 0;

        for(int i = 1; i <= show; i++){
            System.out.println("Percentual minimo de ocupacao esperado do show " +i);
            MinOcup = in.nextDouble();
            aux += MinOcup;
        }

        MinOcup = aux/show;

        //System.out.println("media ocup " +MinOcup);
        
        pro /= 100;
        MinOcup /= 100;

        //custo mais o valor de lucro
        costpro = Tcost + (Tcost * pro);
        
        //assentos usados
        Useats = Nseats * MinOcup;
        
        /*System.out.println("used seats " + Useats);
        System.out.println("valor com pro " + costpro);*/
        
        ticket = costpro/Useats;
        
        System.out.printf("Valor do ingresso: %.2f%n", ticket);
        
        System.out.println("Percentual minimo de ocupacao esperado: ");
        MinOcup = in.nextInt();
        
        System.out.println("Quantidade de espetaculos que serao realizados: ");
        show = in.nextInt();
    }
}
