import java.util.Scanner;
import java.lang.Math;



public class ex1_comp {
    
    public static int WrongHour(int a){
        if(a>=24){
            System.out.println("Digite um valor coerente (menor que 24 horas)");
            return 0;
        }
        else{
            return 1;

        }
    }
    
    public static void main(String args[]) {
        
        int hour = 0, min = 0, sec = 0;
        
        int HSec = 0;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Preencha os dados do horario do ocorrido:");
        
        System.out.println("Horas: ");
        hour = in.nextInt();
        
        int i = WrongHour(hour);
        
        //System.out.print("te " + i);
        if(hour >= 24){
            while (i == 0){
            hour = in.nextInt();
            WrongHour(hour);
            if(hour<24){
                break;
            }
            }
        }
        
        System.out.print("Minutos: ");
        min = in.nextInt();
        
        System.out.print("Segundos: ");
        sec = in.nextInt();
        
        hour = ((hour * 60)*60);
        
        min = (min * 60);
        
        HSec = hour + min + sec;
        System.out.println("Horario do ocorrido em segundos: " + HSec);
        
        System.out.println("Faltam " + (86400 - HSec) + " segundos para o dia acabar");
        
    }
}
