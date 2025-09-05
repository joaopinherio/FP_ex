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
        double soma = 0;
        for(double i = 0, aux = 0; i < quant; i++){
            
            System.out.println("Digte o numero" + i + ": ");
            aux = in.nextDouble();

            if(aux % 2 == 0){
                par_count++;
                par_s += aux;
            }else{
                impar_count++;
                impar_s += aux;
            }
        }

        System.out.println(par_count);
        System.out.println(par_s);

        System.out.println(impar_count);
        
    }
}
