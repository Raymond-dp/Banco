public class Banco {
  private Cuenta c1;
  private Cuenta c2;
  private Cuenta c3;

  private double interes;
  private int mesesPasados;
  // inicializa todos los atributos

  public Banco() {
    Persona p1 = new Persona("Juan", "dfsf4324S", 1350);
    c1 = new Cuenta(p1);
    Persona p2 = new Persona("Pablo", "X324324S", 2300);
    c2 = new Cuenta(p2);
    Persona p3 = new Persona("Laura", "X3344324S", 1600);
    c3 = new Cuenta(p3);
    interes = 0.20;
    mesesPasados = 0;
    
  }

  public void mostrarSituacion() {
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
  }

  // aumneta un mes
  public void avanzarMes() {
    c1.ingresarSueldo();
    c2.ingresarSueldo();
    c3.ingresarSueldo();

    mesesPasados = mesesPasados + 1;
    if (mesesPasados == 12) {
      c1.intereses(interes);
      c2.intereses(interes);
      c3.intereses(interes);
    }
  }

  // aumenta una año
  public void avanzarAño() {
    c1.ingresar(12 * c1.getTitular().getSueldo());
    c2.ingresar(12 * c2.getTitular().getSueldo());
    c3.ingresar(12 * c3.getTitular().getSueldo());

    c1.intereses(interes);
    c2.intereses(interes);
    c3.intereses(interes);

  }

}