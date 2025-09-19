/*Faça um programa que leia a altura de 6 alunos e ao final, escreva a maior altura. */

import java.util.Scanner;

public class ex6_while {
    public static void main(String args[]) {

        double maior_height = get_num();
        
        double aux = 0;
        double aux_height = 0;
        while(aux < 5){
            aux_height = get_num();

            if(aux_height > maior_height) maior_height = aux_height;
            aux++;
        }

        System.out.println("Maior altura dos alunos: " +maior_height);
    }
    
    public static double get_num(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a altura de um menino: ");
        double num = in.nextInt();

        return num;
    }

}
