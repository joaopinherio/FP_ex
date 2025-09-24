/*"Faça um programa que leia o nome completo de uma pessoa e mostra a rubrica
da pessoa. Esta rubrica deve ser composta pelas iniciais do seu nome(s) e
sobrenome(s)"*/


import java.util.Scanner;

public class ex5_string{

    public static void main(String args[]) {

        //while(true){

            String word = get_string();
            String r_word = "";


            for(int i = word.length()-1; i >= 0; i--){
                //char aux = word.charAt(i);
                r_word += word.charAt(i);
            }

            System.out.println(r_word);
            
        }

    public static String get_string(){
        Scanner in = new Scanner (System.in);
        System.out.println("Digite uma palavra");
        return in.nextLine();
    }

}
