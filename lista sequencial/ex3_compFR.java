import java.util.Scanner;


public class ex3_compFR
{
        public static void main(String args[]){
    
        int Tcapac = 100, consump = 1, dist = 80;
        int refill = 0, cap_dist = 0;
        
        Scanner in = new Scanner (System.in);
        
        /*System.out.println("Digite o capacidade do tanque (litros): ");
        Tcapac = in.nextInt(); 
        
        System.out.println("Digite o consumo medio (km/litros): ");
        consump = in.nextInt();
        
        System.out.println("Digite a distancia a ser percorrida (km): ");
        dist = in.nextInt();*/
        
        int aux = 0;

        cap_dist = Tcapac * consump;

        System.out.println("distancia capaz "+cap_dist);

        refill = dist / cap_dist;

        aux = dist % cap_dist;

        System.out.println("1st calc refill "+refill);

        aux = (aux+(aux * 1)) - aux;
        
        refill += aux;
        
        System.out.println(+cap_dist);
        
        //System.out.println(+cap_dist);
        
        System.out.println("vezes: " +refill);
        
    }
}
