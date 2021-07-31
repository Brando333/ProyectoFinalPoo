package domain;

public class Cliente extends Usuario {

  /*Atributos*/
  private static int contadorId;
  private final int idCliente;

  /*Constructor*/
  public Cliente(String nombre, String dni, String usuario, String contraseña) {
    super(nombre, dni, usuario, contraseña);
    idCliente = ++contadorId;
  }

  @Override
  public String toString() {
    return "Cliente{" + super.toString() + "idCliente=" + idCliente + '}';
  }

}
