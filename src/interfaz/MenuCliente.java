package interfaz;

public class MenuCliente {

  //Las clases de utileria no deberian tener constructores
  private MenuCliente() {
  }

  public static void menuCliente() {
    System.out.println("[1] MOSTRAR INVENTARIO");
    System.out.println("[2] MOSTRAR OFERTAS DE DESCUENTO");
    System.out.println("[3] HACER COMPRA");
    System.out.println("[4] MOSTRAR CARRITO");
    System.out.println("[5] CANCELAR COMPRA");
    System.out.println("[6] EFECTUAR COMPRA");
    System.out.println("[0] RETORNAR");
  }

  private static void mostrarInventario() {
    //MUESTRA INVENTARIO -> nombres del producto y precio
  }

  private static void hacerCompraMenu() {

    //mostrar inventario
    System.out.println("¿Que producto desea añadir al carrito?");

    System.out.println("¿Cuantos productos {$producto} desea añadir");

    System.out.println("[0] Retornar");
  }

  private static void mostrarCarrito() {
    //mostrar carrito
  }

  private static void cancelarCompraMenu() {

    //mostrar carrito
    System.out.println("¿Que producto desea cancelar?");

    System.out.println("[0] Retornar");

  }

  private static void efectuarCompra() {
//    
    System.out.println("Compra efectuada!!");

  }

}
