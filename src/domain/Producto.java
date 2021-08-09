package domain;

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

    /**
     * Constructor
     * / */
    /*Para productos con marca propia*/
    public Producto(String nombreProducto, String marcaProducto, double precioProducto, String unidad) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.marcaProducto = marcaProducto;
        idProducto = Long.toHexString(Integer.hashCode(++contadorProducto) * 3);//Crea un id
    }

    /*Para carnes, ya que estas no tienen marca*/
    public Producto(String nombreProducto, double precioProducto, String unidad) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        idProducto = Long.toHexString(Integer.hashCode(++contadorProducto) * 3);//Crea un id

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

    /**
     * toString()
     */
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", marcaProducto=" + marcaProducto + ", precioProducto=" + precioProducto + ", unidad=" + unidad + '}';
    }

}
