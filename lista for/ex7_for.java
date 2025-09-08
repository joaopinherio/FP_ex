import java.util.Scanner;

public class ex7_for {

    public static void main(String args[]) {

        Scanner in = new Scanner (System.in);
        String frase = in.nextLine();

        //lembrar que ela da nota integral na resolucao das provas escritas exmp - bloco do for

        int count_vog = 0, count_word = 0;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A' || frase.charAt(i) == 'e' || frase.charAt(i) == 'E' || frase.charAt(i) == 'i' || frase.charAt(i) == 'I' || frase.charAt(i) == 'o' || frase.charAt(i) == 'O' || frase.charAt(i) == 'u' || frase.charAt(i) == 'U'){
                count_vog++;
            }
            if(frase.charAt(i) == ' ' && frase.charAt(i+1) != ' ') count_word++;

        }
        
        System.out.println("O numero de 'a(s)' na frase: " + count_vog);
        System.out.println("Numero de palavras na frase: " + count_word);
    }
}
