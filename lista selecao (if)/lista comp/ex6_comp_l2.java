import java.util.Scanner;

public class ex6_comp_l2 {
    public static void main(String args[]) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Preencha um valor intervalo entre (1;9999): ");
        int number = in.nextInt();   

        while(!(number > 0 && number <= 9999))
        {
            System.out.println("Digite um valor compativel (1;9999):");
            number = in.nextInt();  
        }

        int uni = ((number%100)%10);
        int dec = ((number%100) - uni);
        int cent = ((number%1000) - dec - uni)/10;
        int thou = (number - cent - dec - uni)/100;

        //System.out.println(+ thou + " " + cent + " " + dec + " " + uni);

        double test_s = (thou + cent)+ (dec + uni);
        double test_p = Math.sqrt(test_s);

        if( test_s != 55 && test_p != 3025){
            System.out.println("Seu numero nao possui a mesma caracteristica de 3025");
        }
        else{
            System.out.println("Seu numero eh compativel com 3025");
        }

    }
}
