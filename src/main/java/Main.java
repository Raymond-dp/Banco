
public class Main {
  public static void main(String[] args) {

    Persona p1 = new Persona("Juan", "X324324S", 50);
    Cuenta cuentaPrueba = new Cuenta(p1);

    cuentaPrueba.ingresar(20);
    cuentaPrueba.retirar(10);

    System.out.println(cuentaPrueba.getSaldo());

    cuentaPrueba.ingresarSueldo();
  }

}