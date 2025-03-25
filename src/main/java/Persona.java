public class Persona {
  // Esto son atributos
  private String nombre;;
  // private double sueldo;
  private String id;
  private double sueldo;

  // esto es el contructor
  public Persona(String nombre, String id, double sueldo) {
    this.nombre = nombre;
    this.id = id;
    this.sueldo = sueldo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getId() {
    return id;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return "Nombre : " + nombre + "\n" + "Id : " + id + "\n" + "Sueldo : " + sueldo;
  }
}