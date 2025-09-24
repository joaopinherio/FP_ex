/*
João Pinheiro de Paula e Rafael Inácio Ledur

 */

import java.util.Scanner;

public class trab_string{
    
    public static void main(String args[]) {

        String frase = get_string();
        int sub = get_int();
        Scanner in = new Scanner (System.in);
        
        for(int i = 0; i < sub; i++){

            String c_original = get_char1(i);
            String c_subst = get_char2();
            
            frase = frase.replace(c_original, c_subst);
        }
        
        System.out.println(frase);
    }
        
    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        return in.nextLine();
    }
    
    public static int get_int(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o numero de substituicoes desejadas: ");
        return in.nextInt();
    }

    public static String get_char1(int num){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o caracter a ser substituido (" + (num+1) +") :");
        return in.nextLine(); 
    }

    public static String get_char2(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o caractere substituto");
        return in.nextLine(); 
    }

}