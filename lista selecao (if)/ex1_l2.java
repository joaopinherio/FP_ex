import java.util.Scanner;


public class ex1_l2
{
    public static void main(String args[]){
    
        int idade;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe sua idade: ");
        idade = in.nextInt ();
        
        if(idade >= 18){
            System.out.println("Voce eh maior de idade");
        }else{
            System.out.println("Voce eh menor de idade");
        }
        
    

        
    }
}