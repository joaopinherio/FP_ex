import java.util.Scanner;

public class ex9_comp_l2 {

    public static void main(String args[]) {
        
        double num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;

        Scanner in = new Scanner (System.in);

        //int aux = 0;
    
        num1 = extract_val(num1);
        num2 = extract_val(num2);
        num3 = extract_val(num3);
        num4 = extract_val(num4);
        num5 = extract_val(num5);

        System.out.println("menor numero " + lesser(num1, num2, num3, num4, num5));
        System.out.println("maior numero " + greater(num1, num2, num3, num4, num5));

        double menor = lesser(num1, num2, num3, num4, num5);
        double maior = greater(num1, num2, num3, num4, num5);

        double result = num1 + num2 + num3 + num4 + num5;
        result -= maior - menor;

        System.out.println("Media entre os numeros entre o maior e menor" + med(result));


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

    public static doulbe snd_lesser(double n1, double n2, double n3, double n4, double n5){
        
        
    
    }




    public static double greater (double n1, double n2, double n3, double n4, double n5){
        double G = n1;
        
        if(n2 > G)G = n2;
        if(n3 > G)G = n3;
        if(n4 > G)G = n4;
        if(n5 > G)G = n5;

        return G;
    }

    public static double med (double a){
        return a/3;
    }





}
