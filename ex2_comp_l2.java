import java.util.Scanner;

public class ex2_comp_l2 {

    public static void main(String args[]) {
        
        int dia;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Escreva o numero equivalente a um dia da semana (1 a 7): ");
        dia = in.nextInt();
        
        if(dia == 1) System.out.println("domingo");
        else if (dia == 2) System.out.println("segunda");
        else if (dia == 3) System.out.println("terca");
        else if (dia == 4) System.out.println("quarta");
        else if (dia == 5) System.out.println("quinta");
        else if (dia == 6) System.out.println("sexta");
        else if (dia == 7) System.out.println("sabado");

        //System.out.println("teste" +a);
        
    }
}
