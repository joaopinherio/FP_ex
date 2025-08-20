import java.util.Scanner;

public class ex4_comp_l2 {

    public static void main(String args[]) {
        
        int h_start = 0, min_start = 0, h_final = 15, min_final = 46;

        int h_dur = 0, min_dur = 0;

        int maxt = 0;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe a hora de comeca do jogo: ");
        h_start = in.nextInt();

        System.out.println("Informe o minuto dessa hora: ");
        min_start = in.nextInt();

        System.out.println("Informe a hora de encerramento do jogo: ");
        h_final = in.nextInt();

        System.out.println("Informe o minuto dessa hora: ");
        min_final = in.nextInt();


        //selecao > 24 horas de jogo
        if((h_start + h_final) > 48){
            System.out.print("O tempo de jogo ultrapassou 24 horas\n");
            h_dur = 24;
            min_dur = 0;
            maxt++;
        }        

        //selecao hora
        
        if(h_start > h_final && h_dur == 0){
            h_dur = (h_final + 24) - h_start;
        }
        if(h_start < h_final && h_dur == 0) h_dur = h_final - h_start;

        //selecao min

        if(min_start > min_final && maxt == 0){
            min_dur = (min_final + 60) - min_start;
            h_dur--;
        }
        if(min_start < min_final && maxt == 0) min_dur = min_final - min_start;

        
        System.out.println("Tempo de duracao do jogo: "+h_dur + " horas e " + min_dur + " minutos");
    }
}
