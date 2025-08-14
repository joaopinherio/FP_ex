import java.util.Scanner;
import java.lang.Math;


public class ex3_comp 
{
    
        public static void main(String args[]){
    
        int Tcapac = 0, consump = 0, dist = 0;
        int refill = 1, cap_dist = 0;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o capacidade do tanque (litros): ");
        Tcapac = in.nextInt(); 
        
        System.out.println("Digite o consumo medio (km/litros): ");
        consump = in.nextInt();
        
        System.out.println("Digite a distancia a ser percorrida (km): ");
        dist = in.nextInt();
        
        
        if(refill == 1){
            cap_dist = Tcapac * consump;
        }
        
        System.out.println(+cap_dist);
        
        for(int i= cap_dist; i < dist; refill++){
            i = i + cap_dist;
        }
        
        System.out.println(+cap_dist);
        
        /*if(cap_dist < dist){    
           while(cap_dist <= dist){
               cap_dist = cap_dist + cap_dist;
               refill++;
               if(cap_dist > dist){
                   break;
               }
           }

        }*/

        System.out.println("vezes: " +refill);
        
    }
}
