/*Faça um programa que calcule os 100 primeiros quadrados perfeitos
(números naturais): 0, 1, 4, 9 ,16. */

import java.util.Scanner;

public class ex2_for {

    public static void main(String args[]) {
        
        for(double i = 1; i < 101; i++){
            double r_i = Math.sqrt(i);
            if((r_i * r_i) == i && r_i - (int)r_i == 0) System.out.println(+i + " eh um quadrado perfeito");
        }
    }
}
