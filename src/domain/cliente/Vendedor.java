package domain.cliente;

import utileria.Utileria;

public class Vendedor extends Usuario {

  /*Atributos*/
  private static int contadorId;
  private final int idVendedor;

  /*Constructor*/
  public Vendedor(String nombre, String dni, String usuario, String contraseña) {
    super(nombre, dni, usuario, contraseña);
    idVendedor = ++contadorId;
  }

  /**
   * Este constructor solo nos sirve para poder declarar el metodo
   * {@code getInstance()} en el metodo {@code mostrarInventario()} de la clase Utileria
   *
   * @see Utileria
   */
  private Vendedor() {
    idVendedor = 0;
  }

  public static Vendedor getInstance() {
    return new Vendedor();

  }


  /*toString()*/
  @Override
  public String toString() {
    return "Vendedor{" + super.toString() + "idVendedor=" + idVendedor + '}';
  }

}
