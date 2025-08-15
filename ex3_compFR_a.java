import java.util.Scanner;


public class ex3_compFR
{
        public static void main(String args[]){
    
        int Tcapac = 100, consump = 1, dist = 1001;
        int refill = 0, cap_dist = 0;
        
        Scanner in = new Scanner (System.in);
        
        /*System.out.println("Digite o capacidade do tanque (litros): ");
        Tcapac = in.nextInt(); ca
        
        System.out.println("Digite o consumo medio (km/litros): ");
        consump = in.nextInt();
        
        System.out.println("Digite a distancia a ser percorrida (km): ");
        dist = in.nextInt();*/
        
        int aux = 0;

        cap_dist = Tcapac * consump;
        
        refill = (dist / cap_dist);
        
        System.out.println("vezes: " +refill);
        
    }
}