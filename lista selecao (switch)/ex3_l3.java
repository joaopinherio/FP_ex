import java.util.Scanner;

public class ex3_l3 {

    public static void main(String args[]) {
        
        double n1 = 10, n2 = 20, n3 = 30;
        int op;

        Scanner in = new Scanner (System.in);

        System.out.println("Selecione sua opcao de representacao: ");
        op = in.nextInt();

        double aux_min = 0;

        aux_min = Math.min(n1,n2);
        aux_min = Math.min(aux_min,n3);

        double aux_max = 0;

        aux_max = Math.max(n1,n2);
        aux_max = Math.max(aux_max,n3);

        double aux_rest = (n1 + n2 + n3) - aux_max - aux_min;

        //System.out.println(+aux_rest);

        switch (op){
            case 1:
            System.out.println("Ordem crescente: " + String.format("%.2f",aux_min ) + "; " + String.format("%.2f",aux_rest ) + "; " + String.format("%.2f",aux_max ));
            break;

            case 2:
            System.out.println("Ordem decrescente: " + String.format("%.2f",aux_max ) + "; " + String.format("%.2f",aux_rest ) + "; " + String.format("%.2f",aux_min ));
            break;

            case 3:
            System.out.println("Ordem maior entre: " + String.format("%.2f",aux_min ) + "; " + String.format("%.2f",aux_max ) + "; " + String.format("%.2f",aux_rest ));
            break;

            default:
            System.out.println("Um valor incompativel foi inserido");
            break;
        }
        
    }
}
