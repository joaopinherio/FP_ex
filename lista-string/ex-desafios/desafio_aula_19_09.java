import java.util.Scanner;

public class desafio_aula_19_09 {

    public static void main(String args[]) {
        
        Scanner in = new Scanner (System.in);

        //System.out.println("Escreva uma frase: ");
        //String frase = in.nextLine();

        String nome1 = "rafael", nome2 = "joao", nome3 = "mongo";

        //if(test.equals());

        int nome1_i = 0, nome2_i = 0, nome3_i = 0;

        String first_name = "";

        for(int i= 0; i < 1; i++){
            nome1_i = nome1.charAt(i); nome2_i = nome2.charAt(i); nome3_i = nome3.charAt(i);

            if(nome1_i == nome2_i)
            
            if(nome2_i < nome1_i) first_name = nome2;



            //System.out.println(+nome1_i+nome2_i+nome3_i);
        }

        System.out.println(first_name);

    }
}
