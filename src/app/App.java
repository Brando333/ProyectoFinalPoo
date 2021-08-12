package app;

import domain.cliente.Cliente;
import domain.producto.Producto;
import domain.cliente.Vendedor;
import static interfaz.MenuPrincipal.*;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static List<Producto> inventario = new ArrayList<>();

  public static List<Vendedor> vendedoresRegistrados = new ArrayList<>();
  public static List<Cliente> clientesRegistrados = new ArrayList<>();

  static {
    inventario = InventarioDefault.getDefaultInventario();
  }

  public static void main(String... brando) {
    menuPrincipal();
  }

}
