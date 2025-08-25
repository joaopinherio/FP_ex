
import java.util.Scanner;
import java.lang.Math;


public class ex2_comp
{
    public static double jnotas(double a, int b){
        Scanner in = new Scanner (System.in);
        b = (int)a;
        System.out.println("Nota do juiz " +b);
        a = in.nextDouble();
        
        return a;
    }
    
    public static void main(String args[]){
        
        double j1 = 1 , j2 = 2, j3 = 3, j4 = 4, j5 = 5, j6 =6;
        
        double notasB = 0;
            
        Scanner in = new Scanner (System.in);
        
        /*(System.out.println("Nota do juiz");
        
        a = in.nextdouble();*/
        int aux = 0;
        
        j1 = jnotas(j1, aux);
        j2 = jnotas(j2, aux);
        j3 = jnotas(j3, aux);
        j4 = jnotas(j4, aux);
        j5 = jnotas(j5, aux);
        j6 = jnotas(j6, aux);
        
        double[] vet_n = {j1, j2, j3, j4, j5, j6};
        double min_n = j1;
        
        for(int i = 0; i<=5; i++){
            if(vet_n[i] < min_n){
            min_n = vet_n[i];
            }
        }
        System.out.println("min: " + min_n);
        
        double max_n = j1;
        
         for(int i = 0; i<=5; i++){
            if(vet_n[i] > max_n){
            max_n = vet_n[i];
            }
        }
        System.out.println("max: " + max_n);
        
        double med_n = ((j1 + j2 + j3 + j4 + j5 + j6) - (max_n + min_n))/4;
        
        System.out.println("Nota da banca b: " + med_n);

    }

}