/*Faça um programa que lei um número indeterminado de palavras e informe qual 
delas possui o maior número de vogais. A condição de parada é quando for lida a palavra SAIR.*/

import java.util.Scanner;

public class ex3_string{

    public static void main(String args[]) {

        while(true){
            String word = get_string();
            if(word.equalsIgnoreCase("sair")) break;
            
            int vog_count = 0;
            String vog_aux = "AEIOUaeiou";
            for(int i = 0; i < word.length(); i++){
                char aux = word.charAt(i);
                if(vog_aux.indexOf(aux) != -1){
                    vog_count++;
                }
            }
            System.out.println("A palavra digitada tem: " +vog_count + " vogais");

        }
        
    }

    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um nome");
        return in.nextLine();
    }

}
