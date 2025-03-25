import java.nio.file.Watchable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      boolean notExit=true;
        Scanner sc = new Scanner(System.in);
        while(notExit){
            System.out.println("Pulse -1 para salir");

            
            
            int opcion=sc.nextInt();
            
            if(opcion == -1){
                notExit=false;
                System.out.println("Adios");

            }
                
                
                }
    }
}
