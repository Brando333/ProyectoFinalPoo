package app;

import domain.Cliente;
import domain.Vendedor;
import static interfaz.MenuPrincipal.*;
import java.util.ArrayList;

public class App {

  public static ArrayList<Vendedor> vendedoresRegistrados = new ArrayList<>();
  public static ArrayList<Cliente> clientesRegistrados = new ArrayList<>();

  public static void main(String... brando) {
    menuPrincipal();
  }

}
