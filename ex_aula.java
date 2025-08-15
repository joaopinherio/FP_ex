import java.util.Scanner;

public class ex_aula
{

    public static void main(String args[]){
        
        double p1 = 0 , p2 = 0, t1 = 0, t2 = 0, t3 = 0;
        
        double faltas = 0, presenca = 0;        
        
        String nome = "";
            
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe seu nome: ");
        nome = in.nextLine();
        
        System.out.println("Nota da prova 1: ");
        p1 = in.nextDouble();
        
        System.out.println("Nota da prova 2 ");
        p2 = in.nextDouble();
        
        System.out.println("Nota do trabalho 1 ");
        t1 = in.nextDouble();
        
        System.out.println("Nota do trabalho 2 ");
        t2 = in.nextDouble();
 
        System.out.println("Nota do trabalho 3 ");
        t3 = in.nextDouble();
        
        System.out.println("Numero de faltas ");
        faltas = in.nextDouble();
        
        double media_f = ((2*p1) + (2*p2) + t1 + t2 + t3)/5;
        
        System.out.println("Media final ponderada: " +media_f);
        
        double aux_min = 0;
        
        aux_min = Math.min(p1, p2);
        aux_min = Math.min(aux_min, t1);
        aux_min = Math.min(aux_min, t2);
        aux_min = Math.min(aux_min, t3);
        
        double aux_max = 0;
        
        aux_max = Math.max(p1, p2);
        aux_max = Math.max(aux_max, t1);
        aux_max = Math.max(aux_max, t2);
        aux_max = Math.max(aux_max, t3);
        
        System.out.println("A maior nota foi: " +aux_max);
        
        System.out.println("A menor nota foi: " +aux_min);
        
        System.out.println("Diferenca entre maior e menor: " +(aux_max - aux_min));
        
        System.out.println("Percentual final da media: " +media_f*10 +"%");
        
        presenca = ((50-faltas)*2);
        
        System.out.println("Presenca total do aluno: " +Math.abs(presenca) +"%");
        

    }


}