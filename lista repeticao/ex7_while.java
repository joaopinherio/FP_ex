/*Faça um programa que leia um número e conte quantos divisores tem esse
número. Imprimir na tela a quantidade final de divisores.*/

import java.util.Scanner;

public class ex7_while {

    public static void main(String args[]) {
        
        int num = 10;

        int aux = 1;
        int count = 0;
        while(aux <= num){
            if(num % aux == 0)count++;
            aux++;
        }

        System.out.println(count);
        
    }
    
}
