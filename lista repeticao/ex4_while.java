
public class ex4_while {

    public static void main(String args[]) {
        
        int a = 1000, b = 2000;
        
        int aux = 1000;
        while(aux <= 2000){
            if(aux % 2 == 0){
                System.out.println(aux);
            }
            aux++;
        }
    }
}
