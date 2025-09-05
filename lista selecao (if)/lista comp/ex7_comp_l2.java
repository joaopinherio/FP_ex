
import java.util.Scanner;

public class ex7_comp_l2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Preencha um valor intervalo entre (1;9999): ");
        int number = in.nextInt();

        while (!(number > 0 && number <= 9999)) {
            System.out.println("Digite um valor compativel (1;9999):");
            number = in.nextInt();
        }

        int uni = ((number % 100) % 10);
        int dec = ((number % 100) - uni) / 10;
        int cent = ((number % 1000) - dec - uni) / 100;
        int thou = (number - cent - dec - uni) / 1000;

        //System.out.println(+thou + " " + cent + " " + dec + " " + uni);

        String test = thou + "" + cent + "" + dec + "" + uni;
        String test_inv = uni + "" + dec + "" + cent + "" + thou;

        System.out.println(test);
        System.out.println(test_inv);

        if (test.equals(test_inv)) {
            System.out.println("O numero inserido EH capicuo");
        } else {
            System.out.println("O numero inserido nao eh capicuo");
        }

    }
}
