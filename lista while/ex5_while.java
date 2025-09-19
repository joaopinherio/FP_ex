
public class ex5_while {

    public static void main(String args[]) {
        
        int a = 1000, b = 2000;
        
        int aux = 1000;
        while(aux <= 1999){
            if(aux % 11 == 5){
                System.out.println(aux);
            }
            aux++;
        }
    }
}
