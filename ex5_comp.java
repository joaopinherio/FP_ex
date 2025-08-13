import java.util.Scanner;


public class ex5_comp 
{
    public static void main(String args[]){
    
        double Tcost = 1000, Nseats = 200;
        double pro =  30, MinOcup1 = 80, MinOcup2 = 50;
        int show = 0;
        
        double tic = 0;
        
        double costpro = 0, Useats1 = 0, Useats2= 0;
        
        
        Scanner in = new Scanner (System.in);
        
        for(int i = 0)
        
        /*System.out.println("Custo total do show: ");
        Tcost = in.nextInt();
        
        System.out.println("Numero de poltronas no teatro: ");
        Nseats = in.nextInt();

        System.out.println("Percentual de lucro desejado: ");
        pro = in.nextDouble();
        
        System.out.println("Percentual minimo de ocupacao esperado: ");
        MinOcup = in.nextDouble();
        
        System.out.println("Quantidade de espetaculos que serao realizados: ");
        show = in.nextInt();*/
        
        pro /= 100;
        MinOcup1 /= 100; //ao inves de var = var/100
        MinOcup2 /= 100; // MinOcup2/100;

        //custo mais o valor de lucro
        costpro = Tcost + (Tcost * pro);
        
        //assentos usados
        Useats1 = Nseats * MinOcup1;
        Useats2 = Nseats * MinOcup2;
        
        System.out.println("seats " + Nseats);
        System.out.println("valor com pro " + costpro);
        
        tic = costpro/Nseats;
        
        System.out.println("valor ticket " +tic);
        
    }
}
