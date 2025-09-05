/*1) Faça um programa que leia uma nota no intervalo [0;10] (garantir isso). Verificar e
escrever o conceito correspondente conforme abaixo:
9 a 10 – A
7 a 8,9 – B
5 a 6,9 – C
3 a 4,9 – D
Abaixo de 3 – E*/

import java.util.Scanner;

public class ex1_meth {

    public static void main(String args[]) {

        Scanner key = new Scanner (System.in);

        System.out.println("Digite sua nota (0 - 10): ");

        double nota = key.nextDouble();

        if(nota < 0 || nota > 10) correcao(nota);

        System.out.println("Sua nota eh: " +grade(nota));
        
    }

    public static char grade(double n){
        if(n >= 9 && n <= 10) return 'A';
        if(n >= 7 && n < 9) return 'B';
        if(n >= 5 && n < 7) return 'C';
        if(n >= 3 && n < 5) return 'D';
        if(n < 3) return 'E';
        else return 'F';
    }

    public static void correcao(double n){
        System.out.println("Digite um numero compativel 0 - 10 ");
    }

}
