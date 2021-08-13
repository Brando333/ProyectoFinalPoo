package utileria;

import app.App;
import java.util.stream.Stream;

public class Utileria {

  //Las clases de utileraia no deberian ser instanciadas
  private Utileria() {
  }

  public static void mostarInventario(String productoABuscar, String elementosCabezera, String invocador) {

    // Si encontramos el tipo de producto, mostramos el subtitulo y su cabezera,
    // paraluego imprimir los productos de esa categoria
    if (tipoProductoExistente(productoABuscar)) {
      System.out.println("\n\n" + productoABuscar.toUpperCase() + ": ");

      // IMPRIME LA CABEZERA CON LOS PARAMETROS {elementosCabezera}
      System.out.println("\n" + elementosCabezera);

      // Muestra los productos
      /*
       * Si el invocador es el cliente, solo le muestra los productos que estan en el
       * stock
       */
      if (invocador.equals("Vendedor")) {
        App.inventario.stream()
            .filter(x -> x.getTipoProducto().getClass().getSimpleName().equals(productoABuscar))
            .forEach(x -> System.out.println(x.mostrarInfoAlVendedor()));
      }
    }

  }

  /**
   * @param TipoProducto
   * @return un booleano que indica si el producto existe en el inventario
   *
   * Retorna si el tipo de producto existe en el inventario
   *
   */
  private static boolean tipoProductoExistente(String productoABuscar) {
    return App.inventario.stream().anyMatch(e -> e.getTipoProducto().getClass().getSimpleName().equals(productoABuscar));
  }

  public static String formatoNombre(String nombre) {
    /**
     * brAndo CaldERON pueNTE -> Brando Calderon Puente
     */
    return Stream.of(nombre.toLowerCase().split("(?<=\\s+)"))
        .map(x -> x.replaceFirst("^.", x.substring(0, 1).toUpperCase())).reduce("", ( current, next ) -> current + next);
  }

}
