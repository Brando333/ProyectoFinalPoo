package domain.producto;

public class Producto {

  private static int contadorProducto = 0;
  /**
   * Atributos
   */

  private final String idProducto;
  private String nombreProducto;
  private String marcaProducto;
  private double precioProducto;
  private String unidad; // ejem: 1.5 kg  780 gr.  1.2 L.   etc
  private TipoProducto tipoProducto;//recive una subclase de la superclase{tipoProducto}
  private int cantidad;

  /**
   * Constructor
   */
  /*Para productos con marca propia*/
  public Producto(TipoProducto tipoProducto, String nombreProducto, String marcaProducto, double precioProducto, String unidad, int cantidad) {
    this.nombreProducto = nombreProducto;
    this.precioProducto = precioProducto;
    this.marcaProducto = marcaProducto;
    this.tipoProducto = tipoProducto;
    this.cantidad = cantidad;
    idProducto = Long.toHexString(Integer.hashCode(++contadorProducto) * 3);//Crea un id hexadecimal
  }

  /**
   * Constructor
   */
  /*Para carnes, ya que estas no tienen marca*/
  public Producto(TipoProducto tipoProducto, String nombreProducto, double precioProducto, String unidad, int cantidad) {
    this.nombreProducto = nombreProducto;
    this.precioProducto = precioProducto;
    this.tipoProducto = tipoProducto;
    this.cantidad = cantidad;
    idProducto = Long.toHexString(Integer.hashCode(++contadorProducto) * 3);//Crea un id hexadecimal

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

  public String getIdProducto() {
    return idProducto;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public String getMarcaProducto() {
    return nombreProducto;
  }

  public void setMarcaProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public TipoProducto getTipoProducto() {
    return tipoProducto;
  }

  /**
   * toString()
   */
  @Override
  public String toString() {
    return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", marcaProducto=" + marcaProducto + ", precioProducto=" + precioProducto + ", unidad=" + unidad + '}';
  }

  public String mostrarInfoAlCliente() {
    return String.format("%-4s", idProducto) + String.format("%-12s", nombreProducto) + String.format("%-12s", marcaProducto) + String.format("%-8s", precioProducto) + String.format("%-18s", unidad);
  }

  public String mostrarInfoAlVendedor() {
    return String.format("%-4s", idProducto) + String.format("%-12s", nombreProducto) + String.format("%-12s", marcaProducto) + String.format("%-8s", precioProducto) + String.format("%-18s", unidad) + String.format("%-18s", cantidad);
  }

}
