
import java.util.Scanner;

public class ex4_comp {
    public static void main(String args[]){
    
        int ball, box = 0;
            
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o n de bolinhas: ");
        ball = in.nextInt();
        
        //if(ball >= 100){box++;}
        
        /*for(int  i = ball; i > 100; box++){
            i = i - 100;
        }*/

        int aux = 1, aux1 = 1;
        
        box = ball/100;
        aux = ball%100;
        aux1 = ball%100;



        aux = (aux+(aux * 1)) - aux;

        box += Math.min(aux, aux1);

        System.out.println(+aux);
        System.out.println(+aux1);
        
        System.out.println("N de caixas necessarias: " +box);
        
    }
}
