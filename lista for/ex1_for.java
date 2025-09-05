/*Faça um programa que informe o número de alunos de uma turma e
calcule a média do exercício de avaliação 1 dos alunos*/
import java.util.Scanner;

public class ex1_for {

    public static void main(String args[]) {
        
        double soma = 0;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Numero de alunos: ");
        int alunos = in.nextInt();

        for(int i = 1; i <= alunos; i++){

            System.out.println("Digite a nota da prova do aluno " + i + ": ");
            soma += in.nextDouble();
        }

        System.out.println("A media da prova dos alunos eh:" +(soma/alunos));
        
    }
}
