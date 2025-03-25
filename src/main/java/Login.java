import java.util.Scanner;

public class Login {
    private static final String USUARIO_CORRECTO = "admin";
    private static final String CONTRASEÑA_CORRECTA = "1234";
    private static final int INTENTOS_MAXIMOS = 5;

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        while (intentos < INTENTOS_MAXIMOS) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();

            if (validarCredenciales(usuario, contraseña)) {
                System.out.println("Bienvenido, " + usuario + "!");
                return;
            } else {
                intentos++;
                System.out.println("Credenciales incorrectas. Intentos restantes: " + (INTENTOS_MAXIMOS - intentos));
            }
        }

        System.out.println("Acceso bloqueado. Ha superado el número máximo de intentos.");
    }

    private boolean validarCredenciales(String usuario, String contraseña) {
        return USUARIO_CORRECTO.equals(usuario) && CONTRASEÑA_CORRECTA.equals(contraseña);
    }

   
}
