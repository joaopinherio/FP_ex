import java.util.Scanner;

public class ex4_l3 {

    public static void main(String args[]) {
        
        double limit = 0;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe o saldo medio da sua conta corrente: ");
        double saldo = in.nextDouble();
        

        if(saldo < 500){
            limit = saldo;
        }
        else if (saldo >= 500 && saldo < 1000){
            limit = saldo * 0.08;
        }
        else{
            limit = saldo * 0.15;
        }

        System.out.println("Selecione uma operacao\n1: Saque\n2: Deposito\n3: Limite da conta");
        int op = in.nextInt();

        double saq = 0, depo = 0;
        
        switch (op){
            case 1:
                System.out.println("Informe o valor a ser sacado: ");
                saq = in.nextDouble();

                if(!(saq > 0 && saq <= limit)){
                    System.out.println("Valor de saque invalido: ");
                }
                else{
                    System.out.println("Saque efetuado! \nSaldo atual: " +(saldo - saq));
                }
                break;
            case 2:
                System.out.println("Informe o valor a ser depositado: ");
                depo = in.nextDouble();

                if(depo <= 0){
                    System.out.println("Valor de deposito invalido");                    
                }
                else{ 
                    System.out.println("Deposito efetuado! \nSaldo atual: " +(saldo + depo));
                }
                break;
            case 3:
                if(limit == saldo){
                    System.out.println("Sua conta nao possui limite");
                }
                else{
                    System.out.println("Seu limite eh: " + String.format("%.2f", limit));   
                }
                break;   
            }

        
    }
}
