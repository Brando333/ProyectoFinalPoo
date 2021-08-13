package domain.producto;

public class Mascotas extends TipoProducto {

  public Mascotas() {
    super();
  }
  public static Mascotas getInstance() {
    return new Mascotas();
  }

}
