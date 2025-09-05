package trab_aula;
import java.time.temporal.ChronoUnit;

import java.time.MonthDay;
import java.util.Scanner;

public class ex_integrador {
    public static void main(String args[]) {
        
        //LocalDate cdate = LocalDate.now();
        //MonthDay cdate_md = MonthDay.now();

        //System.out.println(cdate_s);

        String dia_s = "dia", mes_s = "mes", ano_s = "ano";

        int dia = get_int(dia_s);
        int mes = get_int(mes_s);
        int ano = get_int(ano_s);

        String date_b = "" + date_birth(dia, mes, ano);
        String date_tod = "" + MonthDay.now();

        Local

        int dias_dif = 

        System.out.println(date_b);

        System.out.println(MonthDay.now());

        System.out.println(signo(dia, mes));

        compare(date_b, date_tod);
    }

    public static int get_int(String date) {
        Scanner in = new Scanner(System.in);

        System.out.println("numero do " + date + " de aniversario");
        int num = in.nextInt();

        return num;
    }

    public static MonthDay date_birth(int dia, int mes, int ano){
        return MonthDay.of(mes,dia);
    }

    public static int diff_d(){
        
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

    public static void compare(String tod, String birth){
        if (tod.equals(birth)){
            System.out.println("Parabens pelo seu aniversario!");
        } else {
            System.out.println("Hoje nao eh seu aniversario");
        }
    }
}
