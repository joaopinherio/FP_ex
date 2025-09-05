/*Faça um programa que leia um número e mostre todo os seus
antecessores. */

import java.util.Scanner;

public class ex3_for {

    public static void main(String args[]) {
        
        int num;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        num = in.nextInt();

        for(int i = num - 1; i > 0; i--){
            System.out.println(i);
        }
        
    }
}
