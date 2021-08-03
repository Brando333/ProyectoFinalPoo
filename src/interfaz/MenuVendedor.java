package interfaz;

import domain.Ventas;

public class MenuVendedor {

  //Las clases de Utileria no deberian poder instanciarse
  private MenuVendedor() {
  }

  public static void menuVendedor() {
    System.out.println("MENU");
    System.out.println("[1] MOSTRAR VENTAS");
    System.out.println("[2] MOSTRAR INVENTARIO");
    System.out.println("[3] MOSTRAR CLIENTES");
    System.out.println("[0] RETORNAR");
  }

  private static void mostrarVentas() {
    //mostrar ventas
    
 
    System.out.println("[0] Retornar");
  }

  private static void mostrarInventario() {
    //mostrar inventario -> nombre y precio
    System.out.println("[0] Retornar");
  }

  private static void mostrarClientes() {
    // Mostrar registro de clientes -> Datos, inversion

  }

}
