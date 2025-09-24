/*"Faça um programa que leia o nome completo de uma pessoa e mostra a rubrica
da pessoa. Esta rubrica deve ser composta pelas iniciais do seu nome(s) e
sobrenome(s)"*/


import java.util.Scanner;

public class ex4_string{

    public static void main(String args[]) {

        //while(true){
            
            String nome = get_string();
            
            /*String nomes [] = nome.split(" ");
            String nome1 = nomes [0];*/
            
            int blank_count = 0;
            String blank_aux = " ";
            
            for(int i = 0; i < nome.length(); i++){
                char aux = nome.charAt(i);
                if(blank_aux.indexOf(aux) != -1){
                    blank_count++;
                }
            }
            
            String full_nome [] = nome.split(" "); 
            String rub = "";
            
            for(int i = 0; i <= blank_count; i++){
                String nome_aux = full_nome [i];
                char initial = nome_aux.charAt(0);
                rub += initial;
            }

            System.out.println(rub.toUpperCase());

            //}

        }

    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um nome");
        return in.nextLine();
    }

}
