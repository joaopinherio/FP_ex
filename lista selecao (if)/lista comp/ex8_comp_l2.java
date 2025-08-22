import java.util.Scanner;

public class ex8_comp_l2 {

    public static void main(String args[]) {
        
        double n1 = 20, n2 = 30, n3 = 300, n4 = 40;

        Scanner in = new Scanner (System.in);

        double min1 = 0, min2 = 0, max1 = 0, max2 = 0;

        double aux_min = 0;

        aux_min = Math.min(n1,n2);
        aux_min = Math.min(aux_min,n3);
        aux_min = Math.min(aux_min, n4);

        double aux_max = 0;

        aux_max = Math.max(n1,n2);
        aux_max = Math.max(aux_max,n3);
        aux_max = Math.max(aux_min, n4);

        if(aux_min == n1){
        min1 = n1;

        aux_min = Math.min(n2,n3);
        aux_min = Math.min(aux_min,n4);

        min2 = aux_min;
        }
        if(aux_min == n2){
        min1 = n2;

        aux_min = Math.min(n1,n3);
        aux_min = Math.min(aux_min,n4);

        min2 = aux_min;
        }
        if(aux_min == n3){
        min1 = n3;

        aux_min = Math.min(n1,n2);
        aux_min = Math.min(aux_min,n4);

        min2 = aux_min;
        }
        if(aux_min == n4){
        min1 = n4;

        aux_min = Math.min(n1,n2);
        aux_min = Math.min(aux_min,n3);

        min2 = aux_min;
        }


        //max
        if(aux_max == n1){
        max1 = n1;

        aux_max = Math.max(n2,n3);
        aux_max = Math.max(aux_max,n4);

        max2 = aux_max;
        }
        if(aux_max == n2){
        max1 = n2;

        aux_max = Math.max(n1,n3);
        aux_max = Math.max(aux_max,n4);

        max2 = aux_max;
        }
        if(aux_max == n3){
        max1 = n3;

        aux_max = Math.max(n1,n2);
        aux_max = Math.max(aux_max,n4);

        max2 = aux_max;
        }
        if(aux_max == n4){
        max1 = n4;

        aux_max = Math.max(n1,n2);
        aux_max = Math.max(aux_max,n3);

        max2 = aux_max;
        }


        //System.out.println(+ String.format("%.2f",min1 ) + "; " + String.format("%.2f",min2 ) + "; " + String.format("%.2f",max2 ) + "; " + String.format("%.2f",max1 ));

        System.out.println(+min2 + " " + min1 + " " + max2 + " " + max1);
        
    }
}
