import java.util.Scanner;

public class ex6_for {

    public static void main(String args[]) {

        Scanner in = new Scanner (System.in);
        String frase = in.nextLine();

        //lembrar que ela da nota integral na resolucao das provas escritas exmp - bloco do for

        int count_a = 0;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A') count_a++;
        }
        
        System.out.println("O numero de 'a(s)' na frase" + count_a);
    }
}
