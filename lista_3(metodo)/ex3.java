import java.util.Scanner;

//inspo ex1 switch
public class ex3 {

    public static void main(String args[]) {
        
        double num1 = 20, num2 = 10;

        calc(num1, num2);


    }

    public static void calc(double n1, double n2){

        Scanner in = new Scanner (System.in);
        
        System.out.println("Selecione uma operacao matematica \n adicao (1) \n subtracao: (2) \n multiplicacao (3) \n divisao (4) ");
        
        int op = in.nextInt();
        
        System.out.println("teste" +op);

        double result = 0;

        switch (op){
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("O valor inserido eh incompativel");
                break;
        }

        System.out.println("Sua resposta eh: " + String.format ("%.2f", result));
    }

}
