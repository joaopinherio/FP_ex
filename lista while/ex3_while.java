import java.util.Scanner;

public class ex3_while {

    public static void main(String args[]) {

        System.out.println("O menor numero eh: " + lesser_while());
        System.out.println("O menor numero eh: " + greater_while());

    }

    public static int lesser_while(){
        int lesser = get_num();

        int count = 1;
        int aux = 0;
        while(count < 6){
            aux = get_num();
            if(aux < lesser){
                lesser = aux;
            }
            count++;
        }
        return lesser;
    }

    public static int greater_while(){
        int greater = get_num();

        int count = 1;
        int aux = 0;
        while(count < 6){
            aux = get_num();
            if(aux > greater){
                greater = aux;
            }
            count++;
        }
        return greater;
    }

    public static int get_num(){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de um numero inteiro: ");
        int num = in.nextInt();

        return num;
    }

}
