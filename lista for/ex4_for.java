/*Faça um programa que leia uma quantidade não determinada de
números positivos. Calcule a quantidade de números pares e
ímpares, a média de valores pares e a média geral dos números lidos.
O número que encerrará a leitura será zero. */

import java.util.Scanner;

public class ex4_for {

    public static void main(String args[]) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de numero que vao ser digitados:" );
        int quant = in.nextInt();

        int par_count = 0;
        double par_s = 0;
        
        int impar_count = 0;
        double impar_s = 0;

        for(double i = 0, aux = 0; i < quant; i++){
            
            System.out.print("Digte o numero" + i + ": ");
            aux = in.nextDouble();

            if(aux % 2 == 0){
                par_count++;
                par_s += aux;
            }else{
                impar_count++;
                impar_s += aux;
            }
        }

        System.out.println("Quantidade de numeros pares: " + par_count);
        System.out.println("Quantidade de numeros impares: " + impar_count);

        System.out.println("Media dos numero pares digitados: " + (par_s/par_count));
        System.out.println("Media geral dos numeros lidos: "+(par_s + impar_s)/quant);
        
    }
}
