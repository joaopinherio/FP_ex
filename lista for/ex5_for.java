/*Implemente um programa que leia um valor inteiro, não negativo e
escreva o seu fatorial e seu somatório.*/

import java.util.Scanner;

public class ex5_for {

    public static void main(String args[]) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Digite um valor inteiro maior que 0: ");
        int num = in.nextInt();

        if(!(num > 0)){
            for(int i = 0, aux = 0; aux == 0; i++){
                System.out.println("Digite um valor positivo: ");
                num = in.nextInt();
                if(num > 0) aux ++;
            }
        }
        int fat_num = num;
        for(int i = num; i > 1; i--){
            fat_num *= (i - 1);
        }

        System.out.println("O numero digitado em fatorial eh: " + fat_num);
    }
}
