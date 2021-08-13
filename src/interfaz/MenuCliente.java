package interfaz;

import java.util.Scanner;

public class MenuCliente {

  // Las clases de utileria no deberian tener constructores
  private MenuCliente() {
  }

  public static void menuCliente() {
    System.out.println("\n::Menu Principal");
    System.out.println("::Menu Cliente");
    int opcion;

    exitDo:
    do {
      System.out.println("[1] MOSTRAR INVENTARIO");
      System.out.println("[2] MOSTRAR OFERTAS DE DESCUENTO");
      System.out.println("[3] HACER COMPRA");
      System.out.println("[4] MOSTRAR CARRITO");
      System.out.println("[5] CANCELAR COMPRA");
      System.out.println("[6] EFECTUAR COMPRA");
      System.out.println("[0] RETORNAR");
      opcion = new Scanner(System.in).nextInt();

      switch (opcion) {
        case 1:

          break exitDo;

        case 2:

          break exitDo;

        case 3:

          break exitDo;

        case 4:

          break exitDo;
        case 5:

          break exitDo;
        case 6:

          break exitDo;

        case 0:
          MenuPrincipal.menuPrincipal();
          break exitDo;

        default:
          System.out.println("Ingrese una opcion valida");

      }
    } while (true);

  }

  private static void hacerCompraMenu() {

    // mostrar inventario
    String contraseñaDefault = "camote123";
    String userDefault = "Brando123";
    System.out.println("¿Que producto desea añadir al carrito?");
    String producto = new Scanner(System.in).next();

    System.out.println("¿Cuantos productos {$producto} desea añadir");

    System.out.println("[0] Retornar");
  }

  private static void mostrarCarrito() {
    // mostrar carrito
  }

  private static void cancelarCompraMenu() {

    // mostrar carrito
    System.out.println("¿Que producto desea cancelar?");

    System.out.println("[0] Retornar");

  }

  private static void efectuarCompra() {
    //
    System.out.println("Compra efectuada!!");

  }

}
