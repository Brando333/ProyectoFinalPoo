package domain;

public class Vendedor extends Usuario {

  /*Atributos*/
  private static int contadorId;
  private final int idVendedor;

  /*Constructor*/
  public Vendedor(String nombre, String dni, String usuario, String contraseña) {
    super(nombre, dni, usuario, contraseña);
    idVendedor = ++contadorId;
  }

  /*toString()*/
  @Override
  public String toString() {
    return "Vendedor{" + super.toString() + "idVendedor=" + idVendedor + '}';
  }

}
