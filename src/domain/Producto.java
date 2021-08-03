package domain;

import java.util.stream.IntStream;

public class Producto {

  private static int contadorProducto = 0;
  /**
   * Atributos
   */

  private final int idProducto;
  private String nombreProducto;
  private double precioProducto;

  /**
   * Constructor
   */
  public Producto(String nombreProducto, double precioProducto) {
    this.nombreProducto = nombreProducto;
    this.precioProducto = precioProducto;

    idProducto = ++contadorProducto;
  }

  /**
   * Setters & Getters
   */
  public double getPrecioProducto() {
    return precioProducto;
  }

  public void setPrecioProducto(double precioProducto) {
    this.precioProducto = precioProducto;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  /**
   * toString()
   */
  @Override
  public String toString() {
    return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
  }

}
