package app;

import domain.Producto;
import java.util.Arrays;
import java.util.List;

public class InventarioDefault {


  /*
  new Producto("Leche", 4.20),
  new Producto("Fideo", 1.70),
  new Producto("Maizena", 1.70),
  new Producto("Carne roja", 3.70),
  new Producto("Pescado", 6.00),
  new Producto("Avena 3 ositos", 9.00),
  new Producto("Azúcar", 12.80),
  new Producto("Cereales", 9.90),
  new Producto("Sal Marina EMSAL", 2.30),
  
  
   */
  List<Producto> getDefaultInventario() {
    return Arrays.asList(new Producto("Leche", 4.20));
  }

}
