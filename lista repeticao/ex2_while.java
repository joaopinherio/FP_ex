import java.util.Scanner;

public class ex2_while {

    public static void main(String args[]) {

        double hei_chico = 1.5, hei_ze =  1.1;

        int  count_y = 0;
        while(hei_ze < hei_chico){
            hei_chico += 0.2;
            hei_ze += 0.3;

            count_y++;
        }

        System.out.println(count_y);
    }


}
