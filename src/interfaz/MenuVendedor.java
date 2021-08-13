package interfaz;

import domain.producto.Abarrote;
import domain.producto.AguasBebidas;
import domain.producto.CarnesAvesPescados;
import domain.producto.Desayuno;
import domain.producto.Lacteos;
import domain.producto.Limpieza;
import domain.producto.Mascotas;
import domain.producto.TipoProducto;
import java.util.Scanner;
import utileria.Utileria;

public class MenuVendedor {

  //Las clases de Utileria no deberian poder instanciarse
  private MenuVendedor() {
  }

  public static void menuVendedor() {

    int opcion;
    exitDo:
    do {
      System.out.println("\n::Menu principal");
      System.out.println("::Menu vendedor");
      System.out.println("[1] MOSTRAR VENTAS");
      System.out.println("[2] MOSTRAR INVENTARIO");
      System.out.println("[3] MOSTRAR CLIENTES");
      System.out.println("[0] RETORNAR");
      opcion = new Scanner(System.in).nextInt();

      switch (opcion) {
        case 1:

          break exitDo;

        case 2:

          String elementosCabezera = String.format("%-4s", "ID") + String.format("%-30s", "Producto")
              + String.format("%-16s", "Marca") + String.format("%-8s", "Precio") + String.format("%-18s", "Unidad")
              + String.format("%-10s", "Cantidad");

          TipoProducto[] tiposProductos = {Abarrote.getInstance(), AguasBebidas.getInstance(), CarnesAvesPescados.getInstance(),
            Desayuno.getInstance(), Lacteos.getInstance(), Limpieza.getInstance(), Mascotas.getInstance()};

          for (TipoProducto tipoProducto : tiposProductos) {
            Utileria.mostarInventario(tipoProducto.getClass().getSimpleName(), elementosCabezera, "Vendedor");
          }

          break exitDo;

        case 3:

          break exitDo;

        case 0:
          MenuPrincipal.menuPrincipal();
          break exitDo;

        default:
          System.out.println("Ingrese una opcion valida");

      }
    } while (true);
  }

  private static void mostrarVentas() {
    //mostrar ventas

    System.out.println("[0] Retornar");
  }

  private static void mostrarClientes() {
    // Mostrar registro de clientes -> Datos, inversion

  }

}
