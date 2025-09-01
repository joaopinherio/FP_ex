package trab_aula;

import java.util.Scanner;
import java.time.LocalDate;

public class ex_integrador {
    public static void main(String args[]) {
        
        LocalDate cdate = LocalDate.now();

        System.out.println(cdate);

        String dia_s = "dia", mes_s = "mes", ano_s = "ano";
        int dia = get_int(dia_s);
        int mes = get_int(mes_s);
        int ano = get_int(ano_s);

        String data_s = date_string(dia, mes, ano);

        System.out.println(data_s);

        System.out.println(signo(dia, mes));

        compare(data_s, cdate);
    }

    public static int get_int(String date) {
        Scanner in = new Scanner(System.in);

        System.out.println("numero do " + date + " de aniversario");
        int num = in.nextInt();

        return num;
    }

    public static String date_string(int dia, int mes, int ano){
        return ano + "-0" + mes + "-0" + dia;
    }

    public static String signo(int dia, int mes) {
        switch (mes) {
            case 1:
                if (dia >= 21)
                    return "Aquario";
                if (dia <= 20)
                    return "Capricornio";
                break;
        }
        return "error";
    }

    public static void compare(String reg, LocalDate inv){

        if (reg.equals(inv)) {
            System.out.println("A data inserida EH igual");
        } else {
            System.out.println("O data inserida nao eh igual");
        }
    }
}
