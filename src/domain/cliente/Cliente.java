package domain.cliente;

public class Cliente extends Usuario {

  /*Atributos*/
  private static int contadorId;
  private final int idCliente;
  private double montoIvertido;

  /*Constructor*/
  public Cliente(String nombre, String dni, String usuario, String contraseña) {
    super(nombre, dni, usuario, contraseña);
    idCliente = ++contadorId;
  }

  /**
   * Setters & Getters
   */
  public double getMontoIvertido() {
    return montoIvertido;
  }

  public void setMontoIvertido(double montoIvertido) {
    this.montoIvertido = montoIvertido;
  }

  @Override
  public String toString() {
    return "Cliente{" + super.toString() + "idCliente=" + idCliente + '}';
  }

}
