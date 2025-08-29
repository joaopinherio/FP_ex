import java.util.Scanner;

public class ex9_comp_l2 {

    public static void main(String args[]) {
        
        double num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;

        Scanner in = new Scanner (System.in);
    
        num1 = extract_val(num1);
        num2 = extract_val(num2);
        num3 = extract_val(num3);
        num4 = extract_val(num4);
        num5 = extract_val(num5);

        System.out.println("menor numero " + lesser(num1, num2, num3, num4, num5));
        System.out.println("maior numero " + greater(num1, num2, num3, num4, num5));

        double menor = lesser(num1, num2, num3, num4, num5);
        double sec_menor = snd_lesser (menor, num1, num2, num3, num4, num5);
        double maior = greater(num1, num2, num3, num4, num5);

        System.out.println("segundo menor numero " + snd_lesser(menor, num1, num2, num3, num4, num5));

        System.out.println("Media entre os numeros sem o maior e menor" + med_rest(maior, menor, num1, num2, num3, num4, num5));

        System.out.println("Media entre os numeros sem o menor e segundo menor" + med_rest(menor, sec_menor, num1, num2, num3, num4, num5));


    }

    public static double med_rest(double G, double L, double n1, double n2, double n3, double n4, double n5){
        double result = (n1 + n2 + n3 + n4 + n5) - G - L;

        return result /= 3;
    }

    public static double extract_val(double a){
        Scanner in = new Scanner (System.in);

        int b = (int)a;
        System.out.println("Insira o valor de numero " +b);
        a = in.nextDouble();

        return a;
    }
    
    public static double lesser (double n1, double n2, double n3, double n4, double n5){
        double L = n1;
        
        if(n2 < L)L = n2;
        if(n3 < L)L = n3;
        if(n4 < L)L = n4;
        if(n5 < L)L = n5;

        return L;
    }

    public static double greater (double n1, double n2, double n3, double n4, double n5){
        double G = n1;
        
        if(n2 > G)G = n2;
        if(n3 > G)G = n3;
        if(n4 > G)G = n4;
        if(n5 > G)G = n5;

        return G;
    }

    public static double snd_lesser (double L, double n1, double n2, double n3, double n4, double n5){
        double L2 = n1;
        
        if(n1 != L && n1 < L2)L2 = n1;
        if(n2 != L && n2 < L2)L2 = n2;
        if(n3 != L && n3 < L2)L2 = n3;
        if(n4 != L && n4 < L2)L2 = n4;
        if(n5 != L && n5 < L2)L2 = n5;

        return L2;
    }

    


}
