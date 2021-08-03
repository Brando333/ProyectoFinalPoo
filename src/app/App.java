package app;

import domain.Cliente;
import domain.Producto;
import domain.Vendedor;
import static interfaz.MenuPrincipal.*;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static List<Producto> inventario = new ArrayList<>();

  public static List<Vendedor> vendedoresRegistrados = new ArrayList<>();
  public static List<Cliente> clientesRegistrados = new ArrayList<>();


  public static void main(String... brando) {
    menuPrincipal();
  }

}
