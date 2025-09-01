
import java.util.Scanner;

//original ex7 da comp de selecao

public class ex2 {

    public static void main(String args[]) {

        int number = get_num();

        String exn = reg_string(number);
        String inv_exn = inv_string(number);

        System.out.println(exn);
        System.out.println(inv_exn);

        compare(exn, inv_exn);

    }

    public static String reg_string(int num){
        
        int uni = ((num % 100) % 10);
        int dec = ((num % 100) - uni) / 10;
        int cent = ((num % 1000) - dec - uni) / 100;
        int thou = (num - cent - dec - uni) / 1000;

        return thou + "" + cent + "" + dec + "" + uni;
    }
    
    public static String inv_string(int num){
        
        int uni = ((num % 100) % 10);
        int dec = ((num % 100) - uni) / 10;
        int cent = ((num % 1000) - dec - uni) / 100;
        int thou = (num- cent - dec - uni) / 1000;

        return uni + "" + dec + "" + cent + "" + thou;
    }

    public static int get_num(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Preencha um valor intervalo de 4 digitos: ");
        int num = in.nextInt();

        while (!(num > 999 && num <= 9999)) {
            System.out.println("Digite um valor compativel (4 digitos):");
            num = in.nextInt();
        }

        return num;
    }

    public static void compare(String reg, String inv){

        if (reg.equals(inv)) {
            System.out.println("O numero inserido EH capicuo");
        } else {
            System.out.println("O numero inserido nao eh capicuo");
        }
    }


}
