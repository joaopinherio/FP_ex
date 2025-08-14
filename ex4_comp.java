
import java.util.Scanner;
import java.lang.Math;


public class ex4_comp {
    public static void main(String args[]){
    
        int ball, box = 0;
            
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o n de bolinhas: ");
        ball = in.nextInt();
        
        if(ball >= 100){box++;}
        
        for(int  i = ball; i > 100; box++){
            i = i - 100;
        }
        
        System.out.println("N de caixas necessarias: " +box);
        
    }
}
