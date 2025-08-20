import java.util.Scanner;

public class ex3_comp_l2 {

    public static void main(String args[]) {
        
        double temp = 0;
        int scale;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe a temperatura da agua: ");
        temp = in.nextDouble();

        System.out.println("Informe a escala da tempertura \n 1: Celsius \n 2: Fahrenheit ");
        scale = in.nextInt();

        if(scale == 2){
            temp = (temp - 32) * 5/9;
        }

        if(temp <= 0 ) System.out.println("Sua agua esta em estado solido");
        else if(temp > 0 && temp < 100) System.out.println("Sua agua esta em estado liquido");
        else System.out.println("Sua agua esta em estado gasoso");
        
    }
}
