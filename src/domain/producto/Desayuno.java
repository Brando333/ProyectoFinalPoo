package domain.producto;

public class Desayuno extends TipoProducto {

  public Desayuno() {
    super();
  }

  public static Desayuno getInstance() {
    return new Desayuno();
  }
}
