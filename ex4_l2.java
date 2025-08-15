import java.util.Scanner;

public class ex4_l2
{
    public static void main(String args[]){
    
        double altura = 0;
        int sexo = 0;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe sua altura ");
        altura = in.nextDouble ();
        
        System.out.println("Informe seu sexo (feminino: 1, masculino: 2)");
        sexo = in.nextInt ();
        
        //System.out.println(+altura);
        
        if(sexo == 1){
            System.out.println("Seu peso ideal eh: " + ((62.1 * altura)-47));
        }
        if(sexo == 2){
            System.out.println("Seu peso ideal eh: " + ((72.7 * altura)-58));
        }
        
    }
}