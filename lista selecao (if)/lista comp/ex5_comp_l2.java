import java.util.Scanner;

public class ex5_comp_l2 {

    public static void main(String args[]) {
        
        int month;

        Scanner in = new Scanner (System.in);
        
        System.out.println("Digite o numero correspondente ao mes que deseja incluir (1 a 12): ");
        month = in.nextInt();

        if(month > 12){
            System.out.println("Digite um numero compativel (1 a 12)");
            month = in.nextInt();
        }

        if(month == 1)System.out.println("Janeiro possui 31 dias");
        if(month == 2)System.out.println("fevereiro possui 28 dias");
        if(month == 3)System.out.println("marco possui 29 dias");
        if(month == 4)System.out.println("abril possui 30 dias");
        if(month == 5)System.out.println("maio possui 31 dias");
        if(month == 6)System.out.println("junho possui 30 dias");
        if(month == 7)System.out.println("julho possui 31 dias");
        if(month == 8)System.out.println("agosto possui 30 dias");
        if(month == 9)System.out.println("setembro possui 30 dias");
        if(month == 10)System.out.println("outubro possui 31 dias");
        if(month == 11)System.out.println("novembro possui 29 dias");
        if(month == 12)System.out.println("dezembro possui 31 dias");
        
    }
}
