package domain.producto;

import domain.cliente.Cliente;

public class Ventas {

  /**
   * Atributos
   */
  private Cliente cliente;
  private Producto producto;

  /**
   * Constructor
   */
  public Ventas(Cliente cliente, Producto producto) {
    this.cliente = cliente;
    this.producto = producto;
  }

  /**
   * Setters % Getters
   */
  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  /**
   * toString()
   */
  @Override
  public String toString() {
    return "Ventas{" + "cliente=" + cliente + ", producto=" + producto + '}';
  }

}
