/*Faça um programa que lei um número indeterminado de palavras e informe qual 
delas possui o maior número de vogais. A condição de parada é quando for lida a palavra SAIR.*/

import java.util.Scanner;

public class ex3_string{

    public static void main(String args[]) {

        while(true){
            int vog = 0;
            String word = get_string();
            if(word.equalsIgnoreCase("sair")) break;

            String vog_aux = "AEIOUaeiou";
            for(int i = 0; i < word.length(); i++){
                //String aux = "" + word.charAt(i);

                //System.out.println(word);
                if(word.indexOf("AEIOUaeiou",i) != -1){
                    vog++;
                }
                System.out.println("A palavra digitada tem: " +vog + " vogais");
            }

        }
        

    }

    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um nome");
        return in.nextLine();
    }

}
