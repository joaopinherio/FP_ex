/*Elaborar um programa para conjugar verbos regulares no presente, passado e futuro */

import java.util.Scanner;

public class desafio_a{

    public static void main(String args[]) {

        String nome1 = get_string(), nome2 = get_string(), nome3 = get_string();
        
        String fst_name = nome1, snd_name = nome1, trd_name = nome1;
             
        if(fst_name.compareTo(nome2) > 0) fst_name =  nome2;
        if(fst_name.compareTo(nome3) > 0) fst_name = nome3;

        if(trd_name.compareTo(nome2) < 0) trd_name = nome2;
        if(trd_name.compareTo(nome3) < 0) trd_name = nome3;

        if(fst_name.compareTo(nome2) == 0 && trd_name.compareTo(nome3) == 0){
            snd_name = nome1;
        } 
        if(fst_name.compareTo(nome1) == 0 && trd_name.compareTo(nome3) == 0){
            snd_name = nome2;
        }
        else snd_name = nome3;
 

        System.out.println("Nomes em ordem alfabetica: \n1: " + fst_name);
        System.out.println("2: " + snd_name);
        System.out.println("3: " + trd_name);
    
    }

    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um nome");
        return in.nextLine();
    }

}
