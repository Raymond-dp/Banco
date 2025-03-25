import java.util.Scanner;

public class Bucles {

    public void trianguloRectangulo(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void piramide(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public void cuadradoHueco(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void trianguloInvertido(int n) {
        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public void rombo(int n) {
        if (n % 2 == 0) {
            System.out.println("El número debe ser impar.");
            return;
        }

        int mitad = n / 2;
        int i = 1;
        while (i <= mitad + 1) {
            int j = 1;
            while (j <= mitad + 1 - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

        i = mitad;
        while (i >= 1) {
            int j = 1;
            while (j <= mitad + 1 - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
