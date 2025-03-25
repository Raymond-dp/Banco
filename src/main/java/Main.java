import java.nio.file.Watchable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean notExit = true;
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        while (notExit) {
            System.out.println("-----------MENU_ADMIN-----------");
            System.out.println("1. Mostrar situacion de cuentas");
            System.out.println("2.Avanzar un mes");
            System.out.println("3.Avanzar un año");
            System.out.println("4. Salir ");
            System.out.println("------------------------------");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                banco.mostrarSituacion();
            }
            if (opcion == 2) {
                 System.out.print("Se avanza un mes...");
                banco.avanzarMes();
            }
            if (opcion == 3) {
                 System.out.print("Se avanza un año...");
                banco.avanzarAño();
            }
            if (opcion == 4) {
                notExit = false;
                System.out.println("Adios");

            }

        }
    }
}
