import java.util.Scanner;

public class ex1_l3 {

    public static void main(String args[]) {
        
        double n1 = 20, n2 = 10;

        double answer = 0;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Selecione uma operacao matematica \n adicao (1) \n subtracao: (2) \n multiplicacao (3) \n divisao (4) ");
        int op = in.nextInt();
        
        System.out.println("teste" +op);

        switch (op){
            case 1:
                answer = n1 + n2;
                break;
            case 2:
                answer = n1 - n2;
                break;
            case 3:
                answer = n1 * n2;
                break;
            case 4:
                answer = n1 / n2;
                break;
            default:
                System.out.println("O valor inserido eh incompativel");
                break;
        }

        System.out.println("Sua resposta eh: " + String.format ("%.2f", answer));
    }
}
