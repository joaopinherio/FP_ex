import java.util.Scanner;

public class ex6_l2 {

    public static void main(String args[]) {
        
        double saldo;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe o saldo medio da sua conta corrente: ");
        saldo = in.nextDouble();

        if(saldo < 500){
            System.out.println("Voce nao possui limite na conta");
        }
        else if (saldo >= 500 && saldo < 1000){
            System.out.println("Seu limite eh: " + String.format("%.2f", (saldo * 0.08)));
        }
        else{
            System.out.println("Seu limite eh: " + String.format("%.2f", (saldo * 0.15)));
        }
        
    }
}
