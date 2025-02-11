public class Cuenta {
  // Esto son atributos
  private double saldo;
  private Persona titular;

  // esto es el contructor
  public Cuenta(Persona aux) {
    titular = aux;
    // le asigno 100 al valor incial del saldo
    saldo = 100;
    System.out.println("Se ha creado la cuenta de " + titular.getNombre() + " con un sueldo " + titular.getSueldo());
  }

  public double getSaldo() {
    return saldo;
  }

  public Persona getTitular() {
    return titular;
  }

  public void ingresar(int cantidad) {
    saldo = saldo + cantidad;
    System.out.println(titular.getNombre() + " ingreso " + cantidad);
  }

  public void ingresarSueldo() {
    saldo = saldo + titular.getSueldo();
    System.out.println(titular.getNombre() + " ingreso su sueldo de  " + titular.getSueldo());
  }

  public void retirar(int cantidad) {
    saldo = saldo - cantidad;
    System.out.println(titular.getNombre() + " retiro " + cantidad);

  }

}