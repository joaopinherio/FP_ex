/*Elaborar um programa para conjugar verbos regulares no presente, passado e futuro */

import java.util.Scanner;

public class ex2_string_fail {

    public static void main(String args[]) {
        
        Scanner in = new Scanner (System.in);

        //System.out.println("Escreva uma frase: ");
        //String frase = in.nextLine();

        String nome1 = "rafael", nome2 = "joao", nome3 = "mongo";

        //if(test.equals());

        int nome1_i = 0, nome2_i = 0, nome3_i = 0;

        
        String fst_name = nome1;
        String snd_name = nome2;
        String trd_name = nome3;
        
        nome1_i = nome1.charAt(0); nome2_i = nome2.charAt(0); nome3_i = nome3.charAt(0);
        
        int less = nome_i;

        for(int i = 0; i < 2; i++){
            if(less < nome2_i) fst_name = nome2;
            if(less < nome3_i) fst_name = nome3;
   
            if(less < nome2_i) fst_name = nome2;
            if(less < nome3_i) fst_name = nome3;
        }

        
        
        
        for(int i= 0; i < 1; i++){
            nome1_i = nome1.charAt(i); nome2_i = nome2.charAt(i); nome3_i = nome3.charAt(i);
            
            //if(nome1_i == nome2_i)
            
            if(nome2_i < nome1_i) fst_name = nome2;
        

            //System.out.println(+nome1_i+nome2_i+nome3_i);
        }

        System.out.println(first_name);

    }
}
