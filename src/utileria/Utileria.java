package utileria;

import app.App;
import domain.cliente.Cliente;
import domain.cliente.Usuario;
import domain.producto.TipoProducto;
import java.util.stream.Stream;

public class Utileria {

  public static void mostrarHeaderInventario(String subititulo, String elementosCabezera, TipoProducto productoABuscar,
      Usuario invocador) throws UtileriaException {
    if (!elementosCabezera.contains(" ")) {
      throw new UtileriaException(
          "Solo se encontro un elemento de la cabezera, se esperaban más, delimitados por un espacio [E1 E2 E3 E4...]");
    }

    // Si encontramos el tipo de producto, mostramos el subtitulo y su cabezera,
    // paraluego imprimir los productos de esa categoria
    if (tipoProductoExistente(productoABuscar)) {
      System.out.println(subititulo.toUpperCase() + ": ");

      // IMPRIME LA CABEZERA CON LOS PARAMETROS {elementosCabezera}
      Stream.of(elementosCabezera.split("\\s+")).map(e -> formatoNombre(e)).map(e -> {
        if (e.contentEquals("Producto"))
          return "│" + String.format("%-12s", e) + "│";
        else if (e.contentEquals("Marca"))
          return String.format("%-12s", e) + "│";
        else // Precio Unidad
          return String.format("%" + (e.length() + 2) + "s", e) + "│";
      }).forEach(System.out::print);

      System.out.println("");

      // Muestra los productos
      /*
       * Si el invocador es el cliente, solo le muestra los productos que estan en el
       * stock
       */
      if (invocador.getClass().isInstance(Cliente.class.getClass())) {

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
  private static boolean tipoProductoExistente(TipoProducto tipo) {
    return App.inventario.stream().anyMatch(e -> e.getClass().isInstance(tipo));
  }

  public static String formatoNombre(String nombre) {
    /**
     * brAndo CaldERON pueNTE -> Brando Calderon Puente
     */
    return Stream.of(nombre.toLowerCase().split("(?<=\\s+)"))
        .map(x -> x.replaceFirst("^.", x.substring(0, 1).toUpperCase())).reduce("", ( current, next ) -> current + next);
  }

}
